package com.example.musicapp.myComponents

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(){

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        "página principal",
                        color = Color.White
                    )
                }
            )
        },
        modifier = TODO(),
        bottomBar = TODO(),
        snackbarHost = TODO(),
        floatingActionButton = TODO(),
        floatingActionButtonPosition = TODO(),
        containerColor = TODO(),
        contentColor = TODO(),
        contentWindowInsets = TODO(),
        content = TODO()
        //Content = {lista()}
    )


}

@Composable
fun lista(){}


@Preview
@Composable
fun TopBarPre(){
    TopBar()
}