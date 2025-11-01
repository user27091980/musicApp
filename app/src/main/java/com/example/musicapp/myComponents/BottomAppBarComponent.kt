package com.example.musicapp.myComponents

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

/*import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.musicapp.R
import com.example.musicapp.pages.MusicBandScreenContent
*/
/*@Composable
fun BottomAppBarComponent() {
    Scaffold(
        bottomBar = {
            BottomAppBar(
                actions = {
                    IconButton(onClick = { /* do something */ }) {
                        Icon(
                        painter = painterResource(R.drawable.menu_50dp_e3e3e3_fill0_wght400_grad0_opsz48),
                        contentDescription = "volver"
                    )

                    }
                    IconButton(onClick = { /* do something */ }) {
                        Icon(
                            painter = painterResource(R.drawable.menu_50dp_e3e3e3_fill0_wght400_grad0_opsz48),
                            contentDescription = "búsqueda",
                        )
                    }

                },

            )
        },
    ) {


    }
}*/
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Person
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun BottomAppBarComponent() {
    var selectedItem by remember { mutableStateOf(0) }

    val items = listOf(
        BottomBarItem("Inicio", Icons.Default.Home),
        BottomBarItem("Buscar", Icons.Default.Search),
        BottomBarItem("Perfil", Icons.Default.Person)
    )

    NavigationBar(
        containerColor = MaterialTheme.colorScheme.primaryContainer,
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


data class BottomBarItem(val label: String, val icon: ImageVector)
@Preview
@Composable
fun BottomAppBarComponentpreview(){
    MaterialTheme {
        BottomAppBarComponent()
    }
}
