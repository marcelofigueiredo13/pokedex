package com.study.pokedex.data.model

import com.google.gson.annotations.SerializedName

data class PokemonList(
    val count: Int,
    @SerializedName(value = "results")
    val pokemons: List<Pokemon>
)
