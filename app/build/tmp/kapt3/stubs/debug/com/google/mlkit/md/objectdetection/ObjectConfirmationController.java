package com.google.mlkit.md.objectdetection;

import java.lang.System;

/**
 * Controls the progress of object confirmation before performing additional operation on the
 * detected object.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\u0012\u001a\u00020\u00132\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\u0014J\u0006\u0010\u0015\u001a\u00020\u0013R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u0012\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\fR\u001e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0016"}, d2 = {"Lcom/google/mlkit/md/objectdetection/ObjectConfirmationController;", "", "graphicOverlay", "Lcom/google/mlkit/md/camera/GraphicOverlay;", "(Lcom/google/mlkit/md/camera/GraphicOverlay;)V", "countDownTimer", "Landroid/os/CountDownTimer;", "isConfirmed", "", "()Z", "objectId", "", "Ljava/lang/Integer;", "<set-?>", "", "progress", "getProgress", "()F", "confirming", "", "(Ljava/lang/Integer;)V", "reset", "app_debug"})
public final class ObjectConfirmationController {
    private final android.os.CountDownTimer countDownTimer = null;
    private java.lang.Integer objectId;
    
    /**
     * Returns the confirmation progress described as a float value in the range of [0, 1].
     */
    private float progress = 0.0F;
    
    public final float getProgress() {
        return 0.0F;
    }
    
    public final boolean isConfirmed() {
        return false;
    }
    
    public final void confirming(@org.jetbrains.annotations.Nullable()
    java.lang.Integer objectId) {
    }
    
    public final void reset() {
    }
    
    public ObjectConfirmationController(@org.jetbrains.annotations.NotNull()
    com.google.mlkit.md.camera.GraphicOverlay graphicOverlay) {
        super();
    }
}