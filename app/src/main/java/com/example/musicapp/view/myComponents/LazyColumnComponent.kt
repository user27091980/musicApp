package com.example.musicapp.view.myComponents

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
import androidx.navigation.NavController
import com.example.musicapp.data.dataSources.DatasourceMainScreenPics
import com.example.musicapp.data.model.BandsDTO
import com.example.musicapp.styles.lazyColumnCardModifier
import com.example.musicapp.styles.styleTextCards

/**
 * @author="Andrés"
 * @param
 * @function
 */
//Función que recorrerá el DataSourcesPics le pasamos un modifier y una lista por parámetro

@Composable
fun CardsList(
    cardsList: List<BandsDTO>,
    navController: NavController.Companion,
    modifier: Modifier = Modifier
) {
    Box(lazyColumnCardModifier) {
        LazyColumn(modifier = modifier) {

            items(cardsList) { band ->
                Cards(
                    bandsDTO = band,
                    navController = navController

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
//pasamos como parámetro un bandsDTO
@Composable
fun Cards(bandsDTO: BandsDTO, navController: NavController.Companion, modifier: Modifier = Modifier) {

    Card() {

        Image(
            painter = painterResource(bandsDTO.imageResourceId),
            contentDescription = "",
            contentScale = ContentScale.Fit,
        )
        Text(

            text = stringResource(bandsDTO.stringResourceId),
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
fun LazyColumnComponent(navController: NavController.Companion, modifier: Modifier = Modifier) {

    CardsList(
        navController = navController,
        cardsList = DatasourceMainScreenPics().loadImagesId(),
        modifier = modifier
    )

}


