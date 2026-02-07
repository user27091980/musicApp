package com.example.musicapp.view.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.musicapp.R
import com.example.musicapp.styles.boxModifier
import com.example.musicapp.styles.lazyRowMod
import com.example.musicapp.styles.rowCardModifier
import com.example.musicapp.styles.rowModifier
import com.example.musicapp.view.myComponents.CardColumnAphxComponent
import com.example.musicapp.view.myComponents.LazyRowComponentAphx

/**
 * @author Andrés
 */
@Composable
fun BandAphx() {

    Box(boxModifier) {

        Row(rowModifier) {
            Image(
                painter = painterResource(R.drawable.aphx),
                contentDescription = "",
                contentScale = ContentScale.Inside,
            )
        }

        Row(rowCardModifier) {
            CardColumnAphxComponent()
        }

        Row(lazyRowMod) {

            LazyRowComponentAphx()

        }
    }
}

@Preview
@Composable
fun BandAphxPrev() {

    BandAphx()
}