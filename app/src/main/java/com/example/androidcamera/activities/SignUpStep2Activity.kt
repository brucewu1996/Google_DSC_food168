package com.example.androidcamera.activities

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.androidcamera.R
import com.example.androidcamera.databinding.ActivitySignUpStep2Binding
import java.util.*

class SignUpStep2Activity : BaseActivity() {

    private lateinit var binding: ActivitySignUpStep2Binding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySignUpStep2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        setupActionBar()

    }

    private fun setupActionBar() {
        setSupportActionBar(binding.toolbarSignUpStep2Activity)

        val actionBar = supportActionBar
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)
            actionBar.setHomeAsUpIndicator(R.drawable.ic_black_color_back_24dp)
        }

        binding.toolbarSignUpStep2Activity.setNavigationOnClickListener { onBackPressed() }
    }
}