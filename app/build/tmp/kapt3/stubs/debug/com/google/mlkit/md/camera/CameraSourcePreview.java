package com.google.mlkit.md.camera;

import java.lang.System;

/**
 * Preview the NucAction.camera image in the screen.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001e\u001fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0012\u001a\u00020\u0013H\u0014J0\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0017H\u0014J\u000e\u0010\u001b\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u001c\u001a\u00020\u0013H\u0002J\u0006\u0010\u001d\u001a\u00020\u0013R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lcom/google/mlkit/md/camera/CameraSourcePreview;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "cameraPreviewSize", "Lcom/google/android/gms/common/images/Size;", "cameraSource", "Lcom/google/mlkit/md/camera/CameraSource;", "graphicOverlay", "Lcom/google/mlkit/md/camera/GraphicOverlay;", "startRequested", "", "surfaceAvailable", "surfaceView", "Landroid/view/SurfaceView;", "onFinishInflate", "", "onLayout", "changed", "left", "", "top", "right", "bottom", "start", "startIfReady", "stop", "Companion", "SurfaceCallback", "app_debug"})
public final class CameraSourcePreview extends android.widget.FrameLayout {
    private final android.view.SurfaceView surfaceView = null;
    private com.google.mlkit.md.camera.GraphicOverlay graphicOverlay;
    private boolean startRequested = false;
    private boolean surfaceAvailable = false;
    private com.google.mlkit.md.camera.CameraSource cameraSource;
    private com.google.android.gms.common.images.Size cameraPreviewSize;
    private static final java.lang.String TAG = "CameraSourcePreview";
    @org.jetbrains.annotations.NotNull()
    public static final com.google.mlkit.md.camera.CameraSourcePreview.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onFinishInflate() {
    }
    
    public final void start(@org.jetbrains.annotations.NotNull()
    com.google.mlkit.md.camera.CameraSource cameraSource) throws java.io.IOException {
    }
    
    public final void stop() {
    }
    
    private final void startIfReady() throws java.io.IOException {
    }
    
    @java.lang.Override()
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
    }
    
    public CameraSourcePreview(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0006H\u0016\u00a8\u0006\u000e"}, d2 = {"Lcom/google/mlkit/md/camera/CameraSourcePreview$SurfaceCallback;", "Landroid/view/SurfaceHolder$Callback;", "(Lcom/google/mlkit/md/camera/CameraSourcePreview;)V", "surfaceChanged", "", "holder", "Landroid/view/SurfaceHolder;", "format", "", "width", "height", "surfaceCreated", "surface", "surfaceDestroyed", "app_debug"})
    final class SurfaceCallback implements android.view.SurfaceHolder.Callback {
        
        @java.lang.Override()
        public void surfaceCreated(@org.jetbrains.annotations.NotNull()
        android.view.SurfaceHolder surface) {
        }
        
        @java.lang.Override()
        public void surfaceDestroyed(@org.jetbrains.annotations.NotNull()
        android.view.SurfaceHolder surface) {
        }
        
        @java.lang.Override()
        public void surfaceChanged(@org.jetbrains.annotations.NotNull()
        android.view.SurfaceHolder holder, int format, int width, int height) {
        }
        
        public SurfaceCallback() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/google/mlkit/md/camera/CameraSourcePreview$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}