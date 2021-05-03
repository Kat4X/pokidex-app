package com.kat4x.jetpackcomposepokedex.data.remote.responses


import com.google.gson.annotations.SerializedName

data class RedBlue(
    @SerializedName("back_default")
    var backDefault: String?,
    @SerializedName("back_gray")
    var backGray: String?,
    @SerializedName("front_default")
    var frontDefault: String?,
    @SerializedName("front_gray")
    var frontGray: String?
)