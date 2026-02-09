package com.example.musicapp.data.modelo

import androidx.annotation.DrawableRes
import androidx.compose.ui.text.LinkAnnotation

data class AlbumsClickDTO
    (@DrawableRes val imageResourceId: Int, val url: String)

