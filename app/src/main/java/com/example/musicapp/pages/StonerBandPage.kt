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
import com.example.musicapp.myComponents.LazyRowComponentStoner
import com.example.musicapp.styles.estiloTexto

/**
 * @author="Andrés"
 * @param
 * @function
 */
@Composable
fun StonerScreen(modifier: Modifier=Modifier) {


    LazyRowComponentStoner()

    Row {
        StonerArtistContent()
    }
}
@Composable
fun StonerArtistContent(){

    Box {
        Column (modifier = Modifier.padding(20.dp, 360.dp))
        {
            Text(
                autoSize = TextAutoSize.StepBased(maxFontSize = 16.sp),
                maxLines = 50,
                style = estiloTexto,
                text = "Stoner rock:\n" +
                        "El Stoner rock, también conocido como stoner metal o stoner doom," +
                        "es un género fusión de la música rock que combina " +
                        "elementos del heavy metal y/o doom metal con rock psicodélico y rock ácido." +
                        "El nombre hace referencia al consumo de cannabis. " +
                        "El término desert rock a menudo se usa indistintamente con el término " +
                        "\"stoner rock\" para describir este género; sin embargo, " +
                        "no todas las bandas de stoner rock caerían bajo la definición " +
                        "de \"desert rock\". El stoner rock habitualmente usa " +
                        "tempos de lentos a medios y presenta un sonido de bajo fuertemente " +
                        "distorsionado y cargado de un pesado groove,voces melódicas" +
                        " y producción \"retro\".El género emergió a principios de la década de 1990" +
                        " y fue iniciado las bandas californianas " + "Fu Manchu, Kyuss y Sleep."

            )
        }
    }
}


@Preview
@Composable
fun StonerContentPreviewPage(){
    StonerScreen()
}