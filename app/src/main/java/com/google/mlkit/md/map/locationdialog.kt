package com.google.mlkit.md.map

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
import kotlinx.android.synthetic.main.location_info.*

class locationdialog : DialogFragment(), View.OnClickListener {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val inflater: LayoutInflater = this.getLayoutInflater()
        val view: View = inflater.inflate(R.layout.location_info, null)

        val btn_one : Button = view.findViewById(R.id.btn_location_one)
        val btn_two: Button = view.findViewById(R.id.btn_location_two)
        val btn_three: Button = view.findViewById(R.id.btn_location_three)

        btn_one.setOnClickListener(this)
        btn_two.setOnClickListener(this)
        btn_three.setOnClickListener(this)


        return view
    }

    override fun onStart() {
        super.onStart()
        dialog?.window?.setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT)
    }

     override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_location_one -> {
                activity?.let {
                    // Back to working state after the bottom sheet is dismissed.
                    deliverdiglog.show(childFragmentManager)
                }
            }
            R.id.btn_location_two ->{
                activity?.let {
                    // Back to working state after the bottom sheet is dismissed.
                    deliverdiglog.show(childFragmentManager)
                }
            }
            R.id.btn_location_three ->{
                activity?.let {
                    // Back to working state after the bottom sheet is dismissed.
                    deliverdiglog.show(childFragmentManager)
                }
            }

        }
    }

    companion object {
        private const val TAG = "locationdialogshow"

        val locationdialog = locationdialog()
        fun show(supportFragmentManager: FragmentManager) {
            locationdialog.show(supportFragmentManager, TAG)
        }
    }
}

