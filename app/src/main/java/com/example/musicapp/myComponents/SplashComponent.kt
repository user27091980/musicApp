package com.example.musicapp.myComponents

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.musicapp.estilos.boxModifier
import com.example.musicapp.estilos.estiloTexto
import com.example.musicapp.estilos.rowModifierButtom
import com.example.musicapp.estilos.rowModifierMiddle

@Composable
fun Splash(){

    Box(boxModifier) {

        Row(rowModifierButtom){
            Text(
                text = "null software",
                style = estiloTexto,
            )
        }

        Row(rowModifierMiddle){
            Text(
                text="MusicApp",
                style= estiloTexto,
            )
        }
    }
}

@Preview
@Composable
fun SplashPreview(){

    Splash()
}