package com.example.androidcamera.activities

import android.app.DatePickerDialog
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.ActionBar
import androidx.fragment.app.Fragment
import com.example.androidcamera.HomeFragment
import com.example.androidcamera.R
import com.example.androidcamera.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    lateinit var toolbar: ActionBar

    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

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
        val bottomNavigation: BottomNavigationView = findViewById(R.id.navigationView)

        //fragment setting
        class FragmentHome : Fragment(R.layout.fragment_home)
    }

    private fun addFragment(f: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.fragment_container_view, f)
        transaction.commit()
    }

    private fun replaceFragment(f : Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container_view, f)
        transaction.commit()
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
