package com.kat4x.jetpackcomposepokedex.data.remote.responses


import com.google.gson.annotations.SerializedName

data class GameIndice(
    @SerializedName("game_index")
    var gameIndex: Int?,
    @SerializedName("version")
    var version: Version?
)