package com.google.mlkit.md.objectdetection

data class Object internal constructor(
        val item : String,
        val energy : Double,
        val protein : Double,
        val total_lipid : Double,
        val carbohydrate : Double,
        val fiber : Double,
        val sugar : Double,
        val Na : Double,
        val Saturated_lipid : Double,
        val trans_lipid : Double,
        val cholesterol : Double
)