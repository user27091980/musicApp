package com.example.musicapp.data.dataSources

import com.example.musicapp.R
import com.example.musicapp.data.modelo.AlbumsClickDTO
import com.example.musicapp.data.modelo.AlbumsDTO

/**
 * @author Andrés
 */
class DatasourceBocPics {

    fun loadClickableAlbumsBoc(): List<AlbumsClickDTO> {

        return listOf(

            AlbumsClickDTO(R.drawable._25995,""),
            AlbumsClickDTO(R.drawable.oip_356430257,""),
            AlbumsClickDTO(R.drawable._x1900_000000_80_0_0,""),
            AlbumsClickDTO(R.drawable.a0074571247_16,""),
            AlbumsClickDTO(R.drawable.a1262104559_16,""),
            AlbumsClickDTO(R.drawable._3e67eef,""),

            )
    }
}