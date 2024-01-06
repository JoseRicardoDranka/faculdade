package com.example.myapplication.ui.theme.views

import androidx.compose.foundation.Image
import com.example.myapplication.data.Pokemon

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.myapplication.R
import com.example.myapplication.network.BASE_URL


@Composable
fun PokemonScreen(
    pokeViewModel: PokeViewModel = viewModel()
) {
    val uiState by pokeViewModel.uiState.collectAsState()
    when (uiState) {
        is PokeUiState.Loading -> LoadingScreen()
        is PokeUiState.Success -> PokemonList((uiState as PokeUiState.Success).pokemonList)
        is PokeUiState.Error -> ErrorScreen()
    }
}

@Composable
fun LoadingScreen() {

}

@Composable
fun ErrorScreen() {

}

@Composable
fun PokemonList(
    pokemons: List<Pokemon>
) {
    LazyVerticalGrid(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray),
        columns = GridCells.Fixed(2)
    ) {
        items(pokemons) { pokemon ->
            PokeEntry(pokemon = pokemon)
        }
    }
}

@Composable
fun PokeEntry(
    pokemon: Pokemon
) {
    Card(
        modifier = Modifier.padding(6.dp),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        AsyncImage(
            data = ImageRequest.Builder(LocalContext.current)
                .data(BASE_URL + pokemon.img)
                .crossfade(true)
                .build(),
            content = { image ->
                Image(
                    painter = image.asPainter(),
                    contentDescription = pokemon.name,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.clip(CircleShape)
                )
            },
            placeholder = {
                Image(
                    painter = painterResource(R.drawable.placeholder),
                    contentDescription = pokemon.name,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.clip(CircleShape)
                )
            }
        )
    }
}