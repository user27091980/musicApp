package com.example.musicapp.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.musicapp.R
import com.example.musicapp.myComponents.BottomAppBarComponent
import com.example.musicapp.myComponents.TopBarUser
import com.example.musicapp.myComponents.UserCardsComponents
import com.example.musicapp.styles.imageModifier

@Composable
fun UserInfoScreenPage(){

    TopBarUser() {
        UserCardsComponents()
    }

}


@Preview
@Composable
fun UserPrev(){

    UserInfoScreenPage()

}