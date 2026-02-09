package com.example.musicapp.data.dataSources

import com.example.musicapp.R
import com.example.musicapp.data.modelo.AlbumsClickDTO
import com.example.musicapp.data.modelo.AlbumsDTO


/**
 * @author Andrés
 */

class DatasourceAphxPics {

    fun loadClickableAlbumsAphx(): List<AlbumsClickDTO> {

        return listOf(

            AlbumsClickDTO(R.drawable._99837,""),
            AlbumsClickDTO(R.drawable.a2665747684_16,""),
            AlbumsClickDTO(R.drawable.a3992891009_16,""),
            AlbumsClickDTO(R.drawable._1v5v233eul__uf1000_1000_ql80_,"")

        )
    }
}