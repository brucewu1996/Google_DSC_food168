package com.example.nucaction.activities

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.example.nucaction.databinding.ActivitySplashBinding
import com.example.nucaction.firebase.FirestoreClass

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_splash)

        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

//        val typeface: Typeface =
//            Typeface.createFromAsset(assets, "carbon bl.ttf")
//        binding.tvAppName.typeface = typeface

        Handler().postDelayed({
            val currentUserID = FirestoreClass().getCurrentUserID()

            if (currentUserID.isNotEmpty()) {
                startActivity(Intent(this@SplashActivity, MainActivity::class.java))
            } else {
                startActivity(Intent(this@SplashActivity, IntroActivity::class.java))
            }
            finish()
        }, 2500)
    }
}