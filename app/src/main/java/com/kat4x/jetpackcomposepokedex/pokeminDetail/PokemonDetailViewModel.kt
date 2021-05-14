package com.kat4x.jetpackcomposepokedex.pokeminDetail

import androidx.lifecycle.ViewModel
import com.kat4x.jetpackcomposepokedex.data.remote.responses.Pokemon
import com.kat4x.jetpackcomposepokedex.repository.PokemonRepository
import com.kat4x.jetpackcomposepokedex.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repo: PokemonRepository
) : ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        return repo.getPokemonInfo(pokemonName)
    }

}