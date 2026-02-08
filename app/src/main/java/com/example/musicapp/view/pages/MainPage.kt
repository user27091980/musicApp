package com.example.musicapp.view.pages

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.musicapp.view.myComponents.LazyColumnComponent

/**
 * @author="Andrés"
 * @param
 * @function
 */
@Composable
fun MainScreenPage(navController: NavController,modifier: Modifier = Modifier) {

    LazyColumnComponent(
        navController = NavController,
        modifier = modifier
    )

}

@Preview
@Composable
fun MainPrev() {

    val navController = rememberNavController()
    MainScreenPage(
        navController = navController,
        modifier = Modifier
    )

}
