package com.example.musicapp.myComponents

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.musicapp.R

//componente de topAppBar
@Composable
fun TopBar(){

    var expanded by remember { mutableStateOf(false) }

    Row(modifier = Modifier.fillMaxSize()) {
        //cuenta
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 10.dp)
                .wrapContentSize(align = Alignment.TopStart),
            contentAlignment = Alignment.Center
        ) {
            IconButton(onClick = {
                expanded = true
            }) {
                Icon(
                    painter = painterResource(R.drawable.menu_50dp_e3e3e3_fill0_wght400_grad0_opsz48),
                    contentDescription = "menu"
                )
            }
            //cuenta
            IconButton(onClick = {/*do something*/ }) {
                Icon(
                    painter = painterResource(R.drawable.account_circle_50dp_e3e3e3_fill0_wght400_grad0_opsz48),
                    contentDescription = "cuenta"
                )
            }
        }
    }
}


@Composable
fun drow{}






