package com.example.musicapp.pages

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.musicapp.myComponents.LazyColumnComponent
import com.example.musicapp.myComponents.TopBarraMain


@Composable
fun MainScreen(){


        TopBarraMain() {

            LazyColumnComponent()

        }

}
@Preview
@Composable
fun MainPreview(){

    MainScreen()

}