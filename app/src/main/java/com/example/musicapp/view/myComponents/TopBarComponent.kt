package com.example.musicapp.vista.myComponents

import android.app.Activity
import android.content.Intent
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.core.net.toUri
import androidx.navigation.NavController
import com.example.musicapp.R

/**
 * @author andres
 * @param
 */
//componente de topAppBar se compome de una topbar y un menú desplegable
@Composable
fun TopBar(navController: NavController) {

    var isExpanded by remember { mutableStateOf(false) }
    // Contexto y activity para abrir enlaces o cerrar app
    val context = LocalContext.current
    val activity = context as? Activity
    //en una fila el icono de ajustes y el menú desplegable
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    )
    {
        //botón para el menú
        IconButton(onClick = { isExpanded = true }) {

            Icon(
                imageVector = Icons.Default.Menu,
                contentDescription = "menú",
                tint =
                    MaterialTheme.colorScheme.primary,

                )

        }
        //abrir ajustes
        IconButton(onClick = { navController.navigate("settings") }) {

            Icon(
                imageVector = Icons.Default.Settings,
                contentDescription = "ajustes",
                tint =
                    MaterialTheme.colorScheme.primary,

                )
        }
        // Menú desplegable
        DropdownMenu(
            expanded = isExpanded,
            onDismissRequest = { isExpanded = false },
            modifier = Modifier.fillMaxWidth()
        ) {
            //abrimos Lastfm
            DropdownMenuItem(
                text = { Text(text = stringResource(R.string.menu_last)) },
                onClick = {
                    isExpanded = false
                    try {
                        context.startActivity(
                            Intent(Intent.ACTION_VIEW, "https://www.last.fm/".toUri())
                        )
                    } catch (e: Exception) {
                        e.printStackTrace()
                    }
                }
            )
            //abrimos Discogs
            DropdownMenuItem(
                text = { Text(text = stringResource(R.string.discos)) },
                onClick = {
                    isExpanded = false
                    try {
                        context.startActivity(
                            Intent(Intent.ACTION_VIEW, "https://www.discogs.com/".toUri())
                        )
                    } catch (e: Exception) {
                        e.printStackTrace()
                    }
                }
            )

            DropdownMenuItem(
                text = { Text(text = stringResource(R.string.salir)) },
                onClick = {
                    isExpanded = false
                    activity?.finishAffinity() // cerrar app
                }
            )

        }
    }
}








