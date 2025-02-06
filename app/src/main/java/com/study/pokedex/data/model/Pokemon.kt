package com.study.pokedex.data.model

import com.google.gson.annotations.SerializedName

// Json to Kotlin converter - If required

data class Pokemon(
    @SerializedName(value = "name")
    val name: String,
    val url: String
)
