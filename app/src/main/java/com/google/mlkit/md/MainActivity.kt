/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.mlkit.md

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.databinding.DataBindingUtil
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.mlkit.md.databinding.ActivityMainBinding
import com.google.mlkit.md.map.MapsActivity
import kotlinx.android.synthetic.main.activity_main.*

/** Entry activity to select the detection mode.  */
class MainActivity : AppCompatActivity() {


    override fun onCreate(bundle: Bundle?) {
        super.onCreate(bundle)

        val binding : ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        setContentView(binding.root)

        camera_bottom_navigation.selectedItemId = R.id.action_barcode_scan
        camera_bottom_navigation.setOnNavigationItemSelectedListener(this.listener)
        val activity = this@MainActivity

        //activity.startActivity(Intent(activity, LiveBarcodeScanningActivity::class.java))
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true)
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
                    activity.startActivity(Intent(activity, LiveBarcodeScanningActivity::class.java))
                }
                R.id.action_object_detection -> {
                    activity.startActivity(Intent(activity, FoodClassifier::class.java))
                }
                R.id.action_google_map ->{
                    activity.startActivity(Intent(activity,MapsActivity::class.java))
                }
            }
            return true
        }
    }


    /*
    private inner class ModeItemAdapter internal constructor(private val detectionModes: Array<DetectionMode>) :
        RecyclerView.Adapter<ModeItemAdapter.ModeItemViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModeItemViewHolder {
            return ModeItemViewHolder(
                LayoutInflater.from(parent.context)
                    .inflate(
                        R.layout.detection_mode_item, parent, false
                    )
            )
        }

        override fun onBindViewHolder(modeItemViewHolder: ModeItemViewHolder, position: Int) =
            modeItemViewHolder.bindDetectionMode(detectionModes[position])

        override fun getItemCount(): Int = detectionModes.size

        private inner class ModeItemViewHolder internal constructor(view: View) : RecyclerView.ViewHolder(view) {

            private val titleView: TextView = view.findViewById(R.id.mode_title)
            private val subtitleView: TextView = view.findViewById(R.id.mode_subtitle)

            internal fun bindDetectionMode(detectionMode: DetectionMode) {
                titleView.setText(detectionMode.titleResId)
                subtitleView.setText(detectionMode.subtitleResId)
                itemView.setOnClickListener {
                    val activity = this@MainActivity
                    when (detectionMode) {
                        DetectionMode.ODT_LIVE ->
                            activity.startActivity(Intent(activity, LiveObjectDetectionActivity::class.java))
                        DetectionMode.ODT_STATIC -> Utils.openImagePicker(activity)
                        DetectionMode.BARCODE_LIVE ->
                            activity.startActivity(Intent(activity, LiveBarcodeScanningActivity::class.java))
                        DetectionMode.CUSTOM_MODEL_LIVE ->
                            activity.startActivity(Intent(activity, CustomModelObjectDetectionActivity::class.java))
                    }
                }
            }
        }
    }

     */
}
