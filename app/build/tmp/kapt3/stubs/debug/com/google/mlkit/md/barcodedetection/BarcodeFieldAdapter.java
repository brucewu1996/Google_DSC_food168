package com.google.mlkit.md.barcodedetection;

import java.lang.System;

/**
 * Presents a list of field info in the detected barcode.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/google/mlkit/md/barcodedetection/BarcodeFieldAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/google/mlkit/md/barcodedetection/BarcodeFieldAdapter$BarcodeFieldViewHolder;", "barcodeFieldList", "", "Lcom/google/mlkit/md/barcodedetection/BarcodeField;", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "BarcodeFieldViewHolder", "app_debug"})
public final class BarcodeFieldAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.google.mlkit.md.barcodedetection.BarcodeFieldAdapter.BarcodeFieldViewHolder> {
    private final java.util.List<com.google.mlkit.md.barcodedetection.BarcodeField> barcodeFieldList = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.google.mlkit.md.barcodedetection.BarcodeFieldAdapter.BarcodeFieldViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.google.mlkit.md.barcodedetection.BarcodeFieldAdapter.BarcodeFieldViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public BarcodeFieldAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.google.mlkit.md.barcodedetection.BarcodeField> barcodeFieldList) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/google/mlkit/md/barcodedetection/BarcodeFieldAdapter$BarcodeFieldViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "labelView", "Landroid/widget/TextView;", "valueView", "bindBarcodeField", "", "barcodeField", "Lcom/google/mlkit/md/barcodedetection/BarcodeField;", "Companion", "app_debug"})
    public static final class BarcodeFieldViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.TextView labelView = null;
        private final android.widget.TextView valueView = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.google.mlkit.md.barcodedetection.BarcodeFieldAdapter.BarcodeFieldViewHolder.Companion Companion = null;
        
        public final void bindBarcodeField(@org.jetbrains.annotations.NotNull()
        com.google.mlkit.md.barcodedetection.BarcodeField barcodeField) {
        }
        
        private BarcodeFieldViewHolder(android.view.View view) {
            super(null);
        }
        
        @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/google/mlkit/md/barcodedetection/BarcodeFieldAdapter$BarcodeFieldViewHolder$Companion;", "", "()V", "create", "Lcom/google/mlkit/md/barcodedetection/BarcodeFieldAdapter$BarcodeFieldViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_debug"})
        public static final class Companion {
            
            @org.jetbrains.annotations.NotNull()
            public final com.google.mlkit.md.barcodedetection.BarcodeFieldAdapter.BarcodeFieldViewHolder create(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent) {
                return null;
            }
            
            private Companion() {
                super();
            }
        }
    }
}