package com.example.musicapp.view.pages


import androidx.compose.foundation.layout.Row
//import for obtain access to the Material 3 scheme colors
import androidx.compose.material3.MaterialTheme
//import Composable
import androidx.compose.runtime.Composable
//import the Modifier to apply styles, sizes and the behaviour of the components
import androidx.compose.ui.Modifier
//import for show the preview of the composable editor
import androidx.compose.ui.tooling.preview.Preview
//Personalized modifier of the  camera component
import com.example.musicapp.styles.cameraMod
//float camera component
import com.example.musicapp.view.myComponents.FloatCamera
//Personlaized UserCardComponents
import com.example.musicapp.view.myComponents.UserCardsComponents

/**
 * @author Andrés
 * @param optional modifier Modifier for the external layout customization
 *
 */
@Composable
fun UserInfoScreenPage(modifier: Modifier = Modifier) {
    //Row that contains the user info cards
    Row {
        UserCardsComponents(
            //background color of the theme
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