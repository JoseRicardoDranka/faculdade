package com.example.trabalho.data

import com.example.trabalho.R
import com.example.trabalho.models.Affirmation

class DataSource {

    fun loadAffirmations(): List<Affirmation> {

        return listOf<Affirmation>(
            Affirmation(R.string.foto1, R.drawable.fotos),
            Affirmation(R.string.foto2, R.drawable.mapa),
            Affirmation(R.string.foto3, R.drawable.capa),
            Affirmation(R.string.foto4, R.drawable.caveira),
            Affirmation(R.string.foto5, R.drawable.aguia),
            Affirmation(R.string.foto6, R.drawable.ser),
            Affirmation(R.string.foto7, R.drawable.tatuagem_3d_relogio))
    }
}