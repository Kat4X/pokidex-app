package com.kat4x.jetpackcomposepokedex.data.remote.responses


import com.google.gson.annotations.SerializedName

data class Other(
    @SerializedName("dream_world")
    var dreamWorld: DreamWorld?,
    @SerializedName("official-artwork")
    var officialArtwork: OfficialArtwork?
)