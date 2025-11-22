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
                painter = painterResource(R.drawable.cb1f24a62e1d7dd75fb17bb7145ce2bb_3351133367),
                contentDescription = "",
                contentScale = ContentScale.Inside,
            )
        }
        Row(anotherRowMod){

            LazyRowComponentAe()

        }
    }
}

@Preview
@Composable
fun BandPrev() {
    BandAe()
}
