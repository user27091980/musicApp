package com.example.musicapp.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.musicapp.R
import com.example.musicapp.styles.botonLogin
import com.example.musicapp.styles.botonRegister
import com.example.musicapp.myComponents.ButtonLogin
import com.example.musicapp.myComponents.ButtonRegister
import com.example.musicapp.styles.imageModifier

/**
 * @author Perfecto
 * @param
 * @function
 */
@Composable
fun LoginScreenPage() {

    Box(Modifier
        .background(MaterialTheme.colorScheme.onBackground)
    ){


        Row(modifier=Modifier
            .padding(150.dp,350.dp)
        ){

            ButtonLogin(botonLogin)


        }
        Row(modifier=Modifier
            .padding(141.dp,400.dp)){
            ButtonRegister(botonRegister)
        }
    }
}

@Preview
@Composable
fun LoginScreenPagePreview(){
    LoginScreenPage()
}