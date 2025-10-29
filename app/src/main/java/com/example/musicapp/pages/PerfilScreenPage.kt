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
import androidx.compose.ui.unit.dp
import com.example.musicapp.myComponents.AvatarUI
import com.example.musicapp.myComponents.BotonUI
import com.example.musicapp.myComponents.CampoTextoUI
import com.example.musicapp.myComponents.LigazonTextoUI

@Composable
fun PerfilUsuarioUI() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        AvatarUI()

        CampoTextoUI(
            etiqueta = "Nombre completo",
            valor = "Nombre Apellido"
        )

        Spacer(modifier = Modifier.height(16.dp))

        CampoTextoUI(
            etiqueta = "Email",
            valor = "usuario@ejemplo.com",
            editable = false
        )

        Spacer(modifier = Modifier.height(16.dp))

        CampoTextoUI(
            etiqueta = "Biografía",
            valor = "Amante de la música de todos los estilos.",
            altura = 120.dp,
            maxLines = 4
        )

        Spacer(modifier = Modifier.height(24.dp))

        BotonUI(texto = "Guardar cambios")

        Spacer(modifier = Modifier.height(16.dp))

        LigazonTextoUI(texto = "Cambiar contraseña")

        Spacer(modifier = Modifier.height(8.dp))

        LigazonTextoUI(texto = "Cerrar sesión")
    }
}
