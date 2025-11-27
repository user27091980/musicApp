package com.example.musicapp.pages

import android.inputmethodservice.Keyboard
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.musicapp.R
import com.example.musicapp.myComponents.CardBandAeComponent
import com.example.musicapp.myComponents.CardBandBocComponent
import com.example.musicapp.myComponents.LazyRowComponentBoc
import com.example.musicapp.styles.lazyRowMod
import com.example.musicapp.styles.boxModifier
import com.example.musicapp.styles.rowBocTextModifier
import com.example.musicapp.styles.rowCardModifier
import com.example.musicapp.styles.rowModifier
import com.example.musicapp.styles.rowTextModifier

@Composable
fun BandBoc(modifier: Modifier = Modifier) {

    Box(boxModifier) {
        Row(rowModifier) {
            Image(
                painter = painterResource(R.drawable.boards_of_canada_by_necronomiconofgod_d6ycbne_fullview),
                contentDescription = "",
                contentScale = ContentScale.Inside,
            )
        }

        Row(rowBocTextModifier) {
            Text(stringResource(R.string.bocText))
        }
        Row(rowCardModifier) {
            CardBandBocComponent()
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
