package com.example.musicapp.vista.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.musicapp.R
import com.example.musicapp.styles.boxModifier
import com.example.musicapp.styles.lazyRowMod
import com.example.musicapp.styles.rowCardModifier
import com.example.musicapp.styles.rowModifier
import com.example.musicapp.vista.myComponents.LazyCardColumnToolComponent
import com.example.musicapp.vista.myComponents.LazyRowComponentTool

/**
 * @author Andrés
 */
@Composable
fun BandTool(modifier: Modifier = Modifier) {

    Box(boxModifier) {

        Row(rowModifier) {
            Image(

                painter = painterResource(R.drawable._72c6afb9c9fe878a6fa0796dcc74648),
                contentDescription = "",
                contentScale = ContentScale.Inside,

                )
        }
        Row(rowCardModifier) {

            LazyCardColumnToolComponent()

        }

        Row(lazyRowMod) {

            LazyRowComponentTool()

        }
    }
}


@Preview
@Composable
fun BandToolPrev() {

    BandTool()

}