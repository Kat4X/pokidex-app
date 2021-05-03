package com.kat4x.jetpackcomposepokedex.repository

import com.kat4x.jetpackcomposepokedex.data.remote.PokeApi
import com.kat4x.jetpackcomposepokedex.data.remote.responses.Pokemon
import com.kat4x.jetpackcomposepokedex.data.remote.responses.PokemonList
import com.kat4x.jetpackcomposepokedex.util.Resource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class PokemonRepository @Inject constructor(
    private val service: PokeApi
) {

    suspend fun getPokemonList(limit: Int, offset: Int): Resource<PokemonList> {
        val response = try {
            service.getPokemonList(limit, offset)
        } catch (e: Exception) {
            return Resource.Error("An unknown error occurred.")
        }
        return Resource.Success(response)
    }

    suspend fun getPokemonInfo(name: String): Resource<Pokemon> {
        val response = try {
            service.getPokemonInfo(name = name)
        } catch (e: Exception) {
            return Resource.Error("An unknown error occurred.")
        }
        return Resource.Success(response)
    }

}