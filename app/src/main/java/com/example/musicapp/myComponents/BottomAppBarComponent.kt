package com.example.musicapp.myComponents

import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.example.musicapp.R

@Composable
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
}