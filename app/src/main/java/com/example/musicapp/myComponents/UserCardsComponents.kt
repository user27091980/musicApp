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
import com.example.musicapp.styles.styleText

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
                text = stringResource(R.string.perfil), style = styleText
            )

            //fila priemra
            Card(cardModifier) {
                Text(
                    text = stringResource(R.string.usuario), style = styleText
                )
            }
            //fila priemra
            Card(
                cardModifier
            ) {

                Text(
                    text = stringResource(R.string.nombre),
                    style = styleText
                )

            }


            //fila priemra
            Card(cardModifier) {

                Text(
                    text = stringResource(R.string.ciudad),
                    style = styleText,
                )
            }

            //fila priemra
            Card(cardModifier) {

                Text(
                    text = stringResource(R.string.pais),
                    style = styleText,
                )
            }

            Card(cardModifier) {

                Text(
                    text = stringResource(R.string.email),
                    style = styleText,
                )
            }
        }
    }
}


