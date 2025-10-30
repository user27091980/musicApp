package com.example.musicapp.myComponents

import android.R.attr.label
import android.R.attr.singleLine
import android.R.attr.text
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldLabelScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun RegisterScreenTextFieldComponent() {

    val boxModifier = Modifier
        .background(color = MaterialTheme.colorScheme.background)
        .fillMaxSize()

    val rowModifier = Modifier
        .background(color = MaterialTheme.colorScheme.background)
    //var password by rememberSaveable { mutableStateOf("") }
    // var passwordHidden by rememberSaveable { mutableStateOf(true) }


    Box {
        Column {

           TextField(
               value = String,
               state = null,
               label = {  },
               singleLine = true,
               /*onValueChange = {
                    text = it
                }*/
           )

            TextField(
                value = String,
                label = { Text(text = "password") },
                onValueChange: (String) -> Unit,

                singleLine = true
                /*onValueChange = {
                    text = it
                }*/
            )

            TextField(
                value = String,
                state
                label = { Text(text = "email") },
                singleLine = true,
                /*leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = "emailIcon"
                    )
                },*/
                /*onValueChange = {
                    text = it
                }*/
            )


        }
        Row(){

            BotonAceptar()
            BotonCancelar()
        }
    }
}


