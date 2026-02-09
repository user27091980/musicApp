package com.example.musicapp.view.myComponents

//Layouts and LazyRow
import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items

//Compose
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.core.net.toUri

//models and data sources
import com.example.musicapp.data.dataSources.DatasourceAePics
import com.example.musicapp.data.dataSources.DatasourceAphxPics
import com.example.musicapp.data.dataSources.DatasourceBocPics
import com.example.musicapp.data.dataSources.DatasourceKyussPics
import com.example.musicapp.data.dataSources.DatasourceToolPics
import com.example.musicapp.data.modelo.AlbumsClickDTO
//images modifiers
import com.example.musicapp.styles.imageModifier

/**
 * @author="Andrés"
 * @function: generic component for shows an albums images horizontal row
 *
 * @param: imageRowList: List of AlbumsDTO that contains the imageID and albums data
 * @param: modifier: optional for lazyRow personalization
 */


@Composable
fun ImagesRowList(imagesRowList: List<AlbumsClickDTO>, modifier: Modifier = Modifier) {
    //for automatic horizontal scrolling
    LazyRow(modifier = Modifier) {
        //range each list element
        items(imagesRowList) {

                albumsId ->
            //for each album, creates a card with an image
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
fun Cards(albumsDTO: AlbumsClickDTO) {

    val context = LocalContext.current

    Box(
        modifier = Modifier.clickable {
            albumsDTO.url?.let { url ->
                try {
                    context.startActivity(Intent(Intent.ACTION_VIEW, url.toUri()))
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        }
    )
    {
        Image(
            painter = painterResource(albumsDTO.imageResourceId),
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

    ImagesRowList(imagesRowList = DatasourceAePics().loadClickableAlbumsAe())

}

/**
 *
 * @function
 */
@Composable
fun LazyRowComponentBoc() {

    ImagesRowList(imagesRowList = DatasourceBocPics().loadClickableAlbumsBoc())

}

@Composable
fun LazyRowComponentAphx() {

    ImagesRowList(imagesRowList = DatasourceAphxPics().loadClickableAlbumsAphx())

}

@Composable
fun LazyRowComponentKyuss() {

    ImagesRowList(imagesRowList = DatasourceKyussPics().loadClickableAlbumsKyuss())

}

@Composable
fun LazyRowComponentTool() {

    ImagesRowList(imagesRowList = DatasourceToolPics().loadClickableAlbumsTool())

}