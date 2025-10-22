package com.example.musicapp.myComponents

import android.R.attr.data
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun LazyRowComponent(){

    LazyRow {
        items(data) { item ->
            Box(
                modifier = Modifier
                    .width(100.dp)
                    .height(200.dp)
                    .background(Color.Magenta)
                    .padding(16.dp)
            )
            Spacer(modifier = Modifier.padding(8.dp))
        }
    }
}