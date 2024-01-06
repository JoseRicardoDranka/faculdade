package com.example.myapplication.ui.theme.views

import com.example.myapplication.data.Pokemon
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.ViewModel
import com.example.myapplication.network.PokeAPI
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import retrofit2.HttpException
import java.io.IOException


sealed interface PokeUiState {
    object Loading : PokeUiState

    data class Success(val pokemonList: List<Pokemon>) : PokeUiState

    object Error : PokeUiState
}


class PokeViewModel {

    private val _uiState: MutableStateFlow<PokeUiState> = MutableStateFlow(PokeUiState.Loading)

    val uiState: StateFlow<PokeUiState> = _uiState.asStateFlow()

    init {
        getPokemon()
    }

    private fun getPokemon() {
        viewModelScope.launch {
            try {
                val pokemonList = PokeAPI.retrofitService.getPokemon()
                _uiState.value = PokeUiState.Success(pokemonList)
            } catch (e: IOException) {
                _uiState.value = PokeUiState.Error
            } catch (e: HttpException) {
                _uiState.value = PokeUiState.Error
            }
        }
    }
}