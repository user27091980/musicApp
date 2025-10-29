package com.example.musicapp.myComponents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/*
@Composable
fun RegisterScreen() {
    ComponentText("Nombre")
    ComponentText("Email", FieldType.Email)
    ComponentText("Contraseña", FieldType.Password)
    ComponentText("Confirmar contraseña", FieldType.Password)
    ComponentText("Teléfono", FieldType.Phone)
    ComponentText("Edad", FieldType.Number)
    ComponentText("Género musical favorito")
    ComponentText("Artista favorito")
}
*/
class registerData(
    var completarRegistro: String = "",
    var recuperarContraseña: String = "",
    var email: String = "",
    var contraseña: String = "",
    var repetirContraseña: String = "",

)
@Composable
fun registerScreen(registerData: registerData) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CampoTextoUI(etiqueta = "Email")

        Spacer(modifier = Modifier.height(16.dp))

        CampoTextoUI(etiqueta = "Contraseña", éContrasinal = true)

        Spacer(modifier = Modifier.height(16.dp))

        CampoTextoUI(etiqueta = "Repetir Contraseña", éContrasinal = true)

        Spacer(modifier = Modifier.height(24.dp))

        BotonUI(texto = "Completar Registro")

        Spacer(modifier = Modifier.height(16.dp))

        LigazonTextoUI(texto = "Olvidaste la contraseña?")
    }
}

