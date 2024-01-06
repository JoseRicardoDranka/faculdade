package com.example.trabalho.viewsmodels

import androidx.annotation.DrawableRes
import com.example.trabalho.R

data class MainScreenUiState (
// mostrara qual icone estou utilizando e qual texto no TopBar

    val screenName: String = "Lista Clientes",
    @DrawableRes val fabIcon: Int = R.drawable.baseline_add_24,
    @DrawableRes val fab: Int = R.drawable.baseline_clear_24
)