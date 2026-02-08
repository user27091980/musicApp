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
import com.example.musicapp.view.myComponents.LazyRowComponentBoc
import com.example.musicapp.vista.myComponents.CardColumnBocComponent

/**
 * @author Andrés
 */
@Composable
fun BandBoc() {

    Box(boxModifier) {

        Row(rowModifier) {
            Image(
                painter = painterResource(R.drawable.boards_of_canada_by_necronomiconofgod_d6ycbne_fullview),
                contentDescription = "",
                contentScale = ContentScale.Inside,
            )
        }
        Row(rowCardModifier) {
            CardColumnBocComponent()
        }

        Row(lazyRowMod) {

            LazyRowComponentBoc()

        }
    }
}


@Preview
@Composable
fun BandBocPrev() {

    BandBoc()

}