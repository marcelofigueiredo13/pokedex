package com.study.pokedex.ui.page.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.map
import com.study.pokedex.data.PokemonDetail
import com.study.pokedex.data.PokemonRepository
import com.study.pokedex.ui.page.home.model.PokemonItemDetail
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    pokemonRepository: PokemonRepository
): ViewModel() {
    val pokemons: LiveData<List<PokemonItemDetail>> = pokemonRepository.getPokemonList()
        .map { list -> list.map { toPokemonItemDetail(it) }
    }

    private val typeToColorMap = mapOf(
        "glass" to 0xFF49d0b0,
        "fire" to 0xffff6666,
        "water" to 0xff66ccff,
        "electric" to 0xffffd164,
        "bug" to 0xFF49d0b0
    )

    private fun toPokemonItemDetail(value: PokemonDetail) = PokemonItemDetail(
        value.name,
        value.types,
        value.sprite,
        typeToColorMap[value.types.first()] ?: 0
    )
}