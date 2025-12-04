package com.example.musicapp.myComponents

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.musicapp.R
import com.example.musicapp.styles.styleButtonText

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
        onClick = { /* TODO: lógica login */ },
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(20.dp)
    ) {
        Text("Login")
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

    FilledTonalButton(
        onClick = { /* TODO: lógica registro */ },
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(20.dp)
    ) {
        Text("Registro")
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

        onClick = { /* TODO: lógica login */ },
        shape = RoundedCornerShape(20.dp)

    ) {
        Text(
            text = stringResource(R.string.boton_aceptar),
            style = styleButtonText
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
        onClick = { /* TODO: lógica login */ },
        shape = RoundedCornerShape(20.dp)

    ) {
        Text(
            text = stringResource(R.string.boton_cancelar),
            style = styleButtonText
        )
    }
}


