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
import com.example.musicapp.myComponents.LazyRowComponentElectronics
import com.example.musicapp.styles.estiloTexto

/**
 * @author="Andrés"
 * @param
 * @function
 */
@Composable
fun ElectronicArtScreen(modifier: Modifier = Modifier) {


    LazyRowComponentElectronics()

    Row {
        ElectronicArtistContent()
    }
}

@Composable
fun ElectronicArtistContent() {

    Box {
        Column(modifier = Modifier.padding(20.dp, 360.dp))
        {
            Text(
                autoSize = TextAutoSize.StepBased(maxFontSize = 16.sp),
                maxLines = 30,
                style = estiloTexto,
                text = "Electrónica experimental:\n" +
                        "Intelligent dance music(IDM; en inglés:música inteligente de baile)" +
                        "es un género de música electrónica que surgió a principios de los años 1990." +
                        " Su creación estuvo influenciada por los avances de la música " +
                        "dance underground, tales como el Detroit techno y varios estilos breakbeat " +
                        "que estaban emergiendo en el Reino Unido en esa época. " +
                        "Estilísticamente, IDM tendía a basarse en la experimentación individualista," +
                        " en lugar de adherirse a características musicales asociadas " +
                        "a géneros específicos de la música de baile." +
                        " La gama de estilos post-techno que emergieron a principios" +
                        " de la década de 1990 fueron descritos de maneras diversas, como art techno," +
                        "ambient techno, intelligent techno y electronica."

            )
        }
    }
}


@Preview
@Composable
fun ElectronicArtistContentPreviewPage() {
    ElectronicArtScreen()
}