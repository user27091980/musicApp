package com.example.musicapp.myComponents

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.FilterChip
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.musicapp.R

/**
 * @author Andrés
 */
@Composable
fun FlowAe() {

    FlowRow(modifier = Modifier.padding(8.dp)) {
        TagItem(stringResource(R.string.idm))
        TagItem(stringResource(R.string.experimental))
    }

}

@Composable
fun FlowAphx() {

    FlowRow(modifier = Modifier.padding(8.dp)) {
        TagItem(stringResource(R.string.idm))
        TagItem(stringResource(R.string.experimental))

    }
}

@Composable
fun FlowBoc() {

    FlowRow(modifier = Modifier.padding(8.dp)) {
        TagItem(stringResource(R.string.idm))
        TagItem(stringResource(R.string.experimental))
    }
}

@Composable
fun FlowKyuss() {

    FlowRow(modifier = Modifier.padding(10.dp)) {
        TagItem(stringResource(R.string.stoner))
        TagItem(stringResource(R.string.dessert))

    }
}

@Composable
fun FlowTool() {

    FlowRow(modifier = Modifier.padding(10.dp)) {
        TagItem(stringResource(R.string.metal))
        TagItem(stringResource(R.string.altmetal))
    }
    FlowRow(modifier = Modifier.padding(10.dp)){
        TagItem(stringResource(R.string.toolInfo))
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

