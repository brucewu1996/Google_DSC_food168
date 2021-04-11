package com.google.mlkit.md.objectdetection

import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.ViewModelProviders
import com.google.mlkit.md.R
import com.google.mlkit.md.camera.WorkflowModel

class ClassifierComfirmDialog : DialogFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val inflater: LayoutInflater = this.getLayoutInflater()
        val view: View = inflater.inflate(R.layout.classifier_confirm, null)

        val confirm_btn: Button = view.findViewById(R.id.barcode_confirmed_btn)

        confirm_btn.setOnClickListener {
            dismiss()
        }
        return view
    }

    override fun onStart() {
        super.onStart()
        dialog?.window?.setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT)
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return super.onCreateDialog(savedInstanceState)
    }

    override fun onDismiss(dialogInterface: DialogInterface) {
        activity?.let {
            // Back to working state after the bottom sheet is dismissed.
            ViewModelProviders.of(it).get(WorkflowModel::class.java).setWorkflowState(WorkflowModel.WorkflowState.DETECTING)
        }
        super.onDismiss(dialogInterface)
    }
    companion object {
        private const val TAG = "ClassifierComfirmDialog"

        val barcodeComfirm = ClassifierComfirmDialog()
        fun show(supportFragmentManager: FragmentManager) {
            barcodeComfirm.show(supportFragmentManager, TAG)
        }
    }
}

