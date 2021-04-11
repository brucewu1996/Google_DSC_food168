package com.google.mlkit.md.map;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u001bJ\u0012\u0010\u001d\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\u0010\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u000bH\u0017J\b\u0010\"\u001a\u00020\u001bH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/google/mlkit/md/map/MapsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "()V", "currentWorkflowState", "Lcom/google/mlkit/md/camera/WorkflowModel$WorkflowState;", "locationListener", "Landroid/location/LocationListener;", "getLocationListener", "()Landroid/location/LocationListener;", "mMap", "Lcom/google/android/gms/maps/GoogleMap;", "oriLocation", "Landroid/location/Location;", "getOriLocation", "()Landroid/location/Location;", "setOriLocation", "(Landroid/location/Location;)V", "thisView", "Landroid/view/View;", "getThisView", "()Landroid/view/View;", "setThisView", "(Landroid/view/View;)V", "workflowModel", "Lcom/google/mlkit/md/camera/WorkflowModel;", "drawMarker", "", "locationManager", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onMapReady", "googleMap", "setUpWorkflowModel", "app_debug"})
public final class MapsActivity extends androidx.appcompat.app.AppCompatActivity implements com.google.android.gms.maps.OnMapReadyCallback {
    private com.google.android.gms.maps.GoogleMap mMap;
    public android.view.View thisView;
    private com.google.mlkit.md.camera.WorkflowModel workflowModel;
    private com.google.mlkit.md.camera.WorkflowModel.WorkflowState currentWorkflowState;
    @org.jetbrains.annotations.Nullable()
    private android.location.Location oriLocation;
    @org.jetbrains.annotations.NotNull()
    private final android.location.LocationListener locationListener = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.view.View getThisView() {
        return null;
    }
    
    public final void setThisView(@org.jetbrains.annotations.NotNull()
    android.view.View p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
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
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap googleMap) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.location.Location getOriLocation() {
        return null;
    }
    
    public final void setOriLocation(@org.jetbrains.annotations.Nullable()
    android.location.Location p0) {
    }
    
    public final void locationManager() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.location.LocationListener getLocationListener() {
        return null;
    }
    
    public final void drawMarker() {
    }
    
    private final void setUpWorkflowModel() {
    }
    
    public MapsActivity() {
        super();
    }
}