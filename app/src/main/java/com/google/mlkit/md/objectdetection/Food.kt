package com.google.mlkit.md.objectdetection

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Food(val label :String,val value: Float) : Parcelable