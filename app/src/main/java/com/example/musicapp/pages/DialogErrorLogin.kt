package com.example.musicapp.pages

/**
 * @author Andrés
 */
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DialogErrorPage(
    onConfirm: () -> Unit,

    ) {

    AlertDialog(

        title = {
            Text("ERROR EN EL REGISTRO")
        },
        confirmButton = {

            TextButton(onClick = onConfirm) {

                Text("sí")
            }

        },
        onDismissRequest = TODO(),
        modifier = TODO(),
        dismissButton = TODO(),
        icon = TODO(),
        text = TODO(),
        shape = TODO(),
        containerColor = TODO(),
        iconContentColor = TODO(),
        titleContentColor = TODO(),
        textContentColor = TODO(),
        tonalElevation = TODO(),
        properties = TODO()
    )
}


