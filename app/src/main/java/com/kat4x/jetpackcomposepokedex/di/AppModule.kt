package com.kat4x.jetpackcomposepokedex.di

import com.kat4x.jetpackcomposepokedex.data.remote.PokeApi
import com.kat4x.jetpackcomposepokedex.repository.PokemonRepository
import com.kat4x.jetpackcomposepokedex.util.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun providePokemonRepository(
        service: PokeApi
    ) = PokemonRepository(service)


    @Singleton
    @Provides
    fun providePokemonApi(): PokeApi {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(Constants.BASE_URL)
            .build()
            .create(PokeApi::class.java)
    }
}