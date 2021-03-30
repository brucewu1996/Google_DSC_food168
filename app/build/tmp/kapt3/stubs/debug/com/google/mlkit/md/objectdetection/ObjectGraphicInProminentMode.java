package com.google.mlkit.md.objectdetection;

import java.lang.System;

/**
 * Draws the detected visionObject info over the NucAction.camera preview for prominent visionObject detection mode.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\n8\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\n8\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/google/mlkit/md/objectdetection/ObjectGraphicInProminentMode;", "Lcom/google/mlkit/md/camera/GraphicOverlay$Graphic;", "overlay", "Lcom/google/mlkit/md/camera/GraphicOverlay;", "visionObject", "Lcom/google/mlkit/vision/objects/DetectedObject;", "confirmationController", "Lcom/google/mlkit/md/objectdetection/ObjectConfirmationController;", "(Lcom/google/mlkit/md/camera/GraphicOverlay;Lcom/google/mlkit/vision/objects/DetectedObject;Lcom/google/mlkit/md/objectdetection/ObjectConfirmationController;)V", "boxCornerRadius", "", "boxGradientEndColor", "boxGradientStartColor", "boxPaint", "Landroid/graphics/Paint;", "eraserPaint", "scrimPaint", "draw", "", "canvas", "Landroid/graphics/Canvas;", "app_debug"})
public final class ObjectGraphicInProminentMode extends com.google.mlkit.md.camera.GraphicOverlay.Graphic {
    private final android.graphics.Paint scrimPaint = null;
    private final android.graphics.Paint eraserPaint = null;
    private final android.graphics.Paint boxPaint = null;
    @androidx.annotation.ColorInt()
    private final int boxGradientStartColor = 0;
    @androidx.annotation.ColorInt()
    private final int boxGradientEndColor = 0;
    private final int boxCornerRadius = 0;
    private final com.google.mlkit.vision.objects.DetectedObject visionObject = null;
    private final com.google.mlkit.md.objectdetection.ObjectConfirmationController confirmationController = null;
    
    @java.lang.Override()
    public void draw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas) {
    }
    
    public ObjectGraphicInProminentMode(@org.jetbrains.annotations.NotNull()
    com.google.mlkit.md.camera.GraphicOverlay overlay, @org.jetbrains.annotations.NotNull()
    com.google.mlkit.vision.objects.DetectedObject visionObject, @org.jetbrains.annotations.NotNull()
    com.google.mlkit.md.objectdetection.ObjectConfirmationController confirmationController) {
        super(null);
    }
}