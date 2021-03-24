package com.example.androidcamera.activities

import android.app.DatePickerDialog
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowInsets
import android.view.WindowManager
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.ActionBar
import com.example.androidcamera.R
import com.example.androidcamera.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import java.util.*

//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    lateinit var toolbar: ActionBar

    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        } else {
            window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }
//        binding.coverBtnNext.setOnClickListener {
//            val intent = Intent(this, CameraActivity::class.java)
//            startActivity(intent)
//        }
//
//        binding.btnDatePicker.setOnClickListener { view ->
//            clickDatePicker(view)
//        }

        //nav
        toolbar = supportActionBar!!
        val bottomNavigation: BottomNavigationView = binding.navigationView

        val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_scan -> {

                    return@OnNavigationItemSelectedListener true
                }
                R.id.navigation_home -> {

                    return@OnNavigationItemSelectedListener true
                }
                R.id.navigation_profile -> {

                    return@OnNavigationItemSelectedListener true
                }
            }
            false
        }

        fun onCreate(savedInstanceState: Bundle?) {
            // ...
            bottomNavigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
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
