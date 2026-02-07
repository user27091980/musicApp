package com.example.musicapp.vista.myComponents

import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.res.stringResource
import com.example.musicapp.data.dataSources.BottomItems
import com.example.musicapp.R
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Person
import androidx.navigation.NavHostController

/**
 * @author: Andrés
 * @function
 */
/*
Función que se encarga de la barra inferior(BottomBar), con sus correspondientes iconos
guardados en una lista denominada como items.
 */
@Composable
fun BottomBar(navController: NavHostController) {
    var selectedItem by remember { mutableStateOf(0) }

    val items = listOf(
        BottomItems.BottomBarItem(label = stringResource(R.string.inicio), Icons.Default.Home),
        BottomItems.BottomBarItem(label = stringResource(R.string.buscar), Icons.Default.Search),
        BottomItems.BottomBarItem(label = stringResource(R.string.perfil), Icons.Default.Person)
    )
//barra de navegación.
    NavigationBar(
        containerColor = MaterialTheme.colorScheme.background,
        contentColor = MaterialTheme.colorScheme.onPrimaryContainer
    ) {
        items.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = {
                    Icon(
                        imageVector = item.icon,
                        contentDescription = item.label,
                        tint = if (selectedItem == index)
                            MaterialTheme.colorScheme.primary
                        else
                            MaterialTheme.colorScheme.onPrimaryContainer
                    )
                },
                label = {
                    Text(
                        text = item.label,
                        style = MaterialTheme.typography.labelSmall,
                        color = if (selectedItem == index)
                            MaterialTheme.colorScheme.primary
                        else
                            MaterialTheme.colorScheme.onPrimaryContainer
                    )
                },
                selected = selectedItem == index,
                onClick = { selectedItem = index }
            )
        }
    }
}