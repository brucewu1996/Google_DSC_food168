package com.google.mlkit.md.objectdetection;

import java.lang.System;

/**
 * Similar to the NucAction.camera reticle but with additional progress ring to indicate an object is getting
 * confirmed for a follow up processing, e.g. product search.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/google/mlkit/md/objectdetection/ObjectConfirmationGraphic;", "Lcom/google/mlkit/md/camera/GraphicOverlay$Graphic;", "overlay", "Lcom/google/mlkit/md/camera/GraphicOverlay;", "confirmationController", "Lcom/google/mlkit/md/objectdetection/ObjectConfirmationController;", "(Lcom/google/mlkit/md/camera/GraphicOverlay;Lcom/google/mlkit/md/objectdetection/ObjectConfirmationController;)V", "innerRingPaint", "Landroid/graphics/Paint;", "innerRingStrokeRadius", "", "outerRingFillPaint", "outerRingFillRadius", "outerRingStrokePaint", "outerRingStrokeRadius", "progressRingStrokePaint", "draw", "", "canvas", "Landroid/graphics/Canvas;", "app_debug"})
public final class ObjectConfirmationGraphic extends com.google.mlkit.md.camera.GraphicOverlay.Graphic {
    private final android.graphics.Paint outerRingFillPaint = null;
    private final android.graphics.Paint outerRingStrokePaint = null;
    private final android.graphics.Paint innerRingPaint = null;
    private final android.graphics.Paint progressRingStrokePaint = null;
    private final int outerRingFillRadius = 0;
    private final int outerRingStrokeRadius = 0;
    private final int innerRingStrokeRadius = 0;
    private final com.google.mlkit.md.objectdetection.ObjectConfirmationController confirmationController = null;
    
    @java.lang.Override()
    public void draw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas) {
    }
    
    public ObjectConfirmationGraphic(@org.jetbrains.annotations.NotNull()
    com.google.mlkit.md.camera.GraphicOverlay overlay, @org.jetbrains.annotations.NotNull()
    com.google.mlkit.md.objectdetection.ObjectConfirmationController confirmationController) {
        super(null);
    }
}