package com.example.musicapp.myComponents

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun TextFieldsComponent(){

    Column() {
        TextFieldUserComponent()
        TextFieldPassComponent()
        TextFieldEmailComponent()
    }
}

@Composable
fun TextFieldUserComponent(){

    var text by remember { mutableStateOf("") }

    TextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("user") }
    )
}

@Composable
fun TextFieldPassComponent(){

    var text by remember { mutableStateOf("") }

    TextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("password") }
    )

}

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