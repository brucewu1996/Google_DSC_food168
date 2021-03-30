package com.google.mlkit.md.barcodedetection;

import java.lang.System;

/**
 * A NucAction.camera reticle that locates at the center of canvas to indicate the system is active but has
 * not detected a barcode yet.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/google/mlkit/md/barcodedetection/BarcodeReticleGraphic;", "Lcom/google/mlkit/md/barcodedetection/BarcodeGraphicBase;", "overlay", "Lcom/google/mlkit/md/camera/GraphicOverlay;", "animator", "Lcom/google/mlkit/md/camera/CameraReticleAnimator;", "(Lcom/google/mlkit/md/camera/GraphicOverlay;Lcom/google/mlkit/md/camera/CameraReticleAnimator;)V", "rippleAlpha", "", "ripplePaint", "Landroid/graphics/Paint;", "rippleSizeOffset", "rippleStrokeWidth", "draw", "", "canvas", "Landroid/graphics/Canvas;", "app_debug"})
public final class BarcodeReticleGraphic extends com.google.mlkit.md.barcodedetection.BarcodeGraphicBase {
    private final android.graphics.Paint ripplePaint = null;
    private final int rippleSizeOffset = 0;
    private final int rippleStrokeWidth = 0;
    private final int rippleAlpha = 0;
    private final com.google.mlkit.md.camera.CameraReticleAnimator animator = null;
    
    @java.lang.Override()
    public void draw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas) {
    }
    
    public BarcodeReticleGraphic(@org.jetbrains.annotations.NotNull()
    com.google.mlkit.md.camera.GraphicOverlay overlay, @org.jetbrains.annotations.NotNull()
    com.google.mlkit.md.camera.CameraReticleAnimator animator) {
        super(null);
    }
}