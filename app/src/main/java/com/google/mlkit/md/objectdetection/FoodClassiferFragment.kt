package com.google.mlkit.md.objectdetection

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.ViewModelProviders
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.mlkit.md.R
import com.google.mlkit.md.camera.WorkflowModel

class FoodClassiferFragment : BottomSheetDialogFragment(), View.OnClickListener {


    override fun onCreateView(
            layoutInflater: LayoutInflater,
            viewGroup: ViewGroup?,
            bundle: Bundle?
    ): View {
        val view = layoutInflater.inflate(R.layout.classifier_bottom_sheet, viewGroup)
        val arguments = arguments
        val food: Food = arguments?.getParcelable<Food>(ARG_classifier_LIST) as Food
        val labelView: TextView = view.findViewById(R.id.classifier_label)
        //val valueView: TextView = view.findViewById(R.id.classifier_value)

        //pass barcode value
        //labelView.text = food.label
        labelView.text = "Edamame"
        //valueView.text = food.value.toString()

        val btn_confirm : Button = view.findViewById(R.id.classifier_btn_confirm)
        val btn_input_nutrition_info: Button = view.findViewById(R.id.classifier_btn_nutrition_input)

        btn_confirm.setOnClickListener(this)
        btn_input_nutrition_info.setOnClickListener(this)

        return view
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.classifier_btn_confirm -> {
                activity?.let {
                    // Back to working state after the bottom sheet is dismissed.
                    ViewModelProviders.of(it).get(WorkflowModel::class.java).setWorkflowState(WorkflowModel.WorkflowState.RECORDED)
                }
                getDialog()?.dismiss()
            }
            R.id.classifier_btn_nutrition_input ->{
                activity?.let {
                    // Back to working state after the bottom sheet is dismissed.
                    ViewModelProviders.of(it).get(WorkflowModel::class.java).setWorkflowState(WorkflowModel.WorkflowState.RECORD_BY_USER)
                }
                getDialog()?.dismiss()
            }

        }
    }

    companion object {
        private const val TAG = "FoodClassifierClassifier"
        private const val ARG_classifier_LIST = "arg_classifier_list"

        fun show(fragmentManager: FragmentManager, food: Food) {
            val foodClassifer = FoodClassiferFragment()
            foodClassifer.arguments = Bundle().apply {
                putParcelable(ARG_classifier_LIST, food)
            }
            foodClassifer.show(fragmentManager, TAG)
        }
        fun dismiss(fragmentManager: FragmentManager) {
            (fragmentManager.findFragmentByTag(TAG) as FoodClassiferFragment?)?.dismiss()
        }
    }
}