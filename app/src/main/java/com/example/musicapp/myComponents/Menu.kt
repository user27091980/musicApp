package com.example.musicapp.myComponents

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TopMenu(){

    Box(
        modifier = Modifier
            .padding(16.dp)
    ) {
        IconButton(onClick = { TODO() }) {
            TODO()
        }
        DropdownMenu(
            TODO(),
            onDismissRequest = TODO(),
            modifier = TODO(),
            offset = TODO(),
            scrollState = TODO(),
            properties = TODO(),
            shape = TODO(),
            containerColor = TODO(),
            tonalElevation = TODO(),
            shadowElevation = TODO(),
            border = TODO()
        ) {
            DropdownMenuItem(
                TODO(),
                onClick = TODO(),
                modifier = TODO(),
                leadingIcon = TODO(),
                trailingIcon = TODO(),
                enabled = TODO(),
                colors = TODO(),
                contentPadding = TODO(),
                interactionSource = TODO()
            )
            DropdownMenuItem(
                TODO(),
                onClick = TODO(),
                modifier = TODO(),
                leadingIcon = TODO(),
                trailingIcon = TODO(),
                enabled = TODO(),
                colors = TODO(),
                contentPadding = TODO(),
                interactionSource = TODO()
            )
            DropdownMenuItem(
                TODO(),
                onClick = TODO(),
                modifier = TODO(),
                leadingIcon = TODO(),
                trailingIcon = TODO(),
                enabled = TODO(),
                colors = TODO(),
                contentPadding = TODO(),
                interactionSource = TODO()
            )
        }
    }
}