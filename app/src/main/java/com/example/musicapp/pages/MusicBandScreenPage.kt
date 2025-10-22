package com.example.musicapp.pages

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.musicapp.myComponents.LazyRowComponent

@Composable
fun MusicBandScreen(){

    LazyRowComponent()
}

@Preview
@Composable
fun MusicBandPreview(){

    MusicBandScreen()
}