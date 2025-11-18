package com.example.musicapp.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.musicapp.myComponents.TextFieldsComponent
import com.example.musicapp.myComponents.UserCardsComponents
import com.example.musicapp.styles.imageModifier

/**
 * @author Andrés
 * @param
 * @function
 */
@Composable
fun UserInfoScreenPage(modifier: Modifier = Modifier) {
    Box {
        Column() {
            Image(
                painter = painterResource(com.example.musicapp.R.drawable.portrait),
                contentDescription = "",
                modifier = imageModifier,
                contentScale = ContentScale.Crop
            )
        }
        Row{
            UserCardsComponents()
        }
    }
}


@Preview
@Composable
fun UserPrev() {

    UserInfoScreenPage()

}