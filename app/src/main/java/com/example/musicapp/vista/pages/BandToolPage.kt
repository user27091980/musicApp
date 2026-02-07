package com.example.musicapp.vista.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.musicapp.R
import com.example.musicapp.styles.boxModifier
import com.example.musicapp.styles.lazyRowMod
import com.example.musicapp.styles.rowCardModifier
import com.example.musicapp.styles.rowFlowModifier
import com.example.musicapp.styles.rowModifier
import com.example.musicapp.vista.myComponents.FlowTool
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