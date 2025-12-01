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

/**
 * @author perfecto
 * @function
 * @param
 */
//Componentes botones de todo el programa.
//boton login
@Composable
fun ButtonLogin(modifier: Modifier = Modifier) {

    Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.primary
        )
    )
    {

        Text(
            text = stringResource(R.string.boton_login),
            style = estiloTextoBotones,
        )
    }
}

/**
 * @author perfecto
 * @function
 * @param
 */
//boton para el registro
@Composable
fun ButtonRegister(modifier: Modifier = Modifier) {

    Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.primary
        )
    ) {
        Text(
            text = stringResource(R.string.boton_register),
            style = estiloTextoBotones
        )
    }
}

/**
 * @author perfecto
 * @function
 * @param
 */
//botón para aceptar
@Composable
fun ButtonAcept(modifier: Modifier = Modifier) {

    Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.primary,

            ),


        ) {
        Text(
            text = stringResource(R.string.boton_aceptar),
            style = estiloTextoBotones
        )
    }
}

/**
 * @author perfecto
 * @function
 * @param
 */
//botón de cancelación
@Composable
fun ButtonCancel(modifier: Modifier = Modifier) {

    Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.primary
        )
    ) {
        Text(
            text = stringResource(R.string.boton_cancelar),
            style = estiloTextoBotones
        )
    }
}


