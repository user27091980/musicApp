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
import com.example.musicapp.vista.myComponents.FlowAe
import com.example.musicapp.vista.myComponents.LazyCardColumnAeComponent
import com.example.musicapp.vista.myComponents.LazyRowComponentAe

/**
 * @author Andrés
 */
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
            Row(rowCardModifier) {
                LazyCardColumnAeComponent()
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
