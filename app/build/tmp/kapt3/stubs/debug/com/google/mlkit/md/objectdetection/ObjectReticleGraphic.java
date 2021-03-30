package com.google.mlkit.md.objectdetection;

import java.lang.System;

/**
 * A NucAction.camera reticle that locates at the center of canvas to indicate the system is active but has
 * not recognized an object yet.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/google/mlkit/md/objectdetection/ObjectReticleGraphic;", "Lcom/google/mlkit/md/camera/GraphicOverlay$Graphic;", "overlay", "Lcom/google/mlkit/md/camera/GraphicOverlay;", "animator", "Lcom/google/mlkit/md/camera/CameraReticleAnimator;", "(Lcom/google/mlkit/md/camera/GraphicOverlay;Lcom/google/mlkit/md/camera/CameraReticleAnimator;)V", "innerRingStrokePaint", "Landroid/graphics/Paint;", "innerRingStrokeRadius", "", "outerRingFillPaint", "outerRingFillRadius", "outerRingStrokePaint", "outerRingStrokeRadius", "rippleAlpha", "ripplePaint", "rippleSizeOffset", "rippleStrokeWidth", "draw", "", "canvas", "Landroid/graphics/Canvas;", "app_debug"})
public final class ObjectReticleGraphic extends com.google.mlkit.md.camera.GraphicOverlay.Graphic {
    private final android.graphics.Paint outerRingFillPaint = null;
    private final android.graphics.Paint outerRingStrokePaint = null;
    private final android.graphics.Paint innerRingStrokePaint = null;
    private final android.graphics.Paint ripplePaint = null;
    private final int outerRingFillRadius = 0;
    private final int outerRingStrokeRadius = 0;
    private final int innerRingStrokeRadius = 0;
    private final int rippleSizeOffset = 0;
    private final int rippleStrokeWidth = 0;
    private final int rippleAlpha = 0;
    private final com.google.mlkit.md.camera.CameraReticleAnimator animator = null;
    
    @java.lang.Override()
    public void draw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas) {
    }
    
    public ObjectReticleGraphic(@org.jetbrains.annotations.NotNull()
    com.google.mlkit.md.camera.GraphicOverlay overlay, @org.jetbrains.annotations.NotNull()
    com.google.mlkit.md.camera.CameraReticleAnimator animator) {
        super(null);
    }
}