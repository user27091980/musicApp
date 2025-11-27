package com.example.musicapp.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.musicapp.styles.button
import com.example.musicapp.myComponents.ButtonLogin
import com.example.musicapp.myComponents.ButtonRegister

/**
 * @author Perfecto
 * @param
 * @function
 */
@Composable
fun LoginScreenPage() {

    Box(
        Modifier
            .background(MaterialTheme.colorScheme.background)
    ) {


        Row(
            modifier = Modifier
                .padding(150.dp, 350.dp)
        ) {

            ButtonLogin(button)


        }
        Row(
            modifier = Modifier
                .padding(141.dp, 400.dp)
        ) {
            ButtonRegister(button)
        }
    }
}

@Preview
@Composable
fun LoginScreenPagePreview() {
    LoginScreenPage()
}