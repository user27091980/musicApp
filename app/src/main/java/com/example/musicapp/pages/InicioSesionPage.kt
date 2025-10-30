package com.example.musicapp.pages

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
import com.example.musicapp.myComponents.ButtonInicioSesionUsuario.BotonUI
import com.example.musicapp.myComponents.ButtonInicioSesionUsuario.CampoTextoUI
import com.example.musicapp.myComponents.ButtonInicioSesionUsuario.CheckboxUI
import com.example.musicapp.myComponents.ButtonInicioSesionUsuario.LigazonTextoUI
import com.example.musicapp.myComponents.ButtonInicioSesionUsuario.TextoTituloUI

@Composable
fun InicioSesionPage() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextoTituloUI(texto = "Benvido/a de novo!")

        CampoTextoUI(etiqueta = "Email")

        Spacer(modifier = Modifier.height(16.dp))

        CampoTextoUI(etiqueta = "Contrasinal", éContrasinal = true)

        Spacer(modifier = Modifier.height(8.dp))

        CheckboxUI(texto = "Lembrar sesión")

        Spacer(modifier = Modifier.height(24.dp))

        BotonUI(texto = "Acceder")

        Spacer(modifier = Modifier.height(16.dp))

        LigazonTextoUI(texto = "Esqueciches a contrasinal?")

        Spacer(modifier = Modifier.height(8.dp))

        LigazonTextoUI(texto = "Non tes conta? Rexístrate aquí")
    }
}

@Preview
@Composable
fun inicioSesionPagePreview() {
    InicioSesionPage()
}