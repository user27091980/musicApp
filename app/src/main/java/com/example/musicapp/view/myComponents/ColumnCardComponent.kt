package com.example.musicapp.vista.myComponents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.musicapp.R

/**
 * @author="Andrés"
 * @param
 * @function
 */

@Composable
fun CardColumnAeComponent() {

    Box {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Card {
                Text(text = stringResource(R.string.aeText))
            }
            Spacer(modifier = Modifier.height(6.dp))
            TagAe()
            Spacer(modifier = Modifier.height(6.dp))
        }
    }
}


@Composable
fun CardColumnBocComponent() {
    Box() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Card() {
                Text(text = stringResource(R.string.bocText))
            }

            Spacer(modifier = Modifier.height(6.dp))
            TagBoc()
            Spacer(modifier = Modifier.height(6.dp))
        }
    }
}

@Composable
fun CardColumnAphxComponent() {
    Box() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Card() {
                Text(text = stringResource(R.string.aphxText))
            }

            Spacer(modifier = Modifier.height(6.dp))
            TagAphx()
            Spacer(modifier = Modifier.height(6.dp))
        }
    }
}

@Composable
fun CardColumnKyussComponent() {
    Box() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Card() {
                Text(text = stringResource(R.string.kyussText))
            }
            Spacer(modifier = Modifier.height(6.dp))
            TagKyuss()
            Spacer(modifier = Modifier.height(6.dp))
        }
    }
}

@Composable
fun CardColumnToolComponent() {
    Box() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Card() {
                Text(text = stringResource(R.string.toolText))
            }

            Spacer(modifier = Modifier.height(6.dp))
            TagTool()
            Spacer(modifier = Modifier.height(6.dp))
        }
    }
}
