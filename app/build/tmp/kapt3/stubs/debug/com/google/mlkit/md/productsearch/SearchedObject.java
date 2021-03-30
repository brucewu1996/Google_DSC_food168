package com.google.mlkit.md.productsearch;

import java.lang.System;

/**
 * Hosts the detected object info and its search result.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\u0006\u0010\u0017\u001a\u00020\u0013R\u0011\u0010\n\u001a\u00020\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0018"}, d2 = {"Lcom/google/mlkit/md/productsearch/SearchedObject;", "", "resources", "Landroid/content/res/Resources;", "detectedObject", "Lcom/google/mlkit/md/objectdetection/DetectedObjectInfo;", "productList", "", "Lcom/google/mlkit/md/productsearch/Product;", "(Landroid/content/res/Resources;Lcom/google/mlkit/md/objectdetection/DetectedObjectInfo;Ljava/util/List;)V", "boundingBox", "Landroid/graphics/Rect;", "getBoundingBox", "()Landroid/graphics/Rect;", "objectIndex", "", "getObjectIndex", "()I", "objectThumbnail", "Landroid/graphics/Bitmap;", "objectThumbnailCornerRadius", "getProductList", "()Ljava/util/List;", "getObjectThumbnail", "app_debug"})
public final class SearchedObject {
    private final int objectThumbnailCornerRadius = 0;
    private android.graphics.Bitmap objectThumbnail;
    private final com.google.mlkit.md.objectdetection.DetectedObjectInfo detectedObject = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.google.mlkit.md.productsearch.Product> productList = null;
    
    public final int getObjectIndex() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.graphics.Rect getBoundingBox() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final synchronized android.graphics.Bitmap getObjectThumbnail() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.google.mlkit.md.productsearch.Product> getProductList() {
        return null;
    }
    
    public SearchedObject(@org.jetbrains.annotations.NotNull()
    android.content.res.Resources resources, @org.jetbrains.annotations.NotNull()
    com.google.mlkit.md.objectdetection.DetectedObjectInfo detectedObject, @org.jetbrains.annotations.NotNull()
    java.util.List<com.google.mlkit.md.productsearch.Product> productList) {
        super();
    }
}