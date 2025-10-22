package com.example.musicapp.myComponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.musicapp.R
import com.example.musicapp.estilos.estiloTexto
import com.example.musicapp.estilos.estiloTextoTitulo
import com.example.musicapp.estilos.imageModifier

@Composable
fun SplashScreenComponent(){

    Box {

        Text(stringResource(R.string.app_name),
            style = estiloTextoTitulo)

        Image(
            painter = painterResource(R.drawable.portrait),
            contentDescription = "",
            modifier = imageModifier
            )

        Text(stringResource(R.string.null_software),
            style = estiloTexto)

    }
}

