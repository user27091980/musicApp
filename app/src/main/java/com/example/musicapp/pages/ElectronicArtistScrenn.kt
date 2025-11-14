package com.example.musicapp.pages

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.TextAutoSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.musicapp.myComponents.LazyRowComponent
import com.example.musicapp.styles.estiloTexto

/**
 * @author="Andrés"
 * @param
 * @function
 */
@Composable
fun ElectronicArtScreen(modifier: Modifier=Modifier) {


    LazyRowComponent()


    Row {
        ElectronicArtistContent()
    }
}
@Composable
fun ElectronicArtistContent(){

    Box {
        Column (modifier = Modifier.padding(20.dp, 360.dp))
        {
            Text(
                autoSize = TextAutoSize.StepBased(maxFontSize = 16.sp),
                maxLines = 50,
                style = estiloTexto,
                text = "Electrónica:\n" +
                        "un género de música electrónica/experimental que hace uso de temas transgresivos " +
                        "y suele estar asociada con angustia e ira contraculturales. " +
                        "Aunque ideológicamente asociada al punk, la música industrial es generalmente" +
                        " más compleja y diversa, tanto a nivel sonoro como lírico. " +
                        "El término fue acuñado hacia mediados de los años 1970 a raíz " +
                        "de la fundación de Industrial Records por la banda de Yorkshire (Inglaterra)" +
                        " Throbbing Gristle y con la creación del eslogan irónico " +
                        "industrial music for industrial people (en castellano, música industrial " +
                        "para gente industrial)\n"

            )
        }
    }
}


@Preview
@Composable
fun ElectronicArtistContentPreviewPage(){
    MusicBandScreenPage()
}