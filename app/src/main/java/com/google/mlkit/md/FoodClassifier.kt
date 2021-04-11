package com.google.mlkit.md

import android.animation.AnimatorInflater
import android.animation.AnimatorSet
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.OnClickListener
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.google.android.material.chip.Chip
import com.google.common.base.Objects
import com.google.mlkit.md.barcodedetection.BarcodeComfirmDialog
import com.google.mlkit.md.barcodedetection.InputNutritionInfo
import com.google.mlkit.md.camera.CameraSource
import com.google.mlkit.md.camera.CameraSourcePreview
import com.google.mlkit.md.camera.GraphicOverlay
import com.google.mlkit.md.camera.WorkflowModel
import com.google.mlkit.md.camera.WorkflowModel.WorkflowState
import com.google.mlkit.md.objectdetection.ClassifierComfirmDialog
import com.google.mlkit.md.objectdetection.Food
import com.google.mlkit.md.objectdetection.FoodClassiferFragment
import com.google.mlkit.md.objectdetection.ProminentObjectProcessor
import com.google.mlkit.md.productsearch.Predict
import java.io.IOException

/** Demonstrates the object detection and custom classification workflow using NucAction.camera preview.
 *  Modeled after LiveObjectDetectionActivity.java */
class FoodClassifier : AppCompatActivity(), OnClickListener {

    private var cameraSource: CameraSource? = null
    private var preview: CameraSourcePreview? = null
    private var graphicOverlay: GraphicOverlay? = null
    private var promptChip: Chip? = null
    private var promptChipAnimator: AnimatorSet? = null
    private var workflowModel: WorkflowModel? = null
    private var currentWorkflowState: WorkflowState? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_live_object)
        preview = findViewById(R.id.camera_preview)
        graphicOverlay = findViewById<GraphicOverlay>(R.id.camera_preview_graphic_overlay).apply {
            setOnClickListener(this@FoodClassifier)
            cameraSource = CameraSource(this)
        }
        promptChip = findViewById(R.id.bottom_prompt_chip)
        promptChipAnimator =
                (AnimatorInflater.loadAnimator(this, R.animator.bottom_prompt_chip_enter) as AnimatorSet).apply {
                    setTarget(promptChip)
                }
        findViewById<View>(R.id.close_button).setOnClickListener(this)

        setUpWorkflowModel()
    }

    override fun onResume() {
        super.onResume()

        workflowModel?.markCameraFrozen()
        currentWorkflowState = WorkflowState.NOT_STARTED
        cameraSource?.setFrameProcessor(ProminentObjectProcessor(graphicOverlay!!, workflowModel!!, CUSTOM_MODEL_PATH))
        workflowModel?.setWorkflowState(WorkflowState.DETECTING)
    }

    override fun onPause() {
        super.onPause()
        currentWorkflowState = WorkflowState.NOT_STARTED
        stopCameraPreview()
    }

    override fun onDestroy() {
        super.onDestroy()
        cameraSource?.release()
        cameraSource = null
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.close_button -> onBackPressed()
        }
    }

    private fun startCameraPreview() {
        val cameraSource = this.cameraSource ?: return
        val workflowModel = this.workflowModel ?: return
        if (!workflowModel.isCameraLive) {
            try {
                workflowModel.markCameraLive()
                preview?.start(cameraSource)
            } catch (e: IOException) {
                Log.e(TAG, "Failed to start NucAction.camera preview!", e)
                cameraSource.release()
                this.cameraSource = null
            }
        }
    }

    private fun stopCameraPreview() {
        if (workflowModel?.isCameraLive == true) {
            workflowModel!!.markCameraFrozen()
            preview?.stop()
        }
    }


    private fun setUpWorkflowModel() {
        workflowModel = ViewModelProviders.of(this).get(WorkflowModel::class.java).apply {

            // Observes the workflow state changes, if happens, update the overlay view indicators and
            // NucAction.camera preview state.
            workflowState.observe(this@FoodClassifier, Observer { workflowState ->
                if (workflowState == null || Objects.equal(currentWorkflowState, workflowState)) {
                    return@Observer
                }
                currentWorkflowState = workflowState
                Log.d(TAG, "Current workflow state: ${workflowState.name}")

                val wasPromptChipGone = promptChip!!.visibility == View.GONE

                when (workflowState) {
                    WorkflowState.DETECTING, WorkflowState.DETECTED,WorkflowState.NOT_STARTED,WorkflowState.CONFIRMING -> {
                        promptChip?.visibility = View.VISIBLE
                        promptChip?.setText(
                                if (workflowState == WorkflowState.CONFIRMING)
                                    R.string.prompt_hold_camera_steady
                                else
                                    R.string.prompt_point_at_a_bird
                        )
                        startCameraPreview()
                    }
                    WorkflowState.CONFIRMED -> {
                        promptChip?.visibility = View.VISIBLE
                        promptChip?.setText(R.string.prompt_searching)
                        stopCameraPreview()
                        workflowModel?.onSearchButtonClicked()
                    }
                    WorkflowState.SEARCHING -> {
                        promptChip?.visibility = View.GONE
                        stopCameraPreview()
                    }
                    WorkflowState.SEARCHED -> {
                        stopCameraPreview()
                    }
                    WorkflowState.RECORDED -> {
                        promptChip?.visibility = View.GONE
                        stopCameraPreview()
                        ClassifierComfirmDialog.show(supportFragmentManager)
                    }
                    WorkflowState.RECORD_BY_USER -> {
                        promptChip?.visibility = View.GONE
                        stopCameraPreview()
                        InputNutritionInfo.show(supportFragmentManager)
                        //RecordBarcodeByUserFragment.show(supportFragmentManager)
                    }
                    else -> promptChip?.visibility = View.GONE
                }

                val shouldPlayPromptChipEnteringAnimation = wasPromptChipGone && promptChip?.visibility == View.VISIBLE
                if (shouldPlayPromptChipEnteringAnimation && promptChipAnimator?.isRunning == false) {
                    promptChipAnimator?.start()
                }
            })

            // Observes changes on the object to search, if happens, show detected object labels as
            // product search results.
            objectToSearch.observe(this@FoodClassifier, Observer { detectObject ->
                val foodlist: List<Predict> = detectObject.labels.map { label ->
                    Predict(label.text,label.index,label.confidence)
                }
                val max_confidence_food = foodlist.reduce(Compare::max)
                val food  = Food(label = max_confidence_food.text,value = max_confidence_food.confidence)
                FoodClassiferFragment.show(supportFragmentManager, food)
            })

        }
    }
    //find the predict result with max confidence
    internal object Compare {
        fun max(a: Predict, b: Predict): Predict {
            return if (a.confidence > b.confidence) a else b
        }
    }
    companion object {
        private const val TAG = "foodclassifier"
        private const val CUSTOM_MODEL_PATH = "custom_models/food101_InceptionV3_uint8_0331.tflite"
    }
}
