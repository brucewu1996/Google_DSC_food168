package com.example.nucaction.activities

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import androidx.annotation.RequiresApi
import com.example.nucaction.R
import com.example.nucaction.database.*
import com.example.nucaction.databinding.ActivityMainBinding
import com.example.nucaction.utils.Utils
import com.google.android.material.bottomnavigation.BottomNavigationView
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var camera_bottom_navigation : BottomNavigationView
    private lateinit var binding: ActivityMainBinding

    private val healthyDiet = HealthyDietModel(
        1,
        "male",
        25,
        55,
        160,
        2400.0,
        60.0,
        720.0,
        100.0,
        100.0,
        240.0,
        100.0,
        240.0,
        24.0,
        10.0
    )


    private val foodData = FoodScanModel(
        1,
        "onion_rings",
        106.0,
        10.59,
        4.71,
        8.24,
        4.7,
        2.35,
        6.0,
        0.0,
        0.0,
        0.0
    )

    @RequiresApi(Build.VERSION_CODES.O)
    private var user1 = DiaryRecordModel(
        1,
        Calendar.getInstance().toString(),
        0,
        1
    )

    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val rootView = LayoutInflater.from(this).inflate(R.layout.activity_main, null)
        binding = ActivityMainBinding.bind(rootView)

        setContentView(binding.root)

        camera_bottom_navigation = findViewById<BottomNavigationView>(R.id.camera_bottom_navigation)
        camera_bottom_navigation.selectedItemId = R.id.action_barcode_scan
        camera_bottom_navigation.setOnNavigationItemSelectedListener(this.listener)

        val activity = this@MainActivity

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        }

        //Google Map activity layout
        binding.btnFindNutrition.setOnClickListener {
            val intent = Intent()
            intent.setClass(this, MapsActivity::class.java)
            startActivity(intent)
        }

        //Show date of now
        renderTodayDate()

        //Select date btn
        binding.btnDatePicker.setOnClickListener { view ->
            clickDatePicker(view)
        }

        //main page: Progress Bar
        foodScanImportNutrition(healthyDiet, foodData)

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

    @SuppressLint("SetTextI18n")
    private fun foodScanImportNutrition(healthyDiet: HealthyDietModel, foodData: FoodScanModel) {

        //TODO: nutrition calculator formula
        //energy
        binding.progressBarEnergy.progress = foodData.energy.toInt()
        binding.progressBarTextProtein.text = (healthyDiet.energy-foodData.energy).toString()+" LEFT"

        //protein
        binding.progressBarProtein.progress = foodData.protein.toInt()
        binding.progressBarTextProtein.text = (healthyDiet.protein-foodData.protein).toString()+" LEFT"

        //fat
        binding.progressBarFat.progress = foodData.total_lipid.toInt()
        binding.progressBarTextFat.text = (healthyDiet.total_lipid-foodData.total_lipid).toString()+" LEFT"

        //carbohydrate
        binding.progressBarCarbohydrate.progress = foodData.carbohydrate.toInt()
        binding.progressBarTextCarbohydrate.text = (healthyDiet.carbohydrate-foodData.carbohydrate).toString()+" LEFT"

        //Dietary fiber
        binding.progressBarDietaryFiber.progress = foodData.fiber.toInt()
        binding.progressBarTextDietaryFiber.text = (healthyDiet.fiber-foodData.fiber).toString()+" LEFT"

        //sugar
        binding.progressBarSugar.progress = foodData.sugar.toInt()
        binding.progressBarTextSugar.text = (healthyDiet.sugar-foodData.sugar).toString()+" LEFT"

        //na
        binding.progressBarNa.progress = foodData.na.toInt()
        binding.progressBarTextNa.text = (healthyDiet.Na-foodData.na).toString()+" LEFT"

        //Saturated fatty acids
        binding.progressBarSaturatedFattyAcids.progress = foodData.saturated_fatty_acids.toInt()
        binding.progressBarTextSaturatedFattyAcids.text = (healthyDiet.saturated_fatty_acids-foodData.saturated_fatty_acids).toString()+" LEFT"

        //Trans fatty acids
        binding.progressBarTransFattyAcids.progress = foodData.trans_fatty_acids.toInt()
        binding.progressBarTextTransFattyAcids.text = (healthyDiet.trans_fatty_acids-foodData.trans_fatty_acids).toString()+" LEFT"

        //Cholesterol
        binding.progressBarCholesterol.progress = foodData.cholesterol.toInt()
        binding.progressBarTextCholesterol.text = (healthyDiet.cholesterol-foodData.cholesterol).toString()+" LEFT"
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun renderTodayDate() {
        var current = LocalDateTime.now()
        val formatter = DateTimeFormatter.ofPattern("EE, MMMM dd")
        val formatted = current.format(formatter)

        binding.btnDatePicker.text = formatted
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun clickDatePicker(view: View) {
        val myCalender = Calendar.getInstance()
        val year = myCalender.get(Calendar.YEAR)
        val month = myCalender.get(Calendar.MONTH)
        val day = myCalender.get(Calendar.DAY_OF_MONTH)

        val dpd = DatePickerDialog(
            this,
            DatePickerDialog.OnDateSetListener { View, selectedYear, selectedMonth, selectedDayofMonth ->
                //format date
                var modifySelectedMonth: String = (selectedMonth + 1).toString()
                var modifySelectedDateofMonth: String = (selectedDayofMonth).toString()

                if ((selectedMonth.toInt() + 1) < 10) {
                    modifySelectedMonth = "0$modifySelectedMonth"
                }
                if (selectedDayofMonth < 10) {
                    modifySelectedDateofMonth = "0$modifySelectedDateofMonth"
                }

                val string = "$selectedYear-$modifySelectedMonth-$modifySelectedDateofMonth"

                val date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE)
                val formatter = DateTimeFormatter.ofPattern("EE, MMMM dd")
                val formatted = date.format(formatter)

                binding.btnDatePicker.text = formatted
            }, year, month, day
        )
        dpd.datePicker.setMaxDate(Date().time)
        dpd.show()
    }
}
