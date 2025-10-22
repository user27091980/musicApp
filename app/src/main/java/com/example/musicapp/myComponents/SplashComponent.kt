package com.example.musicapp.myComponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.musicapp.R
import com.example.musicapp.estilos.boxModifier
import com.example.musicapp.estilos.estiloTexto
import com.example.musicapp.estilos.estiloTextoTitulo
import com.example.musicapp.estilos.rowModifierButtom
import com.example.musicapp.estilos.rowModifierMiddle

@Composable
fun SplashScreen(){

    Box(boxModifier) {

        Image(
            painter = painterResource(R.drawable.portrait),
            contentDescription = "",
            )


    }
}

@Preview
@Composable
fun SplashPreview(){

    SplashScreen()
}