package com.example.musicapp.myComponents

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.FilterChip
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

/**
 * @author Andrés
 */
@Composable
fun FlowAe(){

    FlowRow(modifier = Modifier.padding(8.dp)){
        TagItem("idm")

    }
}

@Composable
fun FlowAphx(){

    FlowRow(modifier = Modifier.padding(8.dp)){
        TagItem("idm")

    }
}

@Composable
fun FlowBoc(){

    FlowRow(modifier = Modifier.padding(8.dp)){
        TagItem("idm")

    }
}

@Composable
fun FlowKyuss(){

    FlowRow(modifier = Modifier.padding(8.dp)){
        TagItem("idm")

    }
}
@Composable
fun FlowTool(){

    FlowRow(modifier = Modifier.padding(8.dp)){
        TagItem("idm")

    }
}
@Composable
fun TagItem(text: String, onClick: () -> Unit = {}) {
    FilterChip(
        modifier = Modifier.padding(end = 4.dp),
        onClick = onClick,
        leadingIcon = {},
        border = BorderStroke(1.dp, Color(0xFF3B3A3C)),
        label = {
            Text(text)
        },
        selected = false
    )
}

