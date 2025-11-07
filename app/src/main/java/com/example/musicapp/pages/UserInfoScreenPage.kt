package com.example.musicapp.pages

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.musicapp.myComponents.UserCardsComponents

/**
 * @author Perfecto
 * @param
 * @function
 */
@Composable
fun UserInfoScreenPage(modifier: Modifier=Modifier){

        UserCardsComponents()

}


@Preview
@Composable
fun UserPrev(){

    UserInfoScreenPage()

}