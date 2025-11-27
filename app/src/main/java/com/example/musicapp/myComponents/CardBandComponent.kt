package com.example.musicapp.myComponents

import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.musicapp.R
import com.example.musicapp.styles.cardTextModifier

@Composable
fun CardBandAeComponent(modifier: Modifier = Modifier){

    Box() {
        Card(
            
            modifier = cardTextModifier
        )
        {
            Text(stringResource(R.string.aeInfo))
        }
    }
}

@Composable
fun CardBandBocComponent(){

    Box() {
        Card(

            modifier = cardTextModifier
        )
        {
            Text(stringResource(R.string.bocText))
        }
    }
}

