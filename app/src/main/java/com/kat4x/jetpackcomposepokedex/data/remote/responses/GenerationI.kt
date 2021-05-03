package com.kat4x.jetpackcomposepokedex.data.remote.responses


import com.google.gson.annotations.SerializedName

data class GenerationI(
    @SerializedName("red-blue")
    var redBlue: RedBlue?,
    @SerializedName("yellow")
    var yellow: Yellow?
)