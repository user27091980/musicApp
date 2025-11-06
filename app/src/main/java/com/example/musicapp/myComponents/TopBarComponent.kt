package com.example.musicapp.myComponents

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

//componente de topAppBar
@Composable
fun TopBar() {

    var expanded by remember { mutableStateOf(false) }

    Row(modifier = Modifier.fillMaxSize()) {
        //cuenta
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 10.dp)
                .wrapContentSize(align = Alignment.TopStart),
            contentAlignment = Alignment.Center
        ) {
            IconButton(onClick = {
                expanded = true

            }) {
                Icon(
                    imageVector = Icons.Default.Menu,
                    contentDescription = "menú"
                )

            }

        }
    }
}



@Composable
fun DropMenu() {
    var isExpanded by remember {
        mutableStateOf(false)
    }
    // var isButtonClicked by remember { mutableStateOf(false) }

    Column(Modifier.padding(8.dp)) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentSize(Alignment.TopEnd)
        ) {
            IconButton(onClick = { isExpanded = !isExpanded }) {

            }
            DropdownMenu(expanded = isExpanded, onDismissRequest = { isExpanded = false }) {
                DropdownMenuItem(
                    text = { Text(text = "inicio") },
                    onClick = { })
                DropdownMenuItem(
                    text = { Text(text = "pérfil") },
                    onClick = { })
                DropdownMenuItem(
                    text = { Text(text = "exit") },
                    onClick = { })
            }
        }

    }
}






