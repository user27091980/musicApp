package com.example.musicapp.pages

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.musicapp.myComponents.LazyColumnComponent

/**
 * @author="Andrés"
 * @param
 * @function
 */
@Composable
fun MainScreenPage(modifier: Modifier = Modifier) {

    LazyColumnComponent()

}

@Preview
@Composable
fun MainPrev(){

    MainScreenPage()

}
