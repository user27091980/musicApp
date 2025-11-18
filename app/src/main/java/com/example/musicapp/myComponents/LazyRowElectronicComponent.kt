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
import com.example.musicapp.data.DatasourceElectronicBandsPics
import com.example.musicapp.data.ElectBandsId

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
fun ImagesElectronicList(electronicList: List<ElectBandsId>, modifier: Modifier = Modifier) {

    LazyRow(modifier = modifier.padding(5.dp, 75.dp)) {

        items(electronicList) {

                electronicsBandsId ->
            ImagesElectronic(

                electronicsId = electronicsBandsId,

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
fun ImagesElectronic(electronicsId: ElectBandsId) {

    val imageModifier = Modifier
        .size(300.dp)


    Box() {
        Image(
            painter = painterResource(electronicsId.electResourceId),
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
fun LazyRowComponentElectronics() {

    ImagesElectronicList(electronicList = DatasourceElectronicBandsPics().LoadElectronicBands())

}