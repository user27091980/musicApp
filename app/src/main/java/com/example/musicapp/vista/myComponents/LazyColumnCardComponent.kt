package com.example.musicapp.vista.myComponents

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
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
fun LazyCardColumnAeComponent() {

    Box() {
        Column {
            Card(){
                Text(text = stringResource(R.string.aeText))
            }

            Spacer(modifier = Modifier.height(80.dp))
            Text(stringResource(R.string.genre))
            Spacer(modifier = Modifier.height(80.dp))
            FlowAe()
        }
    }
}


@Composable
fun LazyCardColumnBocComponent() {
    Box() {
        Column() {
            Card() {
                Text(text = stringResource(R.string.bocText))
            }
            Spacer(modifier = Modifier.height(80.dp))
            Text(stringResource(R.string.genre))
            Spacer(modifier = Modifier.height(80.dp))
            FlowBoc()
        }
    }
}

@Composable
fun LazyCardColumnAphxComponent() {
    Box() {
        Column() {
            Card() {
                Text(text = stringResource(R.string.aphxText))
            }
            Spacer(modifier = Modifier.height(80.dp))
            Text(stringResource(R.string.genre))
            Spacer(modifier = Modifier.height(80.dp))
            FlowAphx()
        }
    }
}

@Composable
fun LazyCardColumnKyussComponent() {
    Box() {
        Column() {
            Card() {
                Text(text = stringResource(R.string.kyussText))
            }
            Spacer(modifier = Modifier.height(80.dp))
            Text(stringResource(R.string.genre))
            Spacer(modifier = Modifier.height(80.dp))
            FlowKyuss()
        }
    }
}

@Composable
fun LazyCardColumnToolComponent() {
    Box() {
        Column() {
            Card() {
                Text(text = stringResource(R.string.toolText))
            }
                Spacer(modifier = Modifier.height(80.dp))
                Text(stringResource(R.string.genre))
                Spacer(modifier = Modifier.height(80.dp))
                FlowTool()

        }
    }
}
