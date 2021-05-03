package com.kat4x.jetpackcomposepokedex.data.remote.responses


import com.google.gson.annotations.SerializedName

data class Type(
    @SerializedName("slot")
    var slot: Int?,
    @SerializedName("type")
    var type: TypeX?
)