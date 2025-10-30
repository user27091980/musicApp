package com.example.musicapp.pages

import android.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.musicapp.myComponents.BotonAceptar
import com.example.musicapp.myComponents.BotonCancelar
import com.example.musicapp.myComponents.TextFieldsComponent
import com.example.musicapp.styles.imageModifier

@Composable

fun RegisterScreenPage(){

    Box (Modifier.fillMaxSize()){

        Image(
            painter = painterResource(com.example.musicapp.R.drawable.portrait),
            contentDescription = "",
            modifier = imageModifier,
            contentScale = ContentScale.Crop)

        Column(Modifier.padding(30.dp,200.dp),
            verticalArrangement = Arrangement.SpaceAround
        ) {
            TextFieldsComponent()
        }

        Row(Modifier.padding(100.dp,400.dp),
            horizontalArrangement =Arrangement.SpaceAround,
            ) {
            BotonAceptar()
            BotonCancelar()
        }
    }

}

@Preview
@Composable
fun RegPreview(){
    RegisterScreenPage()
}