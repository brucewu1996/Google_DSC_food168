package com.google.mlkit.md.objectdetection;

import java.lang.System;

/**
 * Custom animator for the object dot.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fR\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t\u00a8\u0006\u0012"}, d2 = {"Lcom/google/mlkit/md/objectdetection/ObjectDotAnimator;", "", "graphicOverlay", "Lcom/google/mlkit/md/camera/GraphicOverlay;", "(Lcom/google/mlkit/md/camera/GraphicOverlay;)V", "<set-?>", "", "alphaScale", "getAlphaScale", "()F", "animatorSet", "Landroid/animation/AnimatorSet;", "radiusScale", "getRadiusScale", "cancel", "", "start", "Companion", "app_debug"})
public final class ObjectDotAnimator {
    private final android.animation.AnimatorSet animatorSet = null;
    
    /**
     * Returns the scale value of dot radius ranges in [0, 1].
     */
    private float radiusScale = 0.0F;
    
    /**
     * Returns the scale value of dot alpha ranges in [0, 1].
     */
    private float alphaScale = 0.0F;
    private static final long DURATION_DOT_SCALE_UP_MS = 217L;
    private static final long DURATION_DOT_SCALE_DOWN_MS = 783L;
    private static final long DURATION_DOT_FADE_IN_MS = 150L;
    private static final long START_DELAY_DOT_SCALE_DOWN_MS = 217L;
    @org.jetbrains.annotations.NotNull()
    public static final com.google.mlkit.md.objectdetection.ObjectDotAnimator.Companion Companion = null;
    
    public final float getRadiusScale() {
        return 0.0F;
    }
    
    public final float getAlphaScale() {
        return 0.0F;
    }
    
    public final void start() {
    }
    
    public final void cancel() {
    }
    
    public ObjectDotAnimator(@org.jetbrains.annotations.NotNull()
    com.google.mlkit.md.camera.GraphicOverlay graphicOverlay) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/google/mlkit/md/objectdetection/ObjectDotAnimator$Companion;", "", "()V", "DURATION_DOT_FADE_IN_MS", "", "DURATION_DOT_SCALE_DOWN_MS", "DURATION_DOT_SCALE_UP_MS", "START_DELAY_DOT_SCALE_DOWN_MS", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}