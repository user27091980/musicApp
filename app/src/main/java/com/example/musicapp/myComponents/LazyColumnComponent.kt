package com.example.musicapp.myComponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.musicapp.data.DatasourceMainScreenPics
import com.example.musicapp.data.ImagesId

/**
 * @param
 * @function
 */

//Función que recorrerá el DataSourcesPics le pasamos un modifier y una lista por parámetro

@Composable
fun ImagesList(imagesList:List<ImagesId>,modifier: Modifier=Modifier){

    LazyColumn(modifier=modifier) {

        items(imagesList){

            imagesId ->Images(
                imagesId = imagesId,
                //añadir clickable

            )
        }
    }

}
/**
 * @param
 * @function
 */
//creamos la función imagen para poder acceder a ellas y poder realizar el contenscale
//pasamos como parámetro un imagesId
@Composable
fun Images(imagesId: ImagesId){
    Box() {
        Image(
            painter = painterResource(imagesId.imageResourceId),
            contentDescription = "",
            contentScale = ContentScale.Inside,
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
fun LazyColumnComponent(){

    ImagesList(imagesList = DatasourceMainScreenPics().LoadImagesId())

}


