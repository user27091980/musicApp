package com.example.musicapp.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.musicapp.myComponents.ButtonAcept
import com.example.musicapp.myComponents.ButtonCancel
import com.example.musicapp.myComponents.TextFieldsComponent
import com.example.musicapp.styles.imageModifier

/**
 * @author="Andrés"
 * @param
 * @function
 */
@Composable

fun RegisterScreenPage(){

    Box (Modifier.fillMaxSize()){
        Column(Modifier.padding(30.dp,200.dp),
            verticalArrangement = Arrangement.SpaceAround
        ) {
            TextFieldsComponent()
        }

        Row(Modifier.padding(100.dp,400.dp),
            horizontalArrangement =Arrangement.SpaceAround,
            ) {
            ButtonAcept()
            ButtonCancel()
        }
    }

}

@Preview
@Composable
fun RegPreview(){
    RegisterScreenPage()
}