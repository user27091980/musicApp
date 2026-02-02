package com.example.musicapp.myComponents

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.FilterChip
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.unit.dp
import com.example.musicapp.R

/**
 * @author Andrés
 */
@Composable
fun FlowAe() {
    Box() {
        FlowRow(modifier = Modifier.padding(8.dp)) {
            TagItem(stringResource(R.string.idm))
            TagItem(stringResource(R.string.experimental))
        }
        FlowRow(modifier = Modifier.padding(8.dp)) {
            TagItem(stringResource(R.string.aeMiembros))
            TagItem(stringResource(R.string.webAe))

        }
        FlowRow(modifier = Modifier.padding(8.dp)) {
            TagItem(stringResource(R.string.aeDiscs))
        }
    }
}

@Composable
fun FlowAphx() {

    FlowRow(modifier = Modifier.padding(8.dp)) {
        TagItem(stringResource(R.string.idm))
        TagItem(stringResource(R.string.experimental))
    }
    FlowRow(modifier = Modifier.padding(8.dp)) {
        TagItem(stringResource(R.string.aphxMiembro))
        TagItem(stringResource(R.string.aphexWeb))

    }
    FlowRow(modifier = Modifier.padding(8.dp)) {
        TagItem(stringResource(R.string.aphxDiscs))
    }
}

@Composable
fun FlowBoc() {

    FlowRow(modifier = Modifier.padding(8.dp)) {

        TagItem(stringResource(R.string.idm))
        TagItem(stringResource(R.string.experimental))
    }
    FlowRow(modifier = Modifier.padding(8.dp)) {
        TagItem(stringResource(R.string.bocMiembros))
        TagItem(stringResource(R.string.discogSkam))
    }
    FlowRow(modifier = Modifier.padding(8.dp)) {
        TagItem(stringResource(R.string.bocDiscs))
    }
}

@Composable
fun FlowKyuss() {

    FlowRow(modifier = Modifier.padding(10.dp)) {
        TagItem(stringResource(R.string.stoner))
        TagItem(stringResource(R.string.dessert))
    }
    FlowRow(modifier = Modifier.padding(10.dp)) {
        TagItem(stringResource(R.string.kyussMiembros))
        TagItem(stringResource(R.string.kyussDisc))
        TagItem(stringResource(R.string.discografiKyuss))
    }
}

@Composable
fun FlowTool() {

    FlowRow(modifier = Modifier.padding(10.dp)) {
        TagItem(stringResource(R.string.metal))
        TagItem(stringResource(R.string.altmetal))
    }
    FlowRow(modifier = Modifier.padding(10.dp)) {
        TagItem(stringResource(R.string.toolMiembros))
        TagItem(stringResource(R.string.discoTool))
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

