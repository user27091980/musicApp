package com.example.musicapp.vista.myComponents

//necesary classes for open links and closed the app
import android.app.Activity
import android.content.Intent
//Compose layouts
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
//Material Icons
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
//Material 3 components
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
//Compose state
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
//UI and resources
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
//android utils
import androidx.core.net.toUri
//navigation
import androidx.navigation.NavController
// app resources
import com.example.musicapp.R

/**
 * TopBar personalized component
 *
 * Contains:
 * - Menu buttom
 * - Settings buttom
 * - DropDown menu and setttins icon
 *
 * @param navController navigation controller
 * @author Andrés Canabal Poncela
 */

@Composable
fun TopBar(navController: NavController) {
    //manages if dropdown menu it´s open or close
    var isExpanded by remember { mutableStateOf(false) }
    //Context and activity for open links or close the app
    val context = LocalContext.current
    //it tries to obtain the Activity for can close the app
    val activity = context as? Activity
    //Row for icons and topBar
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    )
    {
        //Menu button
        IconButton(onClick = { isExpanded = true }) {

            Icon(
                imageVector = Icons.Default.Menu,
                contentDescription = "menú",
                tint =
                    MaterialTheme.colorScheme.primary,

                )

        }
        //Settings button
        IconButton(onClick = { navController.navigate("settings") }) {

            Icon(
                imageVector = Icons.Default.Settings,
                contentDescription = "ajustes",
                tint =
                    MaterialTheme.colorScheme.primary,

                )
        }
        //Dropdown menu, it shows on top leff corner
        DropdownMenu(
            expanded = isExpanded,
            onDismissRequest = { isExpanded = false },
            modifier = Modifier.fillMaxWidth()
        ) {
            //Option for open last.fm web
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
            //option for open discogs web
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
            //option for closed the app
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








