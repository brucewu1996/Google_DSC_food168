package com.google.mlkit.md.barcodedetection;

import java.lang.System;

/**
 * A processor to run the barcode detector.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u001eB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0003H\u0002J\u001c\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0014J\u0014\u0010\u0014\u001a\u00020\u00152\n\u0010\u0016\u001a\u00060\u0017j\u0002`\u0018H\u0014J&\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0015J\b\u0010\u001d\u001a\u00020\u0015H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/google/mlkit/md/barcodedetection/BarcodeProcessor;", "Lcom/google/mlkit/md/camera/FrameProcessorBase;", "", "Lcom/google/mlkit/vision/barcode/Barcode;", "graphicOverlay", "Lcom/google/mlkit/md/camera/GraphicOverlay;", "workflowModel", "Lcom/google/mlkit/md/camera/WorkflowModel;", "(Lcom/google/mlkit/md/camera/GraphicOverlay;Lcom/google/mlkit/md/camera/WorkflowModel;)V", "cameraReticleAnimator", "Lcom/google/mlkit/md/camera/CameraReticleAnimator;", "scanner", "Lcom/google/mlkit/vision/barcode/BarcodeScanner;", "createLoadingAnimator", "Landroid/animation/ValueAnimator;", "barcode", "detectInImage", "Lcom/google/android/gms/tasks/Task;", "image", "Lcom/google/mlkit/vision/common/InputImage;", "onFailure", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onSuccess", "inputInfo", "Lcom/google/mlkit/md/InputInfo;", "results", "stop", "Companion", "app_debug"})
public final class BarcodeProcessor extends com.google.mlkit.md.camera.FrameProcessorBase<java.util.List<? extends com.google.mlkit.vision.barcode.Barcode>> {
    private final com.google.mlkit.vision.barcode.BarcodeScanner scanner = null;
    private final com.google.mlkit.md.camera.CameraReticleAnimator cameraReticleAnimator = null;
    private final com.google.mlkit.md.camera.WorkflowModel workflowModel = null;
    private static final java.lang.String TAG = "BarcodeProcessor";
    @org.jetbrains.annotations.NotNull()
    public static final com.google.mlkit.md.barcodedetection.BarcodeProcessor.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.google.android.gms.tasks.Task<java.util.List<com.google.mlkit.vision.barcode.Barcode>> detectInImage(@org.jetbrains.annotations.NotNull()
    com.google.mlkit.vision.common.InputImage image) {
        return null;
    }
    
    @androidx.annotation.MainThread()
    @java.lang.Override()
    protected void onSuccess(@org.jetbrains.annotations.NotNull()
    com.google.mlkit.md.InputInfo inputInfo, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.google.mlkit.vision.barcode.Barcode> results, @org.jetbrains.annotations.NotNull()
    com.google.mlkit.md.camera.GraphicOverlay graphicOverlay) {
    }
    
    private final android.animation.ValueAnimator createLoadingAnimator(com.google.mlkit.md.camera.GraphicOverlay graphicOverlay, com.google.mlkit.vision.barcode.Barcode barcode) {
        return null;
    }
    
    @java.lang.Override()
    protected void onFailure(@org.jetbrains.annotations.NotNull()
    java.lang.Exception e) {
    }
    
    @java.lang.Override()
    public void stop() {
    }
    
    public BarcodeProcessor(@org.jetbrains.annotations.NotNull()
    com.google.mlkit.md.camera.GraphicOverlay graphicOverlay, @org.jetbrains.annotations.NotNull()
    com.google.mlkit.md.camera.WorkflowModel workflowModel) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/google/mlkit/md/barcodedetection/BarcodeProcessor$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}