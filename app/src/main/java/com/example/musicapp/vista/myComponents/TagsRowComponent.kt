package com.example.musicapp.vista.myComponents

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.FilterChip
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.unit.dp
import com.example.musicapp.R

/**
 * @author Andrés
 */
@Composable
fun TagAe() {
    Column(
        modifier = Modifier.padding(8.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp) // separación vertical entre filas
    ) {

        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        )
        {
            TagItem(stringResource(R.string.idm))
            TagItem(stringResource(R.string.experimental))
        }

        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            TagItem(stringResource(R.string.aeMiembros))
            TagItem(stringResource(R.string.webAe))
        }

        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            TagItem(stringResource(R.string.aeDiscs))
        }
    }
}


@Composable
fun TagAphx() {
    Column(
        modifier = Modifier.padding(8.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp) // separación vertical entre filas
    ) {
        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {

            TagItem(stringResource(R.string.idm))
            TagItem(stringResource(R.string.experimental))
        }
        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            TagItem(stringResource(R.string.aphxMiembro))
            TagItem(stringResource(R.string.aphexWeb))

        }
        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            TagItem(stringResource(R.string.aphxDiscs))
        }
    }
}

@Composable
fun TagBoc() {
    Column(
        modifier = Modifier.padding(8.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp) // separación vertical entre filas
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {

            TagItem(stringResource(R.string.idm))
            TagItem(stringResource(R.string.experimental))
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            TagItem(stringResource(R.string.bocMiembros))
            TagItem(stringResource(R.string.discogSkam))
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            TagItem(stringResource(R.string.bocDiscs))
        }
    }
}

@Composable
fun TagKyuss() {
    Column(
        modifier = Modifier.padding(8.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp) // separación vertical entre filas
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            TagItem(stringResource(R.string.stoner))
            TagItem(stringResource(R.string.dessert))
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            TagItem(stringResource(R.string.kyussMiembros))
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                TagItem(stringResource(R.string.kyussDisc))
            }
            Row(
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                TagItem(stringResource(R.string.discografiKyuss))
            }
        }
    }
}

@Composable
fun TagTool() {
    Column(
        modifier = Modifier.padding(8.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp) // separación vertical entre filas
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            TagItem(stringResource(R.string.metal))
            TagItem(stringResource(R.string.altmetal))
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            TagItem(stringResource(R.string.toolMiembros))
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            TagItem(stringResource(R.string.discoTool))
        }
    }
}

@Composable
fun TagItem(text: String, onClick: () -> Unit = {}) {
    FilterChip(
        modifier = Modifier.padding(end = 4.dp),
        onClick = onClick,
        leadingIcon = {},
        border = BorderStroke(3.dp, Color(0xFF3B3A3C)),
        label = {
            Text(text)
        },
        selected = false
    )
}

