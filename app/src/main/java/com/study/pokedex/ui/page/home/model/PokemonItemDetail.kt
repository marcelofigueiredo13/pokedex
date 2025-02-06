package com.study.pokedex.ui.page.home.model

import com.study.pokedex.data.model.Sprites
import com.study.pokedex.data.model.Types

data class PokemonItemDetail(
    val name: String,
    val height: Int,
    val weight: Int,
    val sprites: Sprites,
    val types: ArrayList<Types>,
    val color: Long
)
