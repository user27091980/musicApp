package com.example.musicapp.pages

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.musicapp.myComponents.GridViewComponent
import com.example.musicapp.myComponents.TopBarAlbums


@Composable
fun DiscographyScreenPage(){

    TopBarAlbums() {

    }
    Box {

        Column(Modifier.padding(1.dp, 75.dp, 1.dp, 1.dp)) {
            GridViewComponent()
        }
    }

}


@Preview
@Composable
fun DiscoPreview(){

    DiscographyScreenPage()
}