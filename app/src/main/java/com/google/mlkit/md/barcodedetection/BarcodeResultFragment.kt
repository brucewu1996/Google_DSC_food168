package com.google.mlkit.md.barcodedetection

import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.ViewModelProviders
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.mlkit.md.R
import com.google.mlkit.md.camera.WorkflowModel
import com.google.mlkit.md.camera.WorkflowModel.WorkflowState


/** Displays the bottom sheet to present barcode fields contained in the detected barcode.  */
class BarcodeResultFragment : BottomSheetDialogFragment(), View.OnClickListener {


    override fun onCreateView(
        layoutInflater: LayoutInflater,
        viewGroup: ViewGroup?,
        bundle: Bundle?
    ): View {
        val view = layoutInflater.inflate(R.layout.barcode_bottom_sheet, viewGroup)
        val arguments = arguments
        val barcode: BarcodeField = arguments?.getParcelable<BarcodeField>(ARG_BARCODE_FIELD_LIST) as BarcodeField
        val labelView: TextView = view.findViewById(R.id.barcode_field_label)
        val valueView: TextView = view.findViewById(R.id.barcode_field_value)

        //pass barcode value
        labelView.text = barcode.label
        valueView.text = barcode.value

        val btn_barcode_check : Button = view.findViewById(R.id.barcode_field_btn_barcode_check)
        val btn_input_nutrition_info: Button = view.findViewById(R.id.barcode_field_btn_input_nutrition_info)

        btn_barcode_check.setOnClickListener(this)
        btn_input_nutrition_info.setOnClickListener(this)

        return view
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.barcode_field_btn_barcode_check -> {
                activity?.let {
                    // Back to working state after the bottom sheet is dismissed.
                    ViewModelProviders.of(it).get(WorkflowModel::class.java).setWorkflowState(WorkflowState.RECORDED)
                }
                getDialog()?.dismiss()
            }
            R.id.barcode_field_btn_input_nutrition_info ->{
                activity?.let {
                    // Back to working state after the bottom sheet is dismissed.
                    ViewModelProviders.of(it).get(WorkflowModel::class.java).setWorkflowState(WorkflowState.RECORD_BY_USER)
                }
                getDialog()?.dismiss()
            }

        }
    }

    companion object {

        private const val TAG = "BarcodeResultFragment"
        private const val ARG_BARCODE_FIELD_LIST = "arg_barcode_field_list"

        fun show(fragmentManager: FragmentManager, barcode: BarcodeField) {
            val barcodeResultFragment = BarcodeResultFragment()
            barcodeResultFragment.arguments = Bundle().apply {
                putParcelable(ARG_BARCODE_FIELD_LIST, barcode)
            }
            barcodeResultFragment.show(fragmentManager, TAG)
        }
        fun dismiss(fragmentManager: FragmentManager) {
            (fragmentManager.findFragmentByTag(TAG) as BarcodeResultFragment?)?.dismiss()
        }
    }
}