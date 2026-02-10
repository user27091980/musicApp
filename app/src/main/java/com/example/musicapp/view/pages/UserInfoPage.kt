package com.example.musicapp.view.pages


import androidx.compose.foundation.layout.Row
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.musicapp.styles.cameraMod
import com.example.musicapp.view.myComponents.FloatCamera
import com.example.musicapp.view.myComponents.UserCardsComponents

/**
 * @author Andrés
 * @param
 * @function
 */
@Composable
fun UserInfoScreenPage(modifier: Modifier = Modifier) {

    Row {
        UserCardsComponents(
            materialTheme = MaterialTheme.colorScheme.background
        )
    }

    //TODO("Not yet implemented")
    Row(cameraMod) {
        FloatCamera { }
    }
}

@Preview
@Composable
fun UserInfoPrev() {

    UserInfoScreenPage()

}