package com.example.musicapp.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.musicapp.myComponents.ButtonAcept
import com.example.musicapp.myComponents.ButtonCancel

import com.example.musicapp.myComponentsw.TextFieldsComponent
import com.example.musicapp.styles.button

/**
 * @author="Andrés"
 * @param
 * @function
 */
@Composable

fun RegisterScreenPage() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(Color.DarkGray, Color.Black) // verde Spotify → negro
                )
            )
    ) {
        Column(
            Modifier.padding(60.dp, 220.dp),

            ) {
            TextFieldsComponent()
        }

        Row(
            Modifier.padding(95.dp, 400.dp,),
        )
        {
            ButtonAcept(button)
            ButtonCancel(button)
        }

    }

}

@Preview
@Composable
fun RegPreview() {
    RegisterScreenPage()
}