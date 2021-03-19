package com.example.androidcamera.activities

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.androidcamera.R
import kotlinx.android.synthetic.main.activity_home.*
import java.util.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btnDatePicker.setOnClickListener { view ->
            clickDatePicker(view)
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
                //pop-up window after selection
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