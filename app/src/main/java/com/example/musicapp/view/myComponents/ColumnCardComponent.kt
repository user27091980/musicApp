package com.example.musicapp.vista.myComponents

//Compose layouts
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
//Scroll
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
//Material 3 Components
import androidx.compose.material3.Card
import androidx.compose.material3.Text
//compose runtime
import androidx.compose.runtime.Composable
//resources
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.musicapp.R
//personalized band tags
import com.example.musicapp.view.myComponents.TagAe
import com.example.musicapp.view.myComponents.TagAphx
import com.example.musicapp.view.myComponents.TagBoc
import com.example.musicapp.view.myComponents.TagKyuss
import com.example.musicapp.view.myComponents.TagTool

/**
 * Colection of card components and tags for each band
 *
 * @author="Andrés"
 *
 */

@Composable
fun CardColumnAeComponent() {
    //main container box
    Box {
        //Column for organice cards and tags
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .padding(16.dp),//internal padding
            verticalArrangement = Arrangement.spacedBy(10.dp)//separation between elements
        ) {
            //main card with band text
            Card {
                Text(text = stringResource(R.string.aeText))
            }
            Spacer(modifier = Modifier.height(6.dp))//spacer between card and tags
            TagAe()//Autechre´s tags
            Spacer(modifier = Modifier.height(6.dp))//final spacer
        }
    }
}

//same as fun CardColumnAeComponent()
@Composable
fun CardColumnBocComponent() {
    Box() {
        Column(
            modifier = Modifier
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
