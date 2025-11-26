package com.example.musicapp.myComponents

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.musicapp.R
import com.example.musicapp.styles.boxModifier
import com.example.musicapp.styles.cardModifier
import com.example.musicapp.styles.colModifier
import com.example.musicapp.styles.estiloTexto

/**
 * @author Perfecto
 * @param
 * @function
 */
@Composable
fun UserCardsComponents(modifier: Modifier = Modifier, materialTheme: Any) {

    Box(boxModifier) {
        Column(colModifier) {

            Text(
                text = stringResource(R.string.perfil), style = estiloTexto
            )

            //fila priemra
            Card(cardModifier) {
                Text(
                    text = stringResource(R.string.usuario), style = estiloTexto
                )
            }
            //fila priemra
            Card(
                cardModifier
            ) {


                Text(
                    text = stringResource(R.string.nombre),
                    style = estiloTexto
                )

            }


            //fila priemra
            Card(cardModifier) {

                Text(
                    text = stringResource(R.string.ciudad),
                    style = estiloTexto,
                )
            }

            //fila priemra
            Card(cardModifier) {

                Text(
                    text = stringResource(R.string.pais),
                    style = estiloTexto,
                )
            }

            Card(cardModifier) {

                Text(
                    text = stringResource(R.string.email),
                    style = estiloTexto,
                )
            }
        }
    }
}


