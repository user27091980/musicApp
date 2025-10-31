package com.example.musicapp.myComponents

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.musicapp.R

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBarAlbums(content : @Composable () -> Unit) {

    Scaffold(

        topBar = {

            CenterAlignedTopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.surface,
                    titleContentColor = MaterialTheme.colorScheme.background,
                ),

                title = {
                    Text(stringResource(R.string.music_app))
                    Spacer(Modifier.width(1.dp))
                },

                actions = {

                    IconButton(onClick = { /* do something */ }) {

                        Icon(

                            painter = painterResource(R.drawable.menu_50dp_e3e3e3_fill0_wght400_grad0_opsz48),
                            contentDescription = "menu",
                        )
                    }
                    IconButton(onClick = { /* do something */ }) {

                        Icon(

                            painter = painterResource(R.drawable.account_circle_50dp_e3e3e3_fill0_wght400_grad0_opsz48),
                            contentDescription = "cuenta",
                        )
                    }
                }

            )
        }
    )
    {


    }
}


