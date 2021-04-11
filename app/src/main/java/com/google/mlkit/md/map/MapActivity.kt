package com.google.mlkit.md.map

import android.annotation.SuppressLint
import android.location.Location
import android.location.LocationListener
import android.location.LocationManager
import android.os.Bundle
import android.util.Log
import android.view.FrameMetrics
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.material.snackbar.Snackbar
import com.google.common.base.Objects
import com.google.mlkit.md.LiveBarcodeScanningActivity
import com.google.mlkit.md.R
import com.google.mlkit.md.barcodedetection.BarcodeComfirmDialog
import com.google.mlkit.md.barcodedetection.BarcodeField
import com.google.mlkit.md.barcodedetection.BarcodeResultFragment
import com.google.mlkit.md.barcodedetection.InputNutritionInfo
import com.google.mlkit.md.camera.WorkflowModel
import kotlinx.android.synthetic.main.activity_maps.*

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap
    lateinit var thisView : View
    private var workflowModel: WorkflowModel? = null
    private var currentWorkflowState: WorkflowModel.WorkflowState? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        thisView = window.decorView
        val mapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)

        btn_map.setOnClickListener {
            locationdialog.show(supportFragmentManager)
        }

    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @SuppressLint("MissingPermission")
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        locationManager()
        mMap.isMyLocationEnabled = true
    }

    var oriLocation : Location? = null

    fun locationManager(){
        val locationManager = getSystemService(LOCATION_SERVICE) as LocationManager?
        var isGPSEnabled = locationManager!!.isProviderEnabled(LocationManager.GPS_PROVIDER)
        var isNetworkEnabled = locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER)

        if (!(isGPSEnabled || isNetworkEnabled))
            Snackbar.make(thisView, "目前無開啟任何定位功能", Snackbar.LENGTH_LONG).show()
        else
            try {
                if (isGPSEnabled ) {
                    locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER,
                            0L, 0f, locationListener)
                    oriLocation = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER)
                }
                else if (isNetworkEnabled) {
                    locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER,
                            0L, 0f, locationListener)
                    oriLocation = locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVIDER)
                }
            } catch(ex: SecurityException) {
                Log.d("myTag", "Security Exception, no location available")
            }
        if(oriLocation != null) {
            drawMarker()
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(LatLng(oriLocation!!.latitude, oriLocation!!.longitude), 14.0f))
        }
    }

    val locationListener = object : LocationListener {
        override fun onLocationChanged(location: Location) {
            if(oriLocation == null) {
                oriLocation = location
                drawMarker()
            }
            mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(LatLng(location.latitude, location.longitude), 14.0f))

        }
        override fun onStatusChanged(provider: String?, status: Int, extras: Bundle?) {
        }

    }

    fun drawMarker(){
        var lntLng = LatLng(oriLocation!!.latitude, oriLocation!!.longitude)
        var lntLng_A = LatLng(25.1328,121.5026)
        var lntLng_B = LatLng(25.1118,121.5295)
        var lntLng_C = LatLng(25.1186,121.5293)
        mMap.addMarker(MarkerOptions().position(lntLng).title("Current Position"))
        mMap.addMarker(MarkerOptions().position(lntLng_A).title("Beitou Market"))
        mMap.addMarker(MarkerOptions().position(lntLng_B).title("Shidong Market"))
        mMap.addMarker(MarkerOptions().position(lntLng_C).title("Tianmu JASONS Market "))
    }

    private fun setUpWorkflowModel() {
        workflowModel = ViewModelProviders.of(this).get(WorkflowModel::class.java)

        // Observes the workflow state changes, if happens, update the overlay view indicators and
        // NucAction.camera preview state.
        workflowModel!!.workflowState.observe(this, Observer { workflowState ->
            if (workflowState == null || Objects.equal(currentWorkflowState, workflowState)) {
                return@Observer
            }
            currentWorkflowState = workflowState


            when (workflowState) {
                WorkflowModel.WorkflowState.Delivering -> {
                    deliverdiglog.show(supportFragmentManager)
                }

            }
        })

    }

}