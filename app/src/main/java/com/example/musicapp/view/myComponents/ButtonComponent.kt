package com.example.musicapp.view.myComponents

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.musicapp.R
import com.example.musicapp.navigation.ObjRoutes
import com.example.musicapp.styles.styleButtonText
import com.example.musicapp.view.screens.DialogPage

/**
 * @author Andres
 * @function
 * @param
 */
//Componentes botones de todo el programa.
//boton login
@Composable
fun ButtonLogin(navController: NavController, modifier: Modifier = Modifier) {

    Button(
        onClick = { navController.navigate(ObjRoutes.LOGIN) },
        modifier = Modifier.fillMaxSize(),
        shape = RoundedCornerShape(20.dp)
    ) {
        Text("Login")
    }

}

/**
 * @author andrés
 * @function
 * @param
 */
//boton para el registro
@Composable
fun ButtonRegister(navController: NavController, modifier: Modifier = Modifier) {

    var showDialog by remember{mutableStateOf(false)}

    FilledTonalButton(
        onClick = { showDialog = true },
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(20.dp)
    ) {
        Text("Registro")
    }
    if (showDialog) {
        DialogPage(
            onConfirm = {
                navController.navigate(ObjRoutes.REGISTER) // navega al registro
                showDialog = true
            },
            onCancel = {
                showDialog = false // cierra el diálogo
            }
        )
    }
}

/**
 * @author Andrés
 * @function
 * @param
 */
//botón para aceptar
@Composable

fun ButtonAcept(onClick: () -> Unit, modifier: Modifier= Modifier) {


    Button(

        onClick = onClick,
        shape = RoundedCornerShape(20.dp),


        ) {
        Text(
            text = stringResource(R.string.boton_aceptar),
            style = styleButtonText
        )
    }
}

/**
 * @author andrés
 * @function
 * @param
 */
//botón de cancelación
@Composable
fun ButtonCancel(navController: NavController) {

    Button(
        onClick = { navController.navigate(ObjRoutes.LOGIN) },
        shape = RoundedCornerShape(20.dp),


        ) {
        Text(
            text = stringResource(R.string.boton_cancelar),
            style = styleButtonText
        )
    }
}



