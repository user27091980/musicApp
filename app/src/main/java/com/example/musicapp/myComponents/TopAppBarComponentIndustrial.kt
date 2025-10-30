package com.example.musicapp.myComponents

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.*
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.musicapp.R

//componente de topAppBar
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBarBands( content : @Composable () -> Unit){
    //andamiaje para la topBar
    Scaffold(

        topBar = {

            CenterAlignedTopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.surface,
                    titleContentColor = MaterialTheme.colorScheme.background,
                ),
                title = {
                    Text(stringResource(R.string.music_app))
                    Spacer(Modifier.width(16.dp))
                },

                actions = {
                    IconButton(onClick = { /* do something */ }) {
                        Icon(
                           imageVector = Icons.Filled.AccountCircle,
                           contentDescription = "menu",
                        )
                    }
                    IconButton(onClick = { /* do something */ }) {
                        Icon(
                            imageVector = Icons.Filled.AccountCircle,
                            contentDescription = "cuenta",
                        )
                    }
                }

                )
        }
    ) {

        LazyRowComponent()


    }
}


