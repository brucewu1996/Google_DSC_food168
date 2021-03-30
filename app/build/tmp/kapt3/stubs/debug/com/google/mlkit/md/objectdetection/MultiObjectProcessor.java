package com.google.mlkit.md.objectdetection;

import java.lang.System;

/**
 * A processor to run object detector in multi-objects mode.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 )2\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001)B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\u001c\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0014J\u0014\u0010\u001a\u001a\u00020\u001b2\n\u0010\u001c\u001a\u00060\u001dj\u0002`\u001eH\u0014J&\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0015J\u0016\u0010#\u001a\u00020\u001b2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0018\u0010%\u001a\u00020&2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\'\u001a\u00020\u0003H\u0002J\b\u0010(\u001a\u00020\u001bH\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/google/mlkit/md/objectdetection/MultiObjectProcessor;", "Lcom/google/mlkit/md/camera/FrameProcessorBase;", "", "Lcom/google/mlkit/vision/objects/DetectedObject;", "graphicOverlay", "Lcom/google/mlkit/md/camera/GraphicOverlay;", "workflowModel", "Lcom/google/mlkit/md/camera/WorkflowModel;", "customModelPath", "", "(Lcom/google/mlkit/md/camera/GraphicOverlay;Lcom/google/mlkit/md/camera/WorkflowModel;Ljava/lang/String;)V", "cameraReticleAnimator", "Lcom/google/mlkit/md/camera/CameraReticleAnimator;", "confirmationController", "Lcom/google/mlkit/md/objectdetection/ObjectConfirmationController;", "detector", "Lcom/google/mlkit/vision/objects/ObjectDetector;", "objectDotAnimatorArray", "Landroid/util/SparseArray;", "Lcom/google/mlkit/md/objectdetection/ObjectDotAnimator;", "objectSelectionDistanceThreshold", "", "detectInImage", "Lcom/google/android/gms/tasks/Task;", "image", "Lcom/google/mlkit/vision/common/InputImage;", "onFailure", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onSuccess", "inputInfo", "Lcom/google/mlkit/md/InputInfo;", "results", "removeAnimatorsFromUntrackedObjects", "detectedObjects", "shouldSelectObject", "", "visionObject", "stop", "Companion", "app_debug"})
public final class MultiObjectProcessor extends com.google.mlkit.md.camera.FrameProcessorBase<java.util.List<? extends com.google.mlkit.vision.objects.DetectedObject>> {
    private final com.google.mlkit.md.objectdetection.ObjectConfirmationController confirmationController = null;
    private final com.google.mlkit.md.camera.CameraReticleAnimator cameraReticleAnimator = null;
    private final int objectSelectionDistanceThreshold = 0;
    private final com.google.mlkit.vision.objects.ObjectDetector detector = null;
    private final android.util.SparseArray<com.google.mlkit.md.objectdetection.ObjectDotAnimator> objectDotAnimatorArray = null;
    private final com.google.mlkit.md.camera.WorkflowModel workflowModel = null;
    private final java.lang.String customModelPath = null;
    private static final java.lang.String TAG = "MultiObjectProcessor";
    @org.jetbrains.annotations.NotNull()
    public static final com.google.mlkit.md.objectdetection.MultiObjectProcessor.Companion Companion = null;
    
    @java.lang.Override()
    public void stop() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected com.google.android.gms.tasks.Task<java.util.List<com.google.mlkit.vision.objects.DetectedObject>> detectInImage(@org.jetbrains.annotations.NotNull()
    com.google.mlkit.vision.common.InputImage image) {
        return null;
    }
    
    @androidx.annotation.MainThread()
    @java.lang.Override()
    protected void onSuccess(@org.jetbrains.annotations.NotNull()
    com.google.mlkit.md.InputInfo inputInfo, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.google.mlkit.vision.objects.DetectedObject> results, @org.jetbrains.annotations.NotNull()
    com.google.mlkit.md.camera.GraphicOverlay graphicOverlay) {
    }
    
    private final void removeAnimatorsFromUntrackedObjects(java.util.List<? extends com.google.mlkit.vision.objects.DetectedObject> detectedObjects) {
    }
    
    private final boolean shouldSelectObject(com.google.mlkit.md.camera.GraphicOverlay graphicOverlay, com.google.mlkit.vision.objects.DetectedObject visionObject) {
        return false;
    }
    
    @java.lang.Override()
    protected void onFailure(@org.jetbrains.annotations.NotNull()
    java.lang.Exception e) {
    }
    
    public MultiObjectProcessor(@org.jetbrains.annotations.NotNull()
    com.google.mlkit.md.camera.GraphicOverlay graphicOverlay, @org.jetbrains.annotations.NotNull()
    com.google.mlkit.md.camera.WorkflowModel workflowModel, @org.jetbrains.annotations.Nullable()
    java.lang.String customModelPath) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/google/mlkit/md/objectdetection/MultiObjectProcessor$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}