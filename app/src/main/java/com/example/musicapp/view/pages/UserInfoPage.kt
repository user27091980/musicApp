package com.example.musicapp.view.pages

//imports row, for horizontal row organization
import androidx.compose.foundation.layout.Row
//import for obtain access to the Material 3 scheme colors
import androidx.compose.material3.MaterialTheme
//import Composable
import androidx.compose.runtime.Composable
//
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