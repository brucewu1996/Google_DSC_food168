package com.google.mlkit.md.productsearch;

import java.lang.System;

/**
 * Draws the scrim of bottom sheet with object thumbnail highlighted.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0014J&\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0001J&\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u0014R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/google/mlkit/md/productsearch/BottomSheetScrimView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "boxCornerRadius", "", "boxPaint", "Landroid/graphics/Paint;", "downPercentInCollapsed", "", "scrimPaint", "thumbnailBitmap", "Landroid/graphics/Bitmap;", "thumbnailHeight", "thumbnailMargin", "thumbnailPaint", "thumbnailRect", "Landroid/graphics/RectF;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "updateWithThumbnailTranslate", "collapsedStateHeight", "slideOffset", "bottomSheet", "updateWithThumbnailTranslateAndScale", "srcThumbnailRect", "Companion", "app_debug"})
public final class BottomSheetScrimView extends android.view.View {
    private final android.graphics.Paint scrimPaint = null;
    private final android.graphics.Paint thumbnailPaint = null;
    private final android.graphics.Paint boxPaint = null;
    private final int thumbnailHeight = 0;
    private final int thumbnailMargin = 0;
    private final int boxCornerRadius = 0;
    private android.graphics.Bitmap thumbnailBitmap;
    private android.graphics.RectF thumbnailRect;
    private float downPercentInCollapsed = 0.0F;
    private static final float DOWN_PERCENT_TO_HIDE_THUMBNAIL = 0.42F;
    @org.jetbrains.annotations.NotNull()
    public static final com.google.mlkit.md.productsearch.BottomSheetScrimView.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    /**
     * Translates the object thumbnail up or down along with bottom sheet's sliding movement, with
     * keeping thumbnail size fixed.
     */
    public final void updateWithThumbnailTranslate(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap thumbnailBitmap, int collapsedStateHeight, float slideOffset, @org.jetbrains.annotations.NotNull()
    android.view.View bottomSheet) {
    }
    
    /**
     * Translates the object thumbnail from original bounding box location to at where the bottom
     * sheet is settled as COLLAPSED state, with its size scales gradually.
     *
     *
     * It's only used by sliding the sheet up from hidden state to collapsed state.
     */
    public final void updateWithThumbnailTranslateAndScale(@org.jetbrains.annotations.NotNull()
    android.graphics.Bitmap thumbnailBitmap, int collapsedStateHeight, float slideOffset, @org.jetbrains.annotations.NotNull()
    android.graphics.RectF srcThumbnailRect) {
    }
    
    @java.lang.Override()
    protected void onDraw(@org.jetbrains.annotations.NotNull()
    android.graphics.Canvas canvas) {
    }
    
    public BottomSheetScrimView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/google/mlkit/md/productsearch/BottomSheetScrimView$Companion;", "", "()V", "DOWN_PERCENT_TO_HIDE_THUMBNAIL", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}