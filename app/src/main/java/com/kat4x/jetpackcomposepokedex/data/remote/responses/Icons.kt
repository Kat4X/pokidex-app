package com.kat4x.jetpackcomposepokedex.data.remote.responses


import com.google.gson.annotations.SerializedName

data class Icons(
    @SerializedName("front_default")
    var frontDefault: String?,
    @SerializedName("front_female")
    var frontFemale: Any?
)