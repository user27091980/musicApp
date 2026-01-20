package com.example.musicapp.myComponents

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.musicapp.data.DatasourceAeStrings
import com.example.musicapp.data.DatasourceAphxStrings
import com.example.musicapp.data.DatasourceBocStrings
import com.example.musicapp.data.DatasourceKyussStrings
import com.example.musicapp.data.DatasourceToolStrings
import com.example.musicapp.data.StringsId

/**
 * @author Andrés
 * @param
 */
@Composable
fun StringList(stringList: List<StringsId>, modifier: Modifier = Modifier) {

    LazyColumn(modifier = modifier) {

        items(stringList) {

                stringsId ->
            Strings(
                stringsId = stringsId,
            )
        }
    }
}

/**
 * @author="Andrés"
 * @param
 * @function
 */
//creamos la función imagen para poder acceder a ellas y poder realizar el contenscale
//pasamos como parámetro un imagesId
@Composable
fun Strings(stringsId: StringsId) {
    Box {
        Card(
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
        ) {
            Text(
                stringResource(stringsId.stringResourceId),
                textAlign = TextAlign.Left,
                color = Color.White
            )
        }
    }
}

/**
 * @author="Andrés"
 * @param
 * @function
 */
//a esta función le mandamos la función ImagesList se crea un imagesList para
//que recorra el DataSourcesPics.
@Composable
fun LazyCardColumnAeComponent() {

    StringList(stringList = DatasourceAeStrings().loadStringsAe())

}

@Composable
fun LazyCardColumnBocComponent() {

    StringList(stringList = DatasourceBocStrings().loadStringsBoc())

}

@Composable
fun LazyCardColumnAphxComponent() {

    StringList(stringList = DatasourceAphxStrings().loadStringsAphx())

}

@Composable
fun LazyCardColumnKyussComponent() {

    StringList(stringList = DatasourceKyussStrings().loadStringsKyuss())

}

@Composable
fun LazyCardColumnToolComponent() {

    StringList(stringList = DatasourceToolStrings().loadStringsTool())

}
