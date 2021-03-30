package com.google.mlkit.md;

import java.lang.System;

/**
 * Demonstrates the object detection and custom classification workflow using NucAction.camera preview.
 * Modeled after LiveObjectDetectionActivity.java
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 52\u00020\u00012\u00020\u0002:\u00015B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010$\u001a\u00020%H\u0016J\u0010\u0010&\u001a\u00020%2\u0006\u0010\'\u001a\u00020\u0006H\u0016J\u0012\u0010(\u001a\u00020%2\b\u0010)\u001a\u0004\u0018\u00010*H\u0014J\b\u0010+\u001a\u00020%H\u0014J\b\u0010,\u001a\u00020%H\u0014J\b\u0010-\u001a\u00020%H\u0014J\b\u0010.\u001a\u00020%H\u0002J\b\u0010/\u001a\u00020%H\u0002J\b\u00100\u001a\u00020%H\u0002J\u0010\u00101\u001a\u00020%2\u0006\u00102\u001a\u00020\u000eH\u0002J\u0010\u00103\u001a\u00020%2\u0006\u00102\u001a\u00020\u000eH\u0002J\b\u00104\u001a\u00020%H\u0002R\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00066"}, d2 = {"Lcom/google/mlkit/md/CustomModelObjectDetectionActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/view/View$OnClickListener;", "()V", "bottomSheetBehavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/view/View;", "bottomSheetScrimView", "Lcom/google/mlkit/md/productsearch/BottomSheetScrimView;", "bottomSheetTitleView", "Landroid/widget/TextView;", "cameraSource", "Lcom/google/mlkit/md/camera/CameraSource;", "currentWorkflowState", "Lcom/google/mlkit/md/camera/WorkflowModel$WorkflowState;", "flashButton", "graphicOverlay", "Lcom/google/mlkit/md/camera/GraphicOverlay;", "objectThumbnailForBottomSheet", "Landroid/graphics/Bitmap;", "preview", "Lcom/google/mlkit/md/camera/CameraSourcePreview;", "productRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "promptChip", "Lcom/google/android/material/chip/Chip;", "promptChipAnimator", "Landroid/animation/AnimatorSet;", "searchButton", "Lcom/google/android/material/floatingactionbutton/ExtendedFloatingActionButton;", "searchButtonAnimator", "settingsButton", "slidingSheetUpFromHiddenState", "", "workflowModel", "Lcom/google/mlkit/md/camera/WorkflowModel;", "onBackPressed", "", "onClick", "view", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onResume", "setUpBottomSheet", "setUpWorkflowModel", "startCameraPreview", "stateChangeInAutoSearchMode", "workflowState", "stateChangeInManualSearchMode", "stopCameraPreview", "Companion", "app_debug"})
public final class CustomModelObjectDetectionActivity extends androidx.appcompat.app.AppCompatActivity implements android.view.View.OnClickListener {
    private com.google.mlkit.md.camera.CameraSource cameraSource;
    private com.google.mlkit.md.camera.CameraSourcePreview preview;
    private com.google.mlkit.md.camera.GraphicOverlay graphicOverlay;
    private android.view.View settingsButton;
    private android.view.View flashButton;
    private com.google.android.material.chip.Chip promptChip;
    private android.animation.AnimatorSet promptChipAnimator;
    private com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton searchButton;
    private android.animation.AnimatorSet searchButtonAnimator;
    private com.google.mlkit.md.camera.WorkflowModel workflowModel;
    private com.google.mlkit.md.camera.WorkflowModel.WorkflowState currentWorkflowState;
    private com.google.android.material.bottomsheet.BottomSheetBehavior<android.view.View> bottomSheetBehavior;
    private com.google.mlkit.md.productsearch.BottomSheetScrimView bottomSheetScrimView;
    private androidx.recyclerview.widget.RecyclerView productRecyclerView;
    private android.widget.TextView bottomSheetTitleView;
    private android.graphics.Bitmap objectThumbnailForBottomSheet;
    private boolean slidingSheetUpFromHiddenState = false;
    private static final java.lang.String TAG = "CustomModelODActivity";
    private static final java.lang.String CUSTOM_MODEL_PATH = "custom_models/Food101_inceptionV3.tflite";
    @org.jetbrains.annotations.NotNull()
    public static final com.google.mlkit.md.CustomModelObjectDetectionActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    private final void startCameraPreview() {
    }
    
    private final void stopCameraPreview() {
    }
    
    private final void setUpBottomSheet() {
    }
    
    private final void setUpWorkflowModel() {
    }
    
    private final void stateChangeInAutoSearchMode(com.google.mlkit.md.camera.WorkflowModel.WorkflowState workflowState) {
    }
    
    private final void stateChangeInManualSearchMode(com.google.mlkit.md.camera.WorkflowModel.WorkflowState workflowState) {
    }
    
    public CustomModelObjectDetectionActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/google/mlkit/md/CustomModelObjectDetectionActivity$Companion;", "", "()V", "CUSTOM_MODEL_PATH", "", "TAG", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}