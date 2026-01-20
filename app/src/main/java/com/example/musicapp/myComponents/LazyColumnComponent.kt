package com.example.musicapp.myComponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.musicapp.data.DatasourceMainScreenPics
import com.example.musicapp.data.BandsId
import com.example.musicapp.styles.lazyColumnCardModifier
import com.example.musicapp.styles.styleTextCards

/**
 * @author="Andrés"
 * @param
 * @function
 */
//Función que recorrerá el DataSourcesPics le pasamos un modifier y una lista por parámetro

@Composable
fun CardsList(cardsList: List<BandsId>, modifier: Modifier = Modifier) {
    Box(lazyColumnCardModifier) {
        LazyColumn(modifier = modifier) {

            items(cardsList) {

                    imagesId ->
                Cards(
                    bandsId = imagesId,
                    //añadir clickable

                )
            }
        }
    }
}

/**
 * @author="Andrés"
 * @param
 * @function
 */
//creamos la función imagen para poder acceder a ellas y poder realizar el contenscale
//pasamos como parámetro un bandsId
@Composable
fun Cards(bandsId: BandsId) {

    Card() {

        Image(
            painter = painterResource(bandsId.imageResourceId),
            contentDescription = "",
            contentScale = ContentScale.Fit,
        )
        Text(

            text = stringResource(bandsId.stringResourceId),
            style = styleTextCards
        )

    }

}

/**
 * @author="Andrés"
 * @param
 * @function
 */
//a esta función le mandamos la función ImagesList se crea un imagesList para
//que recorra el DataSourcesPics.
@Composable
fun LazyColumnComponent(modifier: Modifier = Modifier) {

    CardsList(cardsList = DatasourceMainScreenPics().LoadImagesId())

}


