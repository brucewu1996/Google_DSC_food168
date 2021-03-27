package com.example.androidcamera.activities

import android.os.Bundle
import android.text.TextUtils
import android.view.WindowManager
import android.widget.Toast
import com.example.androidcamera.R
import com.example.androidcamera.databinding.ActivitySignUpBinding
import com.example.androidcamera.firebase.FirestoreClass
import com.example.androidcamera.models.User
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class SignUpActivity : BaseActivity() {

    private lateinit var binding: ActivitySignUpBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_sign_up)

        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        setupActionBar()


        binding.btnSignUp.setOnClickListener {
//            val intent = Intent()
//            intent.setClass(this@SignUpActivity, SignUpStep2Activity::class.java)
//            startActivity(intent)
            registerUser()
        }
    }

    private fun setupActionBar() {
        setSupportActionBar(binding.toolbarSignUpActivity)

        val actionBar = supportActionBar
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)
            actionBar.setHomeAsUpIndicator(R.drawable.ic_black_color_back_24dp)
        }

        binding.toolbarSignUpActivity.setNavigationOnClickListener { onBackPressed() }
    }

    private fun registerUser() {
        val firstName: String = binding.etFirstName.text.toString().trim { it <= ' ' }
        val lastName: String = binding.etLastName.text.toString().trim { it <= ' ' }
        val email: String = binding.etEmail.text.toString().trim { it <= ' ' }
        val password: String = binding.etPassword.text.toString().trim { it <= ' ' }
        val weight: Double = binding.etWeight.text.toString().toDouble()
        val height: Double = binding.etHeight.text.toString().toDouble()
        val status: String = binding.etStatus.text.toString().trim { it <= ' ' }

        if (validateForm(firstName, lastName, email, password)) {
            showProgressDialog(resources.getString(R.string.please_wait))
            FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(
                    OnCompleteListener<AuthResult> { task ->

                        if (task.isSuccessful) {

                            val firebaseUser: FirebaseUser = task.result!!.user!!
                            val registeredEmail = firebaseUser.email!!

                            val user = User(
                                firebaseUser.uid, firstName, lastName, registeredEmail, weight, height, status
                            )

                            FirestoreClass().registerUser(this@SignUpActivity, user)

                        } else {
                            Toast.makeText(
                                this@SignUpActivity,
                                task.exception!!.message,
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    })
        }
    }

    private fun validateForm(
        firstName: String,
        lastName: String,
        email: String,
        password: String,
    ): Boolean {
        return when {
            TextUtils.isEmpty(firstName) -> {
                showErrorSnackBar("Please enter first name.")
                false
            }
            TextUtils.isEmpty(lastName) -> {
                showErrorSnackBar("Please enter last name.")
                false
            }
            TextUtils.isEmpty(email) -> {
                showErrorSnackBar("Please enter email.")
                false
            }
            TextUtils.isEmpty(password) -> {
                showErrorSnackBar("Please enter password.")
                false
            }
            else -> {
                true
            }
        }
    }

    fun userRegisteredSuccess() {
        Toast.makeText(
            this@SignUpActivity,
            "You have successfully registered.",
            Toast.LENGTH_SHORT
        ).show()

        hideProgressDialog()
        FirebaseAuth.getInstance().signOut()
        finish()
    }
}