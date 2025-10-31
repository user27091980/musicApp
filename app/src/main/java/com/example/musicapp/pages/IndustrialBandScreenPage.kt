package com.example.musicapp.pages

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.musicapp.myComponents.BottomAppBar
import com.example.musicapp.myComponents.CardComponent
import com.example.musicapp.myComponents.LazyRowComponent

import com.example.musicapp.styles.estiloTexto
import com.example.musicapp.myComponents.TopBarBands

@Composable
fun MusicBandScreenPage(){

    TopBarBands {

        LazyRowComponent()

    }
    MusicBandScreenContent()
}
@Composable
fun MusicBandScreenContent(){

        Row(modifier = Modifier.padding(30.dp, 360.dp))
        {
            Text(

                style = estiloTexto,
                text = "Industrial:\n" +
                        "un género de música electrónica/experimental que hace uso de temas transgresivos " +
                        "y suele estar asociada con angustia e ira contraculturales. " +
                        "Aunque ideológicamente asociada al punk, la música industrial es generalmente" +
                        " más compleja y diversa, tanto a nivel sonoro como lírico. " +
                        "El término fue acuñado hacia mediados de los años 1970 a raíz " +
                        "de la fundación de Industrial Records por la banda de Yorkshire (Inglaterra)" +
                        " Throbbing Gristle y con la creación del eslogan irónico " +
                        "industrial music for industrial people (en castellano, música industrial " +
                        "para gente industrial)" +
                        "Los primeros artistas industriales experimentaron con ruidos y temas" +
                        " estéticamente comprometidos, tanto musical como visualmente, como el fascismo," +
                        " los asesinatos en serie y el ocultismo. Su producción no se limitó a la música, " +
                        "sino que incluyó también arte correo, performance, instalaciones artísticas " +
                        "y otras formas de expresión."
            )


              CardComponent()



        }
    Row { BottomAppBar() }
}


@Preview
@Composable
fun MusicBandPreviewPage(){
        MusicBandScreenPage()
}