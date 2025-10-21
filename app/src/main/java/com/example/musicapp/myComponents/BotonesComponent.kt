package com.example.musicapp.myComponents

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.musicapp.R
import com.example.musicapp.estilos.estiloTextoBotones


@Composable
fun BotonLogin(modifier: Modifier){

    Button(onClick = {}) {

       Text(text = stringResource(R.string.boton_login),
           style = estiloTextoBotones
       )

   }

}

@Composable
fun BotonRegister(modifier: Modifier){

    Button(onClick = {}){

        Text(text = stringResource(R.string.boton_register),
            style = estiloTextoBotones)


    }
}

/*@Composable
fun SkipReg(){

    Modifier.clickable(
        interactionSource = TODO(),
        indication = TODO(),
        enabled = true,
        onClickLabel ="skip",
        role = TODO(),
        onClick =
    )
}

 */