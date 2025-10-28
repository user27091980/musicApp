package com.example.musicapp.myComponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.musicapp.R
import com.example.musicapp.estilos.boxModifier
import com.example.musicapp.estilos.columnModifierButtom
import com.example.musicapp.estilos.estiloTexto
import com.example.musicapp.estilos.estiloTextoTitulo


import com.example.musicapp.estilos.rowModifierMiddle


@Composable
fun Splash(){

    //val image = painterResource(id = R.drawable.cassette_tape_clipart_illustration)


    Box(boxModifier) {

        Column(columnModifierButtom){
            Text(
                text = stringResource(R.string.null_software),


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
                text= stringResource(R.string.music_app),
                style= estiloTextoTitulo,
            )
        }
        Image(
            painter = painterResource(R.drawable.cassette_tape_clipart_illustration),
            contentDescription = "",
            )
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