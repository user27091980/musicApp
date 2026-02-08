package com.example.musicapp.view.myComponents

import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.res.stringResource
import com.example.musicapp.data.dataSources.BottomItems
import com.example.musicapp.R
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.musicapp.vista.pages.MainScreenPage
import com.example.musicapp.vista.pages.UserInfoScreenPage

/**
 * @author: Andrés
 * @function
 */
/*
Función que se encarga de la barra inferior(BottomBar), con sus correspondientes iconos
guardados en una lista denominada como items.
 */
/*TODO: INTRODUCIR NAVEGACIÓN no funciona*/
@Composable
fun BottomBar(navController: NavHostController) {
    var selectedItem by remember { mutableStateOf(0) }

    val items = listOf(
        BottomItems.TopButtonItems(label = stringResource(R.string.inicio), Icons.Default.Home, route ="home"),
        BottomItems.TopButtonItems(label = stringResource(R.string.buscar), Icons.Default.Search, route="search"),
        BottomItems.TopButtonItems(label = stringResource(R.string.perfil), Icons.Default.Person,route="profile")
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
                //launchSingleTop opción de navegación que le dice al NavController:
                //“Si ya estoy en esta pantalla, NO la vuelvas a crear”
                selected = selectedItem == index,
                onClick = {
                    selectedItem = index
                    navController.navigate(item.route)
                    {launchSingleTop=true}
                }
            )
        }
    }
}
