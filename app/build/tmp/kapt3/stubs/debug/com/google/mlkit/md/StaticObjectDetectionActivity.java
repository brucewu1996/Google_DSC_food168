package com.google.mlkit.md;

import java.lang.System;

/**
 * Demonstrates the object detection and visual search workflow using static image.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00b8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 I2\u00020\u00012\u00020\u0002:\u0002HIB\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020 H\u0002J\u0010\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)H\u0002J\"\u0010*\u001a\u00020\'2\u0006\u0010+\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u000e2\b\u0010-\u001a\u0004\u0018\u00010.H\u0014J\b\u0010/\u001a\u00020\'H\u0016J\u0010\u00100\u001a\u00020\'2\u0006\u00101\u001a\u00020\bH\u0016J\u0012\u00102\u001a\u00020\'2\b\u00103\u001a\u0004\u0018\u000104H\u0014J\b\u00105\u001a\u00020\'H\u0014J\u001e\u00106\u001a\u00020\'2\u0006\u00107\u001a\u0002082\f\u00109\u001a\b\u0012\u0004\u0012\u00020;0:H\u0003J\u001e\u0010<\u001a\u00020\'2\u0006\u0010=\u001a\u00020>2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020@0:H\u0002J\u0010\u0010A\u001a\u00020\'2\u0006\u0010B\u001a\u00020\u000eH\u0002J\b\u0010C\u001a\u00020\'H\u0002J\u0010\u0010D\u001a\u00020\'2\u0006\u0010E\u001a\u00020FH\u0002J\u0010\u0010G\u001a\u00020\'2\u0006\u0010%\u001a\u00020 H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020 0\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006J"}, d2 = {"Lcom/google/mlkit/md/StaticObjectDetectionActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/view/View$OnClickListener;", "()V", "bottomPromptChip", "Lcom/google/android/material/chip/Chip;", "bottomSheetBehavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/view/View;", "bottomSheetScrimView", "Lcom/google/mlkit/md/productsearch/BottomSheetScrimView;", "bottomSheetTitleView", "Landroid/widget/TextView;", "currentSelectedObjectIndex", "", "detectedObjectNum", "detector", "Lcom/google/mlkit/vision/objects/ObjectDetector;", "dotViewContainer", "Landroid/view/ViewGroup;", "dotViewSize", "inputBitmap", "Landroid/graphics/Bitmap;", "inputImageView", "Landroid/widget/ImageView;", "loadingView", "previewCardCarousel", "Landroidx/recyclerview/widget/RecyclerView;", "productRecyclerView", "searchEngine", "Lcom/google/mlkit/md/productsearch/SearchEngine;", "searchedObjectForBottomSheet", "Lcom/google/mlkit/md/productsearch/SearchedObject;", "searchedObjectMap", "Ljava/util/TreeMap;", "createDotView", "Lcom/google/mlkit/md/objectdetection/StaticObjectDotView;", "searchedObject", "detectObjects", "", "imageUri", "Landroid/net/Uri;", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onClick", "view", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onObjectsDetected", "image", "Lcom/google/mlkit/md/InputInfo;", "objects", "", "Lcom/google/mlkit/vision/objects/DetectedObject;", "onSearchCompleted", "detectedObject", "Lcom/google/mlkit/md/objectdetection/DetectedObjectInfo;", "productList", "Lcom/google/mlkit/md/productsearch/Product;", "selectNewObject", "objectIndex", "setUpBottomSheet", "showBottomPromptChip", "message", "", "showSearchResults", "CardItemDecoration", "Companion", "app_debug"})
public final class StaticObjectDetectionActivity extends androidx.appcompat.app.AppCompatActivity implements android.view.View.OnClickListener {
    private final java.util.TreeMap<java.lang.Integer, com.google.mlkit.md.productsearch.SearchedObject> searchedObjectMap = null;
    private android.view.View loadingView;
    private com.google.android.material.chip.Chip bottomPromptChip;
    private android.widget.ImageView inputImageView;
    private androidx.recyclerview.widget.RecyclerView previewCardCarousel;
    private android.view.ViewGroup dotViewContainer;
    private com.google.android.material.bottomsheet.BottomSheetBehavior<android.view.View> bottomSheetBehavior;
    private com.google.mlkit.md.productsearch.BottomSheetScrimView bottomSheetScrimView;
    private android.widget.TextView bottomSheetTitleView;
    private androidx.recyclerview.widget.RecyclerView productRecyclerView;
    private android.graphics.Bitmap inputBitmap;
    private com.google.mlkit.md.productsearch.SearchedObject searchedObjectForBottomSheet;
    private int dotViewSize = 0;
    private int detectedObjectNum = 0;
    private int currentSelectedObjectIndex = 0;
    private com.google.mlkit.vision.objects.ObjectDetector detector;
    private com.google.mlkit.md.productsearch.SearchEngine searchEngine;
    private static final java.lang.String TAG = "StaticObjectActivity";
    private static final int MAX_IMAGE_DIMENSION = 1024;
    @org.jetbrains.annotations.NotNull()
    public static final com.google.mlkit.md.StaticObjectDetectionActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    private final void showSearchResults(com.google.mlkit.md.productsearch.SearchedObject searchedObject) {
    }
    
    private final void setUpBottomSheet() {
    }
    
    private final void detectObjects(android.net.Uri imageUri) {
    }
    
    @androidx.annotation.MainThread()
    private final void onObjectsDetected(com.google.mlkit.md.InputInfo image, java.util.List<? extends com.google.mlkit.vision.objects.DetectedObject> objects) {
    }
    
    private final void onSearchCompleted(com.google.mlkit.md.objectdetection.DetectedObjectInfo detectedObject, java.util.List<com.google.mlkit.md.productsearch.Product> productList) {
    }
    
    private final com.google.mlkit.md.objectdetection.StaticObjectDotView createDotView(com.google.mlkit.md.productsearch.SearchedObject searchedObject) {
        return null;
    }
    
    private final void selectNewObject(int objectIndex) {
    }
    
    private final void showBottomPromptChip(java.lang.String message) {
    }
    
    public StaticObjectDetectionActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J(\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/google/mlkit/md/StaticObjectDetectionActivity$CardItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "resources", "Landroid/content/res/Resources;", "(Landroid/content/res/Resources;)V", "cardSpacing", "", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "app_debug"})
    static final class CardItemDecoration extends androidx.recyclerview.widget.RecyclerView.ItemDecoration {
        private final int cardSpacing = 0;
        
        @java.lang.Override()
        public void getItemOffsets(@org.jetbrains.annotations.NotNull()
        android.graphics.Rect outRect, @org.jetbrains.annotations.NotNull()
        android.view.View view, @org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView parent, @org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView.State state) {
        }
        
        public CardItemDecoration(@org.jetbrains.annotations.NotNull()
        android.content.res.Resources resources) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/google/mlkit/md/StaticObjectDetectionActivity$Companion;", "", "()V", "MAX_IMAGE_DIMENSION", "", "TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}