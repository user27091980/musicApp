package com.example.musicapp.myComponents

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.musicapp.R
import com.example.musicapp.navigation.MainScreenPage
import com.example.musicapp.navigation.RegisterPage
import com.example.musicapp.navigation.UserInfoPage
import com.example.musicapp.styles.styleButtonText

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
        onClick = { navController.navigate(MainScreenPage) },
        modifier = Modifier.fillMaxWidth(),
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

    FilledTonalButton(
        onClick = { navController.navigate(RegisterPage) },
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(20.dp)
    ) {
        Text("Registro")
    }
}

/**
 * @author Andrés
 * @function
 * @param
 */
//botón para aceptar
@Composable
fun ButtonAcept(navController: NavController, modifier: Modifier = Modifier) {

    Button(

        onClick = { navController.navigate(UserInfoPage) },
        shape = RoundedCornerShape(20.dp)

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
fun ButtonCancel(navController: NavController,modifier: Modifier = Modifier) {

    Button(
        onClick = { navController.navigate(MainScreenPage) },
        shape = RoundedCornerShape(20.dp)

    ) {
        Text(
            text = stringResource(R.string.boton_cancelar),
            style = styleButtonText
        )
    }
}


