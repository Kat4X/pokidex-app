package com.kat4x.jetpackcomposepokedex.data.remote.responses


import com.google.gson.annotations.SerializedName

data class GenerationIi(
    @SerializedName("crystal")
    var crystal: Crystal?,
    @SerializedName("gold")
    var gold: Gold?,
    @SerializedName("silver")
    var silver: Silver?
)