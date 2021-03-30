package com.google.mlkit.md.barcodedetection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/google/mlkit/md/barcodedetection/BarcodeGraphicBase;", "Lcom/google/mlkit/md/camera/GraphicOverlay$Graphic;", "overlay", "Lcom/google/mlkit/md/camera/GraphicOverlay;", "(Lcom/google/mlkit/md/camera/GraphicOverlay;)V", "boxCornerRadius", "", "getBoxCornerRadius", "()F", "boxPaint", "Landroid/graphics/Paint;", "boxRect", "Landroid/graphics/RectF;", "getBoxRect", "()Landroid/graphics/RectF;", "eraserPaint", "pathPaint", "getPathPaint", "()Landroid/graphics/Paint;", "scrimPaint", "draw", "", "canvas", "Landroid/graphics/Canvas;", "app_debug"})
public abstract class BarcodeGraphicBase extends com.google.mlkit.md.camera.GraphicOverlay.Graphic {
    private final android.graphics.Paint boxPaint = null;
    private final android.graphics.Paint scrimPaint = null;
    private final android.graphics.Paint eraserPaint = null;
    private final float boxCornerRadius = 0.0F;
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.Paint pathPaint = null;
    @org.jetbrains.annotations.NotNull()
    private final android.graphics.RectF boxRect = null;
    
    public final float getBoxCornerRadius() {
        return 0.0F;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Paint getPathPaint() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.RectF getBoxRect() {
        return null;
    }
    
    @java.lang.Override()
    public void draw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas) {
    }
    
    public BarcodeGraphicBase(@org.jetbrains.annotations.NotNull()
    com.google.mlkit.md.camera.GraphicOverlay overlay) {
        super(null);
    }
}