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
import com.example.musicapp.view.myComponents.LazyRowComponentAe
import com.example.musicapp.vista.myComponents.CardColumnAeComponent

/**
 * @author Andrés
 */
@Composable
fun BandAe() {

    Box(boxModifier) {

        Row(rowModifier) {
            Image(
                painter = painterResource(R.drawable.autechre_sticker),
                contentDescription = "",
                contentScale = ContentScale.Inside,
            )
        }
        Row(rowCardModifier) {
            CardColumnAeComponent()

        }


        Row(lazyRowMod) {
            LazyRowComponentAe()
        }
    }
}


@Preview
@Composable
fun BandAePrev() {

    BandAe()

}
