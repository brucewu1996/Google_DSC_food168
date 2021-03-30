package com.google.mlkit.md.productsearch;

import java.lang.System;

/**
 * Async task to download the image and then feed into the provided image view.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00112\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0011B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ#\u0010\n\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\f\"\u00020\u0002H\u0014\u00a2\u0006\u0002\u0010\rJ\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/google/mlkit/md/productsearch/ImageDownloadTask;", "Landroid/os/AsyncTask;", "", "Ljava/lang/Void;", "Landroid/graphics/Bitmap;", "imageView", "Landroid/widget/ImageView;", "maxImageWidth", "", "(Landroid/widget/ImageView;I)V", "doInBackground", "urls", "", "([Ljava/lang/String;)Landroid/graphics/Bitmap;", "onPostExecute", "", "result", "Companion", "app_debug"})
public final class ImageDownloadTask extends android.os.AsyncTask<java.lang.String, java.lang.Void, android.graphics.Bitmap> {
    private final android.widget.ImageView imageView = null;
    private final int maxImageWidth = 0;
    private static final java.lang.String TAG = "ImageDownloadTask";
    @org.jetbrains.annotations.NotNull()
    public static final com.google.mlkit.md.productsearch.ImageDownloadTask.Companion Companion = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected android.graphics.Bitmap doInBackground(@org.jetbrains.annotations.NotNull()
    java.lang.String... urls) {
        return null;
    }
    
    @java.lang.Override()
    protected void onPostExecute(@org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap result) {
    }
    
    public ImageDownloadTask(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imageView, int maxImageWidth) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/google/mlkit/md/productsearch/ImageDownloadTask$Companion;", "", "()V", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}