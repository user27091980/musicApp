package com.example.musicapp.myComponents

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.musicapp.R

@Composable
fun DropDownMenu(){

    var expanded by remember { mutableStateOf(false) }

    IconButton(onClick = { expanded = !expanded }) {
        Icon(
            imageVector = Icons.Default.Menu,
            contentDescription = "",
            modifier = Modifier.padding(start=8.dp)
        )
    }
    DropdownMenu(
        expanded = expanded,
        onDismissRequest = { expanded = false }
    ) {
        DropdownMenuItem(onClick = { /* Handle action */ }) {
            Text("inicio")
        }
        DropdownMenuItem(onClick = { /* Handle action */ }) {
            Text("configuracion")
        }
        DropdownMenuItem(onClick = { /* Handle action */ }) {
            Text("salir")
        }
    }
}


