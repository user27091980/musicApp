package com.example.musicapp.pages

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.musicapp.myComponents.FloatCamera
import com.example.musicapp.myComponents.UserCardsComponents
import com.example.musicapp.styles.cameraMod
import java.sql.RowId

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
    Row(cameraMod){
        FloatCamera {  }
    }
}

@Preview
@Composable
fun UserPrev() {

    UserInfoScreenPage()

}