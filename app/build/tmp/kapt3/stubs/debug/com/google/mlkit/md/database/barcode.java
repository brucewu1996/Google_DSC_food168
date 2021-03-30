package com.google.mlkit.md.database;

import java.lang.System;

@androidx.room.Entity(tableName = "barcode")
@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b9\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\u0006\u0010\u0011\u001a\u00020\b\u00a2\u0006\u0002\u0010\u0012J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\bH\u00c6\u0003J\t\u00105\u001a\u00020\bH\u00c6\u0003J\t\u00106\u001a\u00020\bH\u00c6\u0003J\t\u00107\u001a\u00020\bH\u00c6\u0003J\t\u00108\u001a\u00020\u0005H\u00c6\u0003J\t\u00109\u001a\u00020\u0005H\u00c6\u0003J\t\u0010:\u001a\u00020\bH\u00c6\u0003J\t\u0010;\u001a\u00020\bH\u00c6\u0003J\t\u0010<\u001a\u00020\bH\u00c6\u0003J\t\u0010=\u001a\u00020\bH\u00c6\u0003J\t\u0010>\u001a\u00020\bH\u00c6\u0003J\t\u0010?\u001a\u00020\bH\u00c6\u0003J\u008b\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\bH\u00c6\u0001J\u0013\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010D\u001a\u00020\u0003H\u00d6\u0001J\t\u0010E\u001a\u00020\u0005H\u00d6\u0001R\u001e\u0010\u000e\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R\u001e\u0010\u0011\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\u0016R\u001e\u0010\f\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0018\"\u0004\b(\u0010\u001aR\u001e\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0014\"\u0004\b*\u0010\u0016R\u001e\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0014\"\u0004\b,\u0010\u0016R\u001e\u0010\r\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0014\"\u0004\b.\u0010\u0016R\u001e\u0010\n\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0014\"\u0004\b0\u0010\u0016R\u001e\u0010\u0010\u001a\u00020\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0014\"\u0004\b2\u0010\u0016\u00a8\u0006F"}, d2 = {"Lcom/google/mlkit/md/database/barcode;", "", "id", "", "barcode_value", "", "item", "energy", "", "protein", "total_lipid", "carbohydrate", "fiber", "sugar", "Na", "saturated_fatty_acids", "trans_fatty_acids", "cholesterol", "(ILjava/lang/String;Ljava/lang/String;DDDDDDDDDD)V", "getNa", "()D", "setNa", "(D)V", "getBarcode_value", "()Ljava/lang/String;", "setBarcode_value", "(Ljava/lang/String;)V", "getCarbohydrate", "setCarbohydrate", "getCholesterol", "setCholesterol", "getEnergy", "setEnergy", "getFiber", "setFiber", "getId", "()I", "setId", "(I)V", "getItem", "setItem", "getProtein", "setProtein", "getSaturated_fatty_acids", "setSaturated_fatty_acids", "getSugar", "setSugar", "getTotal_lipid", "setTotal_lipid", "getTrans_fatty_acids", "setTrans_fatty_acids", "component1", "component10", "component11", "component12", "component13", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_debug"})
public final class barcode {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int id;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "barcode_value")
    private java.lang.String barcode_value;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "item")
    private java.lang.String item;
    @androidx.room.ColumnInfo(name = "energy")
    private double energy;
    @androidx.room.ColumnInfo(name = "protein")
    private double protein;
    @androidx.room.ColumnInfo(name = "total_lipid")
    private double total_lipid;
    @androidx.room.ColumnInfo(name = "carbohydrate")
    private double carbohydrate;
    @androidx.room.ColumnInfo(name = "fiber")
    private double fiber;
    @androidx.room.ColumnInfo(name = "sugar")
    private double sugar;
    @androidx.room.ColumnInfo(name = "Na")
    private double Na;
    @androidx.room.ColumnInfo(name = "saturated_fatty_acids")
    private double saturated_fatty_acids;
    @androidx.room.ColumnInfo(name = "trans_fatty_acids")
    private double trans_fatty_acids;
    @androidx.room.ColumnInfo(name = "cholesterol")
    private double cholesterol;
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
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
    
    public final double getEnergy() {
        return 0.0;
    }
    
    public final void setEnergy(double p0) {
    }
    
    public final double getProtein() {
        return 0.0;
    }
    
    public final void setProtein(double p0) {
    }
    
    public final double getTotal_lipid() {
        return 0.0;
    }
    
    public final void setTotal_lipid(double p0) {
    }
    
    public final double getCarbohydrate() {
        return 0.0;
    }
    
    public final void setCarbohydrate(double p0) {
    }
    
    public final double getFiber() {
        return 0.0;
    }
    
    public final void setFiber(double p0) {
    }
    
    public final double getSugar() {
        return 0.0;
    }
    
    public final void setSugar(double p0) {
    }
    
    public final double getNa() {
        return 0.0;
    }
    
    public final void setNa(double p0) {
    }
    
    public final double getSaturated_fatty_acids() {
        return 0.0;
    }
    
    public final void setSaturated_fatty_acids(double p0) {
    }
    
    public final double getTrans_fatty_acids() {
        return 0.0;
    }
    
    public final void setTrans_fatty_acids(double p0) {
    }
    
    public final double getCholesterol() {
        return 0.0;
    }
    
    public final void setCholesterol(double p0) {
    }
    
    public barcode(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String barcode_value, @org.jetbrains.annotations.NotNull()
    java.lang.String item, double energy, double protein, double total_lipid, double carbohydrate, double fiber, double sugar, double Na, double saturated_fatty_acids, double trans_fatty_acids, double cholesterol) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    public final double component4() {
        return 0.0;
    }
    
    public final double component5() {
        return 0.0;
    }
    
    public final double component6() {
        return 0.0;
    }
    
    public final double component7() {
        return 0.0;
    }
    
    public final double component8() {
        return 0.0;
    }
    
    public final double component9() {
        return 0.0;
    }
    
    public final double component10() {
        return 0.0;
    }
    
    public final double component11() {
        return 0.0;
    }
    
    public final double component12() {
        return 0.0;
    }
    
    public final double component13() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.mlkit.md.database.barcode copy(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String barcode_value, @org.jetbrains.annotations.NotNull()
    java.lang.String item, double energy, double protein, double total_lipid, double carbohydrate, double fiber, double sugar, double Na, double saturated_fatty_acids, double trans_fatty_acids, double cholesterol) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}