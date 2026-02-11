package com.example.musicapp.data.dataSources

import com.example.musicapp.R
import com.example.musicapp.data.model.AlbumsDTO


/**
 * @author Andrés
 */

class DatasourceAphxPics {

    fun loadAlbumsAphx(): List<AlbumsDTO> {

        return listOf(

            AlbumsDTO(R.drawable._99837),
            AlbumsDTO(R.drawable.a2665747684_16),
            AlbumsDTO(R.drawable.a3992891009_16),
            AlbumsDTO(R.drawable._1v5v233eul__uf1000_1000_ql80_)

        )
    }
}