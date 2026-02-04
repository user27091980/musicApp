package com.example.musicapp.vista.myComponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.musicapp.data.modelo.AlbumsDTO
import com.example.musicapp.data.DatasourceAePics
import com.example.musicapp.data.DatasourceAphxPics
import com.example.musicapp.data.DatasourceBocPics
import com.example.musicapp.data.DatasourceKyussPics
import com.example.musicapp.data.DatasourceToolPics
import com.example.musicapp.styles.imageModifier

/**
 * @author="Andrés"
 * @param
 * @function
 */

/*
Componente LazyRow recoge las imagnes de la listas de el paquete data de las clases  para poder añadirlas a la fila.
 */
@Composable
fun ImagesRowList(imagesRowList: List<AlbumsDTO>, modifier: Modifier = Modifier) {

    LazyRow(modifier = Modifier) {

        items(imagesRowList) {

                albumsId ->
            Cards(

                albumsDTO = albumsId,
                //añadir clickable

            )
        }
    }
}

/**
 * @author="Andrés"
 * @param
 * @function
 */
/*
Recoge los ids de AlbumsDTO para poder configurar esas imágenes dentro de cada recuadro
del lazyRow
 */
@Composable
fun Cards(albumsDTO: AlbumsDTO) {

    Box {
        Image(
            painter = painterResource(albumsDTO.discsResourceId),
            contentDescription = "",
            contentScale = ContentScale.FillWidth,
            modifier = imageModifier
        )
    }
}

/**
 *
 * @function
 */
//a esta función le mandamos la función ImagesList se crea un imagesList para
//que recorra el DataSourcesPics.
@Composable
fun LazyRowComponentAe() {

    ImagesRowList(imagesRowList = DatasourceAePics().loadAlbumsAe())

}

/**
 *
 * @function
 */
@Composable
fun LazyRowComponentBoc() {

    ImagesRowList(imagesRowList = DatasourceBocPics().loadAlbumsBoc())

}

@Composable
fun LazyRowComponentAphx() {

    ImagesRowList(imagesRowList = DatasourceAphxPics().loadAlbumsAphx())

}

@Composable
fun LazyRowComponentKyuss() {

    ImagesRowList(imagesRowList = DatasourceKyussPics().loadAlbumsKyuss())

}

@Composable
fun LazyRowComponentTool() {

    ImagesRowList(imagesRowList = DatasourceToolPics().loadAlbumsTool())

}