package com.example.musicapp.myComponents

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.musicapp.R
import com.example.musicapp.styles.estiloTextoBotones

@Composable
fun ButtonLogin(modifer: Modifier =Modifier){

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
fun ButtonRegister(modifer: Modifier =Modifier){

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

@Composable
fun ButtonAcept(modifer: Modifier =Modifier){

    Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.surface
        )
    ){
        Text(text = stringResource(R.string.boton_aceptar),
            style = estiloTextoBotones)
    }
}

@Composable
fun ButtonCancel(modifer: Modifier =Modifier){

    Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.surface
        )
    ){
        Text(text = stringResource(R.string.boton_cancelar),
            style = estiloTextoBotones)
    }
}


