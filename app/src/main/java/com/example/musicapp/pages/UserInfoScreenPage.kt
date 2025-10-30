package com.example.musicapp.pages

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.musicapp.myComponents.TopBarUser
import com.example.musicapp.myComponents.UserCardsComponents

@Composable
fun UserInfo(){

    TopBarUser() {
        UserCardsComponents()
    }
}


@Preview
@Composable
fun UserPrev(){

    TopBarUser() {
        UserCardsComponents()
    }
}