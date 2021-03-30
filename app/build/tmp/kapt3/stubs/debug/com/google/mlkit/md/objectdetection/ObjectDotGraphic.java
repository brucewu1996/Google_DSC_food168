package com.google.mlkit.md.objectdetection;

import java.lang.System;

/**
 * A dot to indicate a detected object used by multiple objects detection mode.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/google/mlkit/md/objectdetection/ObjectDotGraphic;", "Lcom/google/mlkit/md/camera/GraphicOverlay$Graphic;", "overlay", "Lcom/google/mlkit/md/camera/GraphicOverlay;", "detectedObject", "Lcom/google/mlkit/md/objectdetection/DetectedObjectInfo;", "animator", "Lcom/google/mlkit/md/objectdetection/ObjectDotAnimator;", "(Lcom/google/mlkit/md/camera/GraphicOverlay;Lcom/google/mlkit/md/objectdetection/DetectedObjectInfo;Lcom/google/mlkit/md/objectdetection/ObjectDotAnimator;)V", "center", "Landroid/graphics/PointF;", "dotAlpha", "", "dotRadius", "paint", "Landroid/graphics/Paint;", "draw", "", "canvas", "Landroid/graphics/Canvas;", "app_debug"})
public final class ObjectDotGraphic extends com.google.mlkit.md.camera.GraphicOverlay.Graphic {
    private final android.graphics.Paint paint = null;
    private final android.graphics.PointF center = null;
    private final int dotRadius = 0;
    private final int dotAlpha = 0;
    private final com.google.mlkit.md.objectdetection.ObjectDotAnimator animator = null;
    
    @java.lang.Override()
    public void draw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas) {
    }
    
    public ObjectDotGraphic(@org.jetbrains.annotations.NotNull()
    com.google.mlkit.md.camera.GraphicOverlay overlay, @org.jetbrains.annotations.NotNull()
    com.google.mlkit.md.objectdetection.DetectedObjectInfo detectedObject, @org.jetbrains.annotations.NotNull()
    com.google.mlkit.md.objectdetection.ObjectDotAnimator animator) {
        super(null);
    }
}