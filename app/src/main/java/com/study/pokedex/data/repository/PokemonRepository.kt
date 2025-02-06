package com.study.pokedex.data.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.liveData
import com.study.pokedex.data.model.PokemonInfo
import com.study.pokedex.data.model.Sprites
import com.study.pokedex.data.model.Type
import com.study.pokedex.data.model.Types
import com.study.pokedex.ui.page.home.mapper.mapToUiModel
import com.study.pokedex.ui.page.home.model.PokemonItemDetail
import kotlinx.coroutines.delay
import javax.inject.Inject

class PokemonRepository @Inject constructor() {
    private val pokemonList: List<PokemonInfo> = listOf(
        PokemonInfo(
            name = "Bulbassaur",
            height = 7,
            weight = 69,
            sprites = Sprites(
                back_default = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/back/1.png",
                front_default = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/back/shiny/1.png",
                back_shiny = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/1.png",
                front_shiny = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/shiny/1.png"
            ),
            arrayListOf(
                Types(
                    slot = 0,
                    type = Type(
                        name = "grass"
                    )
                )
            )
        ),
        PokemonInfo(
            name = "Ivysaur",
            height = 10,
            weight = 130,
            sprites = Sprites(
                back_default = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/back/2.png",
                front_default = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/back/shiny/2.png",
                back_shiny = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/2.png",
                front_shiny = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/shiny/2.png"
            ),
            arrayListOf(
                Types(
                    slot = 0,
                    type = Type(
                        name = "grass"
                    )
                )
            )
        ),
        PokemonInfo(
            name = "Venusaur",
            height = 20,
            weight = 1000,
            sprites = Sprites(
                back_default = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/back/3.png",
                front_default = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/back/shiny/3.png",
                back_shiny = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/3.png",
                front_shiny = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/shiny/3.png"
            ),
            arrayListOf(
                Types(
                    slot = 0,
                    type = Type(
                        name = "grass"
                    )
                )
            )
        ),
        PokemonInfo(
            name = "Charmander",
            height = 6,
            weight = 85,
            sprites = Sprites(
                back_default = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/back/4.png",
                front_default = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/back/shiny/4.png",
                back_shiny = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/4.png",
                front_shiny = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/shiny/4.png"
            ),
            arrayListOf(
                Types(
                    slot = 0,
                    type = Type(
                        name = "fire"
                    )
                )
            )
        ),
        PokemonInfo(
            name = "Charmeleon",
            height = 11,
            weight = 190,
            sprites = Sprites(
                back_default = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/back/5.png",
                front_default = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/back/shiny/5.png",
                back_shiny = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/5.png",
                front_shiny = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/shiny/5.png"
            ),
            arrayListOf(
                Types(
                    slot = 0,
                    type = Type(
                        name = "fire"
                    )
                )
            )
        ),
        PokemonInfo(
            name = "Charizard",
            height = 17,
            weight = 905,
            sprites = Sprites(
                back_default = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/back/6.png",
                front_default = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/back/shiny/6.png",
                back_shiny = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/6.png",
                front_shiny = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/shiny/6.png"
            ),
            arrayListOf(
                Types(
                    slot = 0,
                    type = Type(
                        name = "fire"
                    )
                )
            )
        ),
        PokemonInfo(
            name = "Squirtle",
            height = 5,
            weight = 90,
            sprites = Sprites(
                back_default = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/back/7.png",
                front_default = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/back/shiny/7.png",
                back_shiny = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/7.png",
                front_shiny = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/shiny/7.png"
            ),
            arrayListOf(
                Types(
                    slot = 0,
                    type = Type(
                        name = "water"
                    )
                )
            )
        ),
        PokemonInfo(
            name = "Wartortle",
            height = 10,
            weight = 225,
            sprites = Sprites(
                back_default = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/back/8.png",
                front_default = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/back/shiny/8.png",
                back_shiny = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/8.png",
                front_shiny = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/shiny/8.png"
            ),
            arrayListOf(
                Types(
                    slot = 0,
                    type = Type(
                        name = "water"
                    )
                )
            )
        ),
        PokemonInfo(
            name = "Pichu",
            height = 3,
            weight = 20,
            sprites = Sprites(
                back_default = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/back/9.png",
                front_default = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/back/shiny/9.png",
                back_shiny = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/9.png",
                front_shiny = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/shiny/9.png"
            ),
            arrayListOf(
                Types(
                    slot = 0,
                    type = Type(
                        name = "electric"
                    )
                )
            )
        ),
        PokemonInfo(
            name = "Pikachu",
            height = 4,
            weight = 60,
            sprites = Sprites(
                back_default = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/back/10.png",
                front_default = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/back/shiny/10.png",
                back_shiny = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/10.png",
                front_shiny = "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/shiny/10.png"
            ),
            arrayListOf(
                Types(
                    slot = 0,
                    type = Type(
                        name = "electric"
                    )
                )
            )
        )
    )

    // TODO - Fix this
    fun getPokemonList(): MutableLiveData<List<PokemonItemDetail>> = MutableLiveData()
}
