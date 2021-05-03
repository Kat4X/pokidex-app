package com.kat4x.jetpackcomposepokedex.data.remote.responses


import com.google.gson.annotations.SerializedName

data class XY(
    @SerializedName("front_default")
    var frontDefault: String?,
    @SerializedName("front_female")
    var frontFemale: Any?,
    @SerializedName("front_shiny")
    var frontShiny: String?,
    @SerializedName("front_shiny_female")
    var frontShinyFemale: Any?
)