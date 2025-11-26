package com.example.musicapp.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.musicapp.R
import com.example.musicapp.myComponents.LazyRowComponentAe
import com.example.musicapp.styles.anotherRowMod
import com.example.musicapp.styles.boxModifier
import com.example.musicapp.styles.imageModifier
import com.example.musicapp.styles.rowModifier

@Composable
fun BandAe(modifier: Modifier = Modifier) {

    Box(boxModifier) {
        Row(rowModifier) {
            Image(
                painter = painterResource(R.drawable.autechre_sticker),
                contentDescription = "",
                contentScale = ContentScale.Inside,

                )
        }
        Row(anotherRowMod) {

            LazyRowComponentAe()

        }
    }
}

@Preview
@Composable
fun BandPrev() {
    BandAe()
}
