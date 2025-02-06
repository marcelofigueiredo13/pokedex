package com.study.pokedex.ui.page.home.mapper

import com.study.pokedex.data.model.PokemonInfo
import com.study.pokedex.ui.page.home.model.PokemonItemDetail

fun PokemonInfo.mapToUiModel() = PokemonItemDetail(
    this.name,
    this.height,
    this.weight,
    this.sprites,
    this.types,
    typeToColorMap[this.types[0].type.name] ?: 0
)

private val typeToColorMap = mapOf(
    "grass" to 0xFF49d0b0,
    "fire" to 0xffff6666,
    "water" to 0xff66ccff,
    "electric" to 0xffffd164,
    "bug" to 0xFF49d0b0,
    "poison" to 0xFF8364FF,
    "flying" to 0xFF64E0FF,
    "normal" to 0xFFC6BDB4
)
