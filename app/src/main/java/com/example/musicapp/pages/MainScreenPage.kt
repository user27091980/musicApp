package com.example.musicapp.pages

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.musicapp.myComponents.LazyColumnComponent


@Composable
fun MainScreenPage(modifier: Modifier=Modifier){

        LazyColumnComponent()

}
@Preview
@Composable
fun MainPreviewPage(){

    MainScreenPage()

}