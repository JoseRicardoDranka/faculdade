package com.example.trabalho.models

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(

    @StringRes val stringResourceId: Int,// para poder comentar o nome da tatuage
    @DrawableRes val imageResourceId: Int

)
