package com.example.musicapp.myComponents

import androidx.compose.foundation.background
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import com.example.musicapp.R
import com.example.musicapp.estilos.estiloTexto
import com.example.musicapp.estilos.estiloTextoBotones

@Composable
fun BotonLogin(modifier: Modifier = Modifier){

    Button(onClick = {},
            colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.surface)
    )
    {

       Text(text = stringResource(R.string.boton_login),
           style = estiloTextoBotones,
           )
    }
}

@Composable
fun BotonRegister(modifier: Modifier = Modifier){

    Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.surface
            )
    ){
        Text(text = stringResource(R.string.boton_register),
            style = estiloTextoBotones)

    }
}


