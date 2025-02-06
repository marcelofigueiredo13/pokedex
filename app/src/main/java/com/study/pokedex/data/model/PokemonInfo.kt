package com.study.pokedex.data.model

data class PokemonInfo(
    val name: String,
    val height: Int,
    val weight: Int,
    val sprites: Sprites,
    val types: ArrayList<Types>
)
