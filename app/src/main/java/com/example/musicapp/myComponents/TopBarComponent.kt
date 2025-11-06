package com.example.musicapp.myComponents

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

//componente de topAppBar
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar() {
    //variable que se encarga del cambio de estado del menú,
    DropDownMenu()

}






