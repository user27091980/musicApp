package com.example.musicapp.myComponents

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
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
                text = "Pérfil de usuario:", style = estiloTexto
            )

            //fila priemra
            Card(cardModifier) {
                Text(
                    text = "usuario:", style = estiloTexto
                )
            }
            //fila priemra
            Card(
                cardModifier
            ) {


                Text(
                    "nombre:", style = estiloTexto
                )

            }


            //fila priemra
            Card(cardModifier) {

                Text(
                    "ciudad",
                    style = estiloTexto,
                )
            }

            //fila priemra
            Card(cardModifier) {

                Text(
                    "país",
                    style = estiloTexto,
                )
            }
        }
    }
}


