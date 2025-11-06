package com.example.musicapp.myComponents

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import com.example.musicapp.data.BottomItems

/*
Función que se encarga de la barra de debajo(BottomBar)
 */
/**
 * @author: Perfecto
 * @param
 */
@Composable
fun BottomBar() {
    var selectedItem by remember { mutableStateOf(0) }

    val items = listOf(
        BottomItems.BottomBarItem("Inicio", Icons.Default.Home),
        BottomItems.BottomBarItem("Buscar", Icons.Default.Search),
        BottomItems.BottomBarItem("Perfil", Icons.Default.Person)
    )

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