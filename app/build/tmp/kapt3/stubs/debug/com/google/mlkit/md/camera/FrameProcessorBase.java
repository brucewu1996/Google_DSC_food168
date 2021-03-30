package com.google.mlkit.md.camera;

import java.lang.System;

/**
 * Abstract base class of [FrameProcessor].
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 !*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001!B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u000e\u001a\u00020\u000fH$J\u0014\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u00060\u0013j\u0002`\u0014H$J%\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u001aH$\u00a2\u0006\u0002\u0010\u001bJ \u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010 \u001a\u00020\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/google/mlkit/md/camera/FrameProcessorBase;", "T", "Lcom/google/mlkit/md/camera/FrameProcessor;", "()V", "executor", "Lcom/google/mlkit/md/ScopedExecutor;", "latestFrame", "Ljava/nio/ByteBuffer;", "latestFrameMetaData", "Lcom/google/mlkit/md/camera/FrameMetadata;", "processingFrame", "processingFrameMetaData", "detectInImage", "Lcom/google/android/gms/tasks/Task;", "image", "Lcom/google/mlkit/vision/common/InputImage;", "onFailure", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onSuccess", "inputInfo", "Lcom/google/mlkit/md/InputInfo;", "results", "graphicOverlay", "Lcom/google/mlkit/md/camera/GraphicOverlay;", "(Lcom/google/mlkit/md/InputInfo;Ljava/lang/Object;Lcom/google/mlkit/md/camera/GraphicOverlay;)V", "process", "data", "frameMetadata", "processLatestFrame", "stop", "Companion", "app_debug"})
public abstract class FrameProcessorBase<T extends java.lang.Object> implements com.google.mlkit.md.camera.FrameProcessor {
    @androidx.annotation.GuardedBy(value = "this")
    private java.nio.ByteBuffer latestFrame;
    @androidx.annotation.GuardedBy(value = "this")
    private com.google.mlkit.md.camera.FrameMetadata latestFrameMetaData;
    @androidx.annotation.GuardedBy(value = "this")
    private java.nio.ByteBuffer processingFrame;
    @androidx.annotation.GuardedBy(value = "this")
    private com.google.mlkit.md.camera.FrameMetadata processingFrameMetaData;
    private final com.google.mlkit.md.ScopedExecutor executor = null;
    private static final java.lang.String TAG = "FrameProcessorBase";
    @org.jetbrains.annotations.NotNull()
    public static final com.google.mlkit.md.camera.FrameProcessorBase.Companion Companion = null;
    
    @java.lang.Override()
    public synchronized void process(@org.jetbrains.annotations.NotNull()
    java.nio.ByteBuffer data, @org.jetbrains.annotations.NotNull()
    com.google.mlkit.md.camera.FrameMetadata frameMetadata, @org.jetbrains.annotations.NotNull()
    com.google.mlkit.md.camera.GraphicOverlay graphicOverlay) {
    }
    
    private final synchronized void processLatestFrame(com.google.mlkit.md.camera.GraphicOverlay graphicOverlay) {
    }
    
    @java.lang.Override()
    public void stop() {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected abstract com.google.android.gms.tasks.Task<T> detectInImage(@org.jetbrains.annotations.NotNull()
    com.google.mlkit.vision.common.InputImage image);
    
    /**
     * Be called when the detection succeeds.
     */
    protected abstract void onSuccess(@org.jetbrains.annotations.NotNull()
    com.google.mlkit.md.InputInfo inputInfo, T results, @org.jetbrains.annotations.NotNull()
    com.google.mlkit.md.camera.GraphicOverlay graphicOverlay);
    
    protected abstract void onFailure(@org.jetbrains.annotations.NotNull()
    java.lang.Exception e);
    
    public FrameProcessorBase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/google/mlkit/md/camera/FrameProcessorBase$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}