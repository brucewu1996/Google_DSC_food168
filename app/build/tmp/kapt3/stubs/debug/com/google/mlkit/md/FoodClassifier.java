package com.google.mlkit.md;

import java.lang.System;

/**
 * Demonstrates the object detection and custom classification workflow using NucAction.camera preview.
 * Modeled after LiveObjectDetectionActivity.java
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0002\u001f B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u0013H\u0014J\b\u0010\u001a\u001a\u00020\u0013H\u0014J\b\u0010\u001b\u001a\u00020\u0013H\u0014J\b\u0010\u001c\u001a\u00020\u0013H\u0002J\b\u0010\u001d\u001a\u00020\u0013H\u0002J\b\u0010\u001e\u001a\u00020\u0013H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/google/mlkit/md/FoodClassifier;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/view/View$OnClickListener;", "()V", "cameraSource", "Lcom/google/mlkit/md/camera/CameraSource;", "currentWorkflowState", "Lcom/google/mlkit/md/camera/WorkflowModel$WorkflowState;", "graphicOverlay", "Lcom/google/mlkit/md/camera/GraphicOverlay;", "preview", "Lcom/google/mlkit/md/camera/CameraSourcePreview;", "promptChip", "Lcom/google/android/material/chip/Chip;", "promptChipAnimator", "Landroid/animation/AnimatorSet;", "workflowModel", "Lcom/google/mlkit/md/camera/WorkflowModel;", "onClick", "", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onPause", "onResume", "setUpWorkflowModel", "startCameraPreview", "stopCameraPreview", "Companion", "Compare", "app_debug"})
public final class FoodClassifier extends androidx.appcompat.app.AppCompatActivity implements android.view.View.OnClickListener {
    private com.google.mlkit.md.camera.CameraSource cameraSource;
    private com.google.mlkit.md.camera.CameraSourcePreview preview;
    private com.google.mlkit.md.camera.GraphicOverlay graphicOverlay;
    private com.google.android.material.chip.Chip promptChip;
    private android.animation.AnimatorSet promptChipAnimator;
    private com.google.mlkit.md.camera.WorkflowModel workflowModel;
    private com.google.mlkit.md.camera.WorkflowModel.WorkflowState currentWorkflowState;
    private static final java.lang.String TAG = "foodclassifier";
    private static final java.lang.String CUSTOM_MODEL_PATH = "custom_models/food101_InceptionV3_uint8_0331.tflite";
    @org.jetbrains.annotations.NotNull()
    public static final com.google.mlkit.md.FoodClassifier.Companion Companion = null;
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
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    private final void startCameraPreview() {
    }
    
    private final void stopCameraPreview() {
    }
    
    private final void setUpWorkflowModel() {
    }
    
    public FoodClassifier() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004\u00a8\u0006\u0007"}, d2 = {"Lcom/google/mlkit/md/FoodClassifier$Compare;", "", "()V", "max", "Lcom/google/mlkit/md/productsearch/Predict;", "a", "b", "app_debug"})
    public static final class Compare {
        @org.jetbrains.annotations.NotNull()
        public static final com.google.mlkit.md.FoodClassifier.Compare INSTANCE = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.mlkit.md.productsearch.Predict max(@org.jetbrains.annotations.NotNull()
        com.google.mlkit.md.productsearch.Predict a, @org.jetbrains.annotations.NotNull()
        com.google.mlkit.md.productsearch.Predict b) {
            return null;
        }
        
        private Compare() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/google/mlkit/md/FoodClassifier$Companion;", "", "()V", "CUSTOM_MODEL_PATH", "", "TAG", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}