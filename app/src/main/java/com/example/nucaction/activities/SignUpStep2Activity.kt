package com.example.nucaction.activities

import android.os.Bundle
import com.example.nucaction.R
import com.example.nucaction.databinding.ActivitySignUpStep2Binding

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