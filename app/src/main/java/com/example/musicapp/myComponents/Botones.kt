package com.example.musicapp.myComponents

import android.R
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.musicapp.estilos.estiloTexto


@Composable
fun BotonLogin(modifier: Modifier){

    Button(onClick = {}) {

       Text(text = stringResource(com.example.musicapp.R.string.boton_login),
           style = estiloTexto)

   }

}

@Composable
fun BotonRegister(modifier: Modifier){

    Button(onClick = {}){

        Text(text = stringResource(com.example.musicapp.R.string.boton_register),
            style = estiloTexto)


    }
}
