package com.example.nucaction.activities

import android.app.DatePickerDialog
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.ActionBar
import androidx.databinding.DataBindingUtil
import com.example.nucaction.R
import com.example.nucaction.databinding.ActivityMainBinding
import com.example.nucaction.utils.Utils
import com.google.android.material.bottomnavigation.BottomNavigationView
import java.util.*

class MainActivity : AppCompatActivity() {


    lateinit var camera_bottom_navigation : BottomNavigationView

    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding : ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        setContentView(binding.root)

        camera_bottom_navigation = findViewById<BottomNavigationView>(R.id.camera_bottom_navigation)

        camera_bottom_navigation.selectedItemId = R.id.action_barcode_scan
        camera_bottom_navigation.setOnNavigationItemSelectedListener(this.listener)
        val activity = this@MainActivity


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        }

        //sign in change page

        binding.btnDatePicker.setOnClickListener { view ->
            clickDatePicker(view)
        }

    }

    override fun onResume() {
        super.onResume()
        if (!Utils.allPermissionsGranted(this)) {
            Utils.requestRuntimePermissions(this)
        }
    }


    private var listener = object : BottomNavigationView.OnNavigationItemSelectedListener {
        val activity = this@MainActivity
        override fun onNavigationItemSelected(item: MenuItem): Boolean {
            when (item.itemId) {
                R.id.action_barcode_scan -> {
                    activity.startActivity(Intent(activity, BarcodeActivity::class.java))
                }
                R.id.action_object_detection -> {
                    activity.startActivity(Intent(activity, FoodClassifierActivity::class.java))
                }
            }
            return true
        }
    }

    private fun clickDatePicker(view: View) {
        val myCalender = Calendar.getInstance()
        val year = myCalender.get(Calendar.YEAR)
        val month = myCalender.get(Calendar.MONTH)
        val day = myCalender.get(Calendar.DAY_OF_MONTH)

        val dpd = DatePickerDialog(
            this,
            DatePickerDialog.OnDateSetListener { View, selectedYear, selectedMonth, selectedDayofMonth ->
                Toast.makeText(
                    applicationContext,
                    "You picked $selectedMonth $selectedDayofMonth, $selectedYear ",
                    Toast.LENGTH_SHORT
                ).show()
            }, year, month, day
        )
        dpd.datePicker.setMaxDate(Date().time)
        dpd.show()
    }
}
