package com.example.musicapp.myComponents

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

/**
 * @author= andres
 * @param
 */
@Composable
fun TextFieldsComponent(){

    Column() {
        TextFieldUserComponent()
        TextFieldPassComponent()
        TextFieldEmailComponent()
    }
}

/**
 * @param
 * @function
 */
@Composable
fun TextFieldUserComponent(){

    var text by remember { mutableStateOf("") }

    TextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("user") }
    )
}

/**
 * @param
 * @function
 */
@Composable
fun TextFieldPassComponent(){

    var text by remember { mutableStateOf("") }

    TextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("password") }
    )

}

/**
 * @param
 * @function
 */
@Composable
fun TextFieldEmailComponent(){

    var text by remember { mutableStateOf("") }

    TextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("email")

        }
    )
}