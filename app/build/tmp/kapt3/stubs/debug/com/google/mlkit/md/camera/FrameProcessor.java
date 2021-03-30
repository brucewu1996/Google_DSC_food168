package com.google.mlkit.md.camera;

import java.lang.System;

/**
 * An interface to process the input NucAction.camera frame and perform detection on it.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0003H&\u00a8\u0006\u000b"}, d2 = {"Lcom/google/mlkit/md/camera/FrameProcessor;", "", "process", "", "data", "Ljava/nio/ByteBuffer;", "frameMetadata", "Lcom/google/mlkit/md/camera/FrameMetadata;", "graphicOverlay", "Lcom/google/mlkit/md/camera/GraphicOverlay;", "stop", "app_debug"})
public abstract interface FrameProcessor {
    
    /**
     * Processes the input frame with the underlying detector.
     */
    public abstract void process(@org.jetbrains.annotations.NotNull()
    java.nio.ByteBuffer data, @org.jetbrains.annotations.NotNull()
    com.google.mlkit.md.camera.FrameMetadata frameMetadata, @org.jetbrains.annotations.NotNull()
    com.google.mlkit.md.camera.GraphicOverlay graphicOverlay);
    
    /**
     * Stops the underlying detector and release resources.
     */
    public abstract void stop();
}