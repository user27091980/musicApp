package com.example.musicapp.myComponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.musicapp.data.AlbumsId
import com.example.musicapp.data.DatasourceAlbumsPics
import com.example.musicapp.styles.imageModifier

@Composable
fun ImagesAlbumsList(albumsList:List<AlbumsId>, modifier: Modifier=Modifier){

    LazyVerticalGrid(
        columns = GridCells.Fixed(4),
        contentPadding = PaddingValues(1.dp),
        horizontalArrangement = Arrangement.spacedBy(1.dp),
        verticalArrangement = Arrangement.spacedBy(1.dp),

    ) {

            items(albumsList) {

                albumsId -> ImagesAlbums(

                albumsId = albumsId,
                    //añadir clickable

                )
            }
    }
}



@Composable
fun ImagesAlbums(albumsId: AlbumsId){

    Box() {
        Image(
            painter = painterResource(albumsId.discsResourceId),
            contentDescription = "",
            contentScale = ContentScale.Inside,
            modifier = imageModifier

        )
    }
}

@Composable
fun GridViewComponent(){

    ImagesAlbumsList(albumsList = DatasourceAlbumsPics().loadAlbumsBands())

}