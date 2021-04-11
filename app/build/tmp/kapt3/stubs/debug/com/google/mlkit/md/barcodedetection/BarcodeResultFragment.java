package com.google.mlkit.md.barcodedetection;

import java.lang.System;

/**
 * Displays the bottom sheet to present barcode fields contained in the detected barcode.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u00012\u00020\u0002:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J$\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u001c\u0010\u0011\u001a\u00020\u0012*\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u00a8\u0006\u0017"}, d2 = {"Lcom/google/mlkit/md/barcodedetection/BarcodeResultFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "Landroid/view/View$OnClickListener;", "()V", "getCurrentDateTime", "Ljava/util/Date;", "onClick", "", "v", "Landroid/view/View;", "onCreateView", "layoutInflater", "Landroid/view/LayoutInflater;", "viewGroup", "Landroid/view/ViewGroup;", "bundle", "Landroid/os/Bundle;", "toString", "", "format", "locale", "Ljava/util/Locale;", "Companion", "app_debug"})
public final class BarcodeResultFragment extends com.google.android.material.bottomsheet.BottomSheetDialogFragment implements android.view.View.OnClickListener {
    private static final java.lang.String TAG = "BarcodeResultFragment";
    private static final java.lang.String ARG_BARCODE_FIELD_LIST = "arg_barcode_field_list";
    @org.jetbrains.annotations.NotNull()
    public static final com.google.mlkit.md.barcodedetection.BarcodeResultFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater layoutInflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup viewGroup, @org.jetbrains.annotations.Nullable()
    android.os.Bundle bundle) {
        return null;
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String toString(@org.jetbrains.annotations.NotNull()
    java.util.Date $this$toString, @org.jetbrains.annotations.NotNull()
    java.lang.String format, @org.jetbrains.annotations.NotNull()
    java.util.Locale locale) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getCurrentDateTime() {
        return null;
    }
    
    public BarcodeResultFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/google/mlkit/md/barcodedetection/BarcodeResultFragment$Companion;", "", "()V", "ARG_BARCODE_FIELD_LIST", "", "TAG", "dismiss", "", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "show", "barcode", "Lcom/google/mlkit/md/barcodedetection/BarcodeField;", "app_debug"})
    public static final class Companion {
        
        public final void show(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentManager fragmentManager, @org.jetbrains.annotations.NotNull()
        com.google.mlkit.md.barcodedetection.BarcodeField barcode) {
        }
        
        public final void dismiss(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.FragmentManager fragmentManager) {
        }
        
        private Companion() {
            super();
        }
    }
}