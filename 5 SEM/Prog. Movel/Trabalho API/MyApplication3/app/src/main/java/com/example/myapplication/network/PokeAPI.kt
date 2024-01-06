package com.example.myapplication.network

import com.example.myapplication.data.Pokemon
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create
import retrofit2.http.GET

const val BASE_URL= "https://pokeapi.co/api/v2"

private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

private val retrofit=Retrofit.Builder()
    .baseUrl(BASE_URL)
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .build()

interface PokeAPI{
    @GET("pokemon/ditto")
    suspend fun getPokemon():List<Pokemon>
}
object PokemonAPI{
    val retrofitService:PokemonAPI by lazy {
        retrofit.create(PokemonAPI::class.java)
    }
}