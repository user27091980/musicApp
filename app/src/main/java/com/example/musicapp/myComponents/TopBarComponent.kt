package com.example.musicapp.myComponents

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
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
import androidx.compose.ui.unit.dp

/**
 * @author andres
 * @param
 */
//componente de topAppBar
@Composable
fun TopBar() {

    var isExpanded by remember {
        mutableStateOf(false)
    }
    Row(modifier = Modifier.fillMaxSize()) {
        //cuenta
        Box(
            modifier = Modifier
                .fillMaxSize()
                .wrapContentSize(align = Alignment.TopStart)
                .background(MaterialTheme.colorScheme.background),
            contentAlignment = Alignment.Center
        ) {
            IconButton(onClick = { isExpanded=true}) {

                Icon(
                    imageVector = Icons.Default.Menu,
                    contentDescription = "menú",
                    tint =
                        MaterialTheme.colorScheme.primary
                )

            }
            /*tnemos  que tener uan variable que sea capaz de manejar el cambio en el menu(isExpanded)
            esa variable tiene como entorno en la función topBar, tenemos que "jugar con los contextos"
            topBar conoce la variable isExpanded es la que se encarga de la acción, acto seguido simplemente
            en la fun dropMenu invocamos al dismiss request
            */
            DropMenu(extended=isExpanded, { isExpanded = false})

        }
    }
}


/**
 * @param
 *
 */
@Composable
fun DropMenu(extended: Boolean, dismissRequest: () -> Unit) {

    Column(Modifier.padding(8.dp)) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentSize(Alignment.TopEnd)
        ) {
            IconButton(onClick = { }) {

            }
            DropdownMenu(
                extended,
                onDismissRequest = dismissRequest
            ){

                DropdownMenuItem(
                    text = { Text(text = "inicio") },
                    onClick = { })
                DropdownMenuItem(
                    text = { Text(text = "pérfil") },
                    onClick = { })
                DropdownMenuItem(
                    text = { Text(text = "exit") },
                    onClick = { })
            }
        }
    }
}







