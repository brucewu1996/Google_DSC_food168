package com.google.mlkit.md.barcodedetection;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\'\u0018\u00002\u00020\u0001B}\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000fR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001f\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0011\"\u0004\b!\u0010\u0013R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0011\"\u0004\b#\u0010\u0013R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0011\"\u0004\b%\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0011\"\u0004\b\'\u0010\u0013R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0011\"\u0004\b)\u0010\u0013\u00a8\u0006*"}, d2 = {"Lcom/google/mlkit/md/barcodedetection/barcode_info;", "", "barcode_value", "", "item", "energy", "protein", "total_lipid", "carbohydrate", "fiber", "sugar", "Na", "saturated_fatty_acids", "trans_fatty_acids", "cholesterol", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getNa", "()Ljava/lang/String;", "setNa", "(Ljava/lang/String;)V", "getBarcode_value", "setBarcode_value", "getCarbohydrate", "setCarbohydrate", "getCholesterol", "setCholesterol", "getEnergy", "setEnergy", "getFiber", "setFiber", "getItem", "setItem", "getProtein", "setProtein", "getSaturated_fatty_acids", "setSaturated_fatty_acids", "getSugar", "setSugar", "getTotal_lipid", "setTotal_lipid", "getTrans_fatty_acids", "setTrans_fatty_acids", "app_debug"})
public final class barcode_info {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String barcode_value;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String item;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String energy;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String protein;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String total_lipid;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String carbohydrate;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String fiber;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String sugar;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String Na;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String saturated_fatty_acids;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String trans_fatty_acids;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String cholesterol;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBarcode_value() {
        return null;
    }
    
    public final void setBarcode_value(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getItem() {
        return null;
    }
    
    public final void setItem(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEnergy() {
        return null;
    }
    
    public final void setEnergy(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProtein() {
        return null;
    }
    
    public final void setProtein(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTotal_lipid() {
        return null;
    }
    
    public final void setTotal_lipid(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCarbohydrate() {
        return null;
    }
    
    public final void setCarbohydrate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFiber() {
        return null;
    }
    
    public final void setFiber(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSugar() {
        return null;
    }
    
    public final void setSugar(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNa() {
        return null;
    }
    
    public final void setNa(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSaturated_fatty_acids() {
        return null;
    }
    
    public final void setSaturated_fatty_acids(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTrans_fatty_acids() {
        return null;
    }
    
    public final void setTrans_fatty_acids(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCholesterol() {
        return null;
    }
    
    public final void setCholesterol(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public barcode_info(@org.jetbrains.annotations.NotNull()
    java.lang.String barcode_value, @org.jetbrains.annotations.NotNull()
    java.lang.String item, @org.jetbrains.annotations.NotNull()
    java.lang.String energy, @org.jetbrains.annotations.NotNull()
    java.lang.String protein, @org.jetbrains.annotations.NotNull()
    java.lang.String total_lipid, @org.jetbrains.annotations.NotNull()
    java.lang.String carbohydrate, @org.jetbrains.annotations.NotNull()
    java.lang.String fiber, @org.jetbrains.annotations.NotNull()
    java.lang.String sugar, @org.jetbrains.annotations.NotNull()
    java.lang.String Na, @org.jetbrains.annotations.NotNull()
    java.lang.String saturated_fatty_acids, @org.jetbrains.annotations.NotNull()
    java.lang.String trans_fatty_acids, @org.jetbrains.annotations.NotNull()
    java.lang.String cholesterol) {
        super();
    }
    
    public barcode_info() {
        super();
    }
}