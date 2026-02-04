package com.example.musicapp.vista.myComponents

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
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
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.musicapp.R
import com.example.musicapp.navigation.MainScreenPage
import com.example.musicapp.vista.pages.SettingsScreen

/**
 * @author andres
 * @param
 */
//componente de topAppBar se compome de una topbar y un menú desplegable
@Composable
fun TopBar(navController: NavController) {

    var isExpanded by remember {
        mutableStateOf(false)
    }

    Row(modifier = Modifier.fillMaxSize())
    {
        Column() {
            IconButton(onClick = { isExpanded = true }) {

                Icon(
                    imageVector = Icons.Default.Menu,
                    contentDescription = "menú",
                    tint =
                        MaterialTheme.colorScheme.primary,

                    )

            }
        }

        Column() {
            IconButton(onClick = { navController.navigate(SettingsScreen)}) {

                Icon(
                    imageVector = Icons.Default.Settings,
                    contentDescription = "ajustes",
                    tint =
                        MaterialTheme.colorScheme.primary,

                    )
            }
        }
        /*tnemos  que tener uan variable que sea capaz de manejar el cambio en el menu(isExpanded)
        esa variable tiene como entorno en la función topBar, tenemos que "jugar con los contextos"
        topBar conoce la variable isExpanded es la que se encarga de la acción, acto seguido simplemente
        en la fun dropMenu invocamos al dismiss request
        */
        DropMenu(extended = isExpanded, { isExpanded = false })

    }
}


/**
 * @author="Andrés"
 * @param
 * @function
 */
//función que se encarga del comportamiento del menú desplegable y de los elementos que lo conitenen
@Composable
fun DropMenu(navHostController: NavHostController, extended: Boolean, dismissRequest: () -> Unit) {

    Column(Modifier.padding()) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentSize(Alignment.TopCenter)

        ) {
            IconButton(onClick = { }) {

            }
            DropdownMenu(
                extended,
                onDismissRequest = dismissRequest
            ) {

                DropdownMenuItem(
                    text = { Text(text = stringResource(R.string.inicio)) },
                    onClick = {navHostController.navigate(MainScreenPage) })
                DropdownMenuItem(
                    text = { Text(text = stringResource(R.string.search)) },
                    onClick = { })
                DropdownMenuItem(
                    text = { Text(text = stringResource(R.string.salir)) },
                    onClick = { })

            }
        }
    }
}







