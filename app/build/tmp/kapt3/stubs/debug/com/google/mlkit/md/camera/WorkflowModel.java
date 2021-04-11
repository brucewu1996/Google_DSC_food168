package com.google.mlkit.md.camera;

import java.lang.System;

/**
 * View model for handling application workflow based on NucAction.camera preview.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001-B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\"H\u0007J\u0006\u0010#\u001a\u00020 J\u0006\u0010$\u001a\u00020 J\b\u0010%\u001a\u00020 H\u0007J\u001c\u0010&\u001a\u00020 2\u0006\u0010\'\u001a\u00020\u00062\f\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)J\u0010\u0010+\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\u001dH\u0007J\u0010\u0010,\u001a\u00020 2\u0006\u0010\'\u001a\u00020\u0006H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0011@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u000f\u00a8\u0006."}, d2 = {"Lcom/google/mlkit/md/camera/WorkflowModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "confirmedObject", "Lcom/google/mlkit/md/objectdetection/DetectedObjectInfo;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "detectedBarcode", "Landroidx/lifecycle/MutableLiveData;", "Lcom/google/mlkit/vision/barcode/Barcode;", "getDetectedBarcode", "()Landroidx/lifecycle/MutableLiveData;", "<set-?>", "", "isCameraLive", "()Z", "objectIdsToSearch", "Ljava/util/HashSet;", "", "objectToSearch", "getObjectToSearch", "searchedObject", "Lcom/google/mlkit/md/productsearch/SearchedObject;", "getSearchedObject", "workflowState", "Lcom/google/mlkit/md/camera/WorkflowModel$WorkflowState;", "getWorkflowState", "confirmingObject", "", "progress", "", "markCameraFrozen", "markCameraLive", "onSearchButtonClicked", "onSearchCompleted", "detectedObject", "products", "", "Lcom/google/mlkit/md/productsearch/Product;", "setWorkflowState", "triggerSearch", "WorkflowState", "app_debug"})
public final class WorkflowModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.google.mlkit.md.camera.WorkflowModel.WorkflowState> workflowState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.google.mlkit.md.objectdetection.DetectedObjectInfo> objectToSearch = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.google.mlkit.md.productsearch.SearchedObject> searchedObject = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.google.mlkit.vision.barcode.Barcode> detectedBarcode = null;
    private final java.util.HashSet<java.lang.Integer> objectIdsToSearch = null;
    private boolean isCameraLive = false;
    private com.google.mlkit.md.objectdetection.DetectedObjectInfo confirmedObject;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.google.mlkit.md.camera.WorkflowModel.WorkflowState> getWorkflowState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.google.mlkit.md.objectdetection.DetectedObjectInfo> getObjectToSearch() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.google.mlkit.md.productsearch.SearchedObject> getSearchedObject() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.google.mlkit.vision.barcode.Barcode> getDetectedBarcode() {
        return null;
    }
    
    public final boolean isCameraLive() {
        return false;
    }
    
    private final android.content.Context getContext() {
        return null;
    }
    
    @androidx.annotation.MainThread()
    public final void setWorkflowState(@org.jetbrains.annotations.NotNull()
    com.google.mlkit.md.camera.WorkflowModel.WorkflowState workflowState) {
    }
    
    @androidx.annotation.MainThread()
    public final void confirmingObject(@org.jetbrains.annotations.NotNull()
    com.google.mlkit.md.objectdetection.DetectedObjectInfo confirmingObject, float progress) {
    }
    
    @androidx.annotation.MainThread()
    public final void onSearchButtonClicked() {
    }
    
    private final void triggerSearch(com.google.mlkit.md.objectdetection.DetectedObjectInfo detectedObject) {
    }
    
    public final void markCameraLive() {
    }
    
    public final void markCameraFrozen() {
    }
    
    public final void onSearchCompleted(@org.jetbrains.annotations.NotNull()
    com.google.mlkit.md.objectdetection.DetectedObjectInfo detectedObject, @org.jetbrains.annotations.NotNull()
    java.util.List<com.google.mlkit.md.productsearch.Product> products) {
    }
    
    public WorkflowModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    /**
     * State set of the application workflow.
     */
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f\u00a8\u0006\r"}, d2 = {"Lcom/google/mlkit/md/camera/WorkflowModel$WorkflowState;", "", "(Ljava/lang/String;I)V", "NOT_STARTED", "DETECTING", "DETECTED", "CONFIRMING", "CONFIRMED", "SEARCHING", "SEARCHED", "RECORD_BY_USER", "RECORDED", "Delivering", "app_debug"})
    public static enum WorkflowState {
        /*public static final*/ NOT_STARTED /* = new NOT_STARTED() */,
        /*public static final*/ DETECTING /* = new DETECTING() */,
        /*public static final*/ DETECTED /* = new DETECTED() */,
        /*public static final*/ CONFIRMING /* = new CONFIRMING() */,
        /*public static final*/ CONFIRMED /* = new CONFIRMED() */,
        /*public static final*/ SEARCHING /* = new SEARCHING() */,
        /*public static final*/ SEARCHED /* = new SEARCHED() */,
        /*public static final*/ RECORD_BY_USER /* = new RECORD_BY_USER() */,
        /*public static final*/ RECORDED /* = new RECORDED() */,
        /*public static final*/ Delivering /* = new Delivering() */;
        
        WorkflowState() {
        }
    }
}