package com.google.mlkit.md.productsearch;

import java.lang.System;

/**
 * Powers the bottom card carousel for displaying the preview of product search result.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B6\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0007\u00a2\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000eH\u0016R)\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/google/mlkit/md/productsearch/PreviewCardAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/google/mlkit/md/productsearch/PreviewCardAdapter$CardViewHolder;", "searchedObjectList", "", "Lcom/google/mlkit/md/productsearch/SearchedObject;", "previewCordClickedListener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "searchedObject", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "CardViewHolder", "app_debug"})
public final class PreviewCardAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.google.mlkit.md.productsearch.PreviewCardAdapter.CardViewHolder> {
    private final java.util.List<com.google.mlkit.md.productsearch.SearchedObject> searchedObjectList = null;
    private final kotlin.jvm.functions.Function1<com.google.mlkit.md.productsearch.SearchedObject, java.lang.Object> previewCordClickedListener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.google.mlkit.md.productsearch.PreviewCardAdapter.CardViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.google.mlkit.md.productsearch.PreviewCardAdapter.CardViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public PreviewCardAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.google.mlkit.md.productsearch.SearchedObject> searchedObjectList, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.google.mlkit.md.productsearch.SearchedObject, ? extends java.lang.Object> previewCordClickedListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001b\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0000\u00a2\u0006\u0002\b\u0011R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/google/mlkit/md/productsearch/PreviewCardAdapter$CardViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "imageSize", "", "imageView", "Landroid/widget/ImageView;", "subtitleView", "Landroid/widget/TextView;", "titleView", "bindProducts", "", "products", "", "Lcom/google/mlkit/md/productsearch/Product;", "bindProducts$app_debug", "app_debug"})
    public static final class CardViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.ImageView imageView = null;
        private final android.widget.TextView titleView = null;
        private final android.widget.TextView subtitleView = null;
        private final int imageSize = 0;
        
        public final void bindProducts$app_debug(@org.jetbrains.annotations.NotNull()
        java.util.List<com.google.mlkit.md.productsearch.Product> products) {
        }
        
        public CardViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}