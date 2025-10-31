package com.example.musicapp.myComponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.musicapp.data.DatasourceIndustrialBandsPics
import com.example.musicapp.data.IndustrialBandsId

@Composable
fun ImagesIndustrialList(industrialList:List<IndustrialBandsId>, modifier: Modifier=Modifier){

    LazyRow(modifier=modifier.padding(5.dp,75.dp)) {

        items(industrialList){

            industrialBandsId -> ImagesIndustrial(

                industrialId=industrialBandsId,

            )
        }
    }
}

@Composable
fun ImagesIndustrial(industrialId: IndustrialBandsId){

    val imageModifier = Modifier
        .size(300.dp)


    Box() {
        Image(
            painter = painterResource(industrialId.insdustrialResourceId),
            contentDescription = "",
            contentScale = ContentScale.FillWidth,
            modifier = imageModifier

        )
    }
}

//a esta función le mandamos la función ImagesList se crea un imagesList para
//que recorra el DataSourcesPics.
@Composable
fun LazyRowComponent(){

    ImagesIndustrialList(industrialList = DatasourceIndustrialBandsPics().LoadIndustrialBands())

}