package com.example.musicapp.data.dataSources

import com.example.musicapp.R
import com.example.musicapp.data.modelo.AlbumsDTO

/**
 * @author Andrés
 */
class DatasourceBocPics {

    fun loadAlbumsBoc(): List<AlbumsDTO> {

        return listOf(

            AlbumsDTO(R.drawable._25995),
            AlbumsDTO(R.drawable.oip_356430257),
            AlbumsDTO(R.drawable._x1900_000000_80_0_0),
            AlbumsDTO(R.drawable.a0074571247_16),
            AlbumsDTO(R.drawable.a1262104559_16),
            AlbumsDTO(R.drawable._3e67eef),

        )
    }
}