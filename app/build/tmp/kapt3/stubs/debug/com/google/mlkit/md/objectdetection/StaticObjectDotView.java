package com.google.mlkit.md.objectdetection;

import java.lang.System;

/**
 * Represents a detected object by drawing a circle dot at the center of object's bounding box.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0014J\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0005R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/google/mlkit/md/objectdetection/StaticObjectDotView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "selected", "", "(Landroid/content/Context;Z)V", "currentRadiusOffset", "", "paint", "Landroid/graphics/Paint;", "radiusOffsetRange", "", "unselectedDotRadius", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "playAnimationWithSelectedState", "Companion", "app_debug"})
public final class StaticObjectDotView extends android.view.View {
    private final android.graphics.Paint paint = null;
    private final int unselectedDotRadius = 0;
    private final int radiusOffsetRange = 0;
    private float currentRadiusOffset = 0.0F;
    private static final long DOT_SELECTION_ANIMATOR_DURATION_MS = 116L;
    private static final long DOT_DESELECTION_ANIMATOR_DURATION_MS = 67L;
    @org.jetbrains.annotations.NotNull()
    public static final com.google.mlkit.md.objectdetection.StaticObjectDotView.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public final void playAnimationWithSelectedState(boolean selected) {
    }
    
    @java.lang.Override()
    protected void onDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas) {
    }
    
    public StaticObjectDotView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, boolean selected) {
        super(null);
    }
    
    public StaticObjectDotView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/google/mlkit/md/objectdetection/StaticObjectDotView$Companion;", "", "()V", "DOT_DESELECTION_ANIMATOR_DURATION_MS", "", "DOT_SELECTION_ANIMATOR_DURATION_MS", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}