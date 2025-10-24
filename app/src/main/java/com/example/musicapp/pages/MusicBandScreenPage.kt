package com.example.musicapp.pages

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.musicapp.myComponents.LazyRowComponent

@Composable
fun MusicBandScreen(){
    Box() {
        Column() {
            Row() {
                LazyRowComponent()
            }

            Row() {
                LazyRowComponent()
            }
        }
    }

}

@Preview
@Composable
fun MusicBandPreview(){


        MusicBandScreen()

}