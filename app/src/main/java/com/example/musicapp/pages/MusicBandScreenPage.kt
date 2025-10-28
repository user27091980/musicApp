package com.example.musicapp.pages

import LazyRowComponent
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.musicapp.myComponents.TopBarBands


@Composable
fun MusicBandScreen(){
    TopBarBands {

        LazyRowComponent()

    }


}
@Preview
@Composable
fun MusicBandPreview(){
        MusicBandScreen()
}