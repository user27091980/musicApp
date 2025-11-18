package com.example.musicapp.myComponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.musicapp.data.DatasourceStonerPics
import com.example.musicapp.data.StonerBandsId

/**
 * @author="Andrés"
 * @param
 * @function
 */

/*
Componente LazyRow recoge las imagnes de la listas de el paquete data de las clases ElectBandsId
y DataSourceElectronicBandPics para poder añadirlas a la fila.
 */
@Composable
fun ImagesStonerList(stonerList: List<StonerBandsId>, modifier: Modifier = Modifier) {

    LazyRow(modifier = modifier.padding(5.dp, 75.dp)) {

        items(stonerList) {

                stonerBandsId ->
            ImagesStoner(

                stonerId =stonerBandsId,

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
Recoge los ids de ElectBandsId para poder configurar esas imágenes dentro de cada recuadro
del lazyRow
 */
@Composable
fun ImagesStoner(stonerId: StonerBandsId) {

    val imageModifier = Modifier
        .size(300.dp)


    Box{
        Image(
            painter = painterResource(stonerId.stonerResourceId),
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
fun LazyRowComponentStoner() {

    ImagesStonerList(stonerList = DatasourceStonerPics().LoadStonerBands())

}