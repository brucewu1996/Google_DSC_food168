package com.google.mlkit.md.productsearch;

import java.lang.System;

/**
 * A fake search engine to help simulate the complete work flow.
 */
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004JL\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2<\u0010\r\u001a8\u0012\u0013\u0012\u00110\f\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u000b\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00120\u0011\u00a2\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\n0\u000eJ\u0006\u0010\u0014\u001a\u00020\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/google/mlkit/md/productsearch/SearchEngine;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "requestCreationExecutor", "Ljava/util/concurrent/ExecutorService;", "searchRequestQueue", "Lcom/android/volley/RequestQueue;", "search", "", "detectedObject", "Lcom/google/mlkit/md/objectdetection/DetectedObjectInfo;", "listener", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "", "Lcom/google/mlkit/md/productsearch/Product;", "productList", "shutdown", "Companion", "app_debug"})
public final class SearchEngine {
    private final com.android.volley.RequestQueue searchRequestQueue = null;
    private final java.util.concurrent.ExecutorService requestCreationExecutor = null;
    private static final java.lang.String TAG = "SearchEngine";
    @org.jetbrains.annotations.NotNull()
    public static final com.google.mlkit.md.productsearch.SearchEngine.Companion Companion = null;
    
    public final void search(@org.jetbrains.annotations.NotNull()
    com.google.mlkit.md.objectdetection.DetectedObjectInfo detectedObject, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super com.google.mlkit.md.objectdetection.DetectedObjectInfo, ? super java.util.List<com.google.mlkit.md.productsearch.Product>, kotlin.Unit> listener) {
    }
    
    public final void shutdown() {
    }
    
    public SearchEngine(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/google/mlkit/md/productsearch/SearchEngine$Companion;", "", "()V", "TAG", "", "createRequest", "Lcom/android/volley/toolbox/JsonObjectRequest;", "searchingObject", "Lcom/google/mlkit/md/objectdetection/DetectedObjectInfo;", "app_debug"})
    public static final class Companion {
        
        private final com.android.volley.toolbox.JsonObjectRequest createRequest(com.google.mlkit.md.objectdetection.DetectedObjectInfo searchingObject) throws java.lang.Exception {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}