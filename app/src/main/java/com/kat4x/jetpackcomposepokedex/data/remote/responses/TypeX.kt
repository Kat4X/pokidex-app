package com.kat4x.jetpackcomposepokedex.data.remote.responses


import com.google.gson.annotations.SerializedName

data class TypeX(
    @SerializedName("name")
    var name: String?,
    @SerializedName("url")
    var url: String?
)