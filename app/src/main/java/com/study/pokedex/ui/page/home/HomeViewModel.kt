package com.study.pokedex.ui.page.home

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.study.pokedex.data.network.PokemonApi
import com.study.pokedex.data.repository.PokemonRepository
import com.study.pokedex.ui.page.home.mapper.mapToUiModel
import com.study.pokedex.ui.page.home.model.PokemonItemDetail
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    pokemonRepository: PokemonRepository
) : ViewModel() {
    val pokemons: MutableLiveData<List<PokemonItemDetail>> = pokemonRepository.getPokemonList()

    init {
        fillPokemonsList()
    }

    // TODO - API call should be filling the repository
    private fun fillPokemonsList() {
        viewModelScope.launch {
            val listOfPokemonUrls = PokemonApi.retrofitService.getPokemons()
            var listOfPokemonDetails = mutableListOf<PokemonItemDetail>()
            Log.i("TEST123", "List of pokemons: $listOfPokemonUrls")
            listOfPokemonUrls.pokemons.forEach { pokemon ->
                Log.i("TEST123", "Pokemon: ${pokemon.name}, Url: ${pokemon.url}")
                val pokemonData = PokemonApi.retrofitService.getPokemonData(pokemon.name)
                Log.i("TEST123", "Pokemon details: $pokemonData")
                listOfPokemonDetails.add(pokemonData.mapToUiModel())
            }
            Log.i("TEST123", "Setting the ui with: $listOfPokemonDetails")
            pokemons.postValue(listOfPokemonDetails)
        }
    }
}
