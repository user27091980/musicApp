package com.example.musicapp.data.modelo

import androidx.annotation.DrawableRes

/**
 * @author="Andrés"

 */
/*clase de datos  para las imágenes, permitirá recorrer en una lista para poder añadirlas
a lazy column*/
data class AlbumsDTO(@DrawableRes val discsResourceId: Int)