package com.example.musicapp.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.musicapp.R
import com.example.musicapp.myComponents.LazyRowComponentBoc
import com.example.musicapp.myComponents.LazyRowComponentKyuss
import com.example.musicapp.styles.anotherRowMod
import com.example.musicapp.styles.boxModifier
import com.example.musicapp.styles.rowModifier

@Composable
fun BandKyuss(modifier: Modifier = Modifier) {

    Box(boxModifier) {
        Row(rowModifier) {
            Image(
                painter = painterResource(R.drawable._98_logo),
                contentDescription = "",
                contentScale = ContentScale.Inside,
            )
        }
        Row(anotherRowMod) {

            LazyRowComponentKyuss()

        }
    }
}

@Preview
@Composable
fun BandKyussPrev() {
    BandKyuss()
}
