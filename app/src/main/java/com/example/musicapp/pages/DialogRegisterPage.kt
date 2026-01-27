package com.example.musicapp.pages

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable

/**
 * @author Andrés
 */

//ejemplo dialog
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DialogPage(
    onConfirm: () -> Unit,
    onCancel: () -> Unit
) {

    AlertDialog(
        onDismissRequest = onCancel,
        title = {
            Text("¿Confirmar registro?")
        },
        confirmButton = {

            TextButton(onClick = onConfirm) {

                Text("sí")
            }

        },
        dismissButton = {
            TextButton(onClick = onCancel) {
                Text("no")
            }
        }
    )
}
