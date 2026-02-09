package com.example.musicapp.data.dataSources

import com.example.musicapp.R
import com.example.musicapp.data.modelo.AlbumsClickDTO
import com.example.musicapp.data.modelo.AlbumsDTO


/**
 * @author Andrés
 */
class DatasourceKyussPics {


    fun loadClickableAlbumsKyuss(): List<AlbumsClickDTO> {

        return listOf(

            AlbumsClickDTO(R.drawable._1z_tt4g_yl__uf1000_1000_ql80_,""),
            AlbumsClickDTO(R.drawable._900x1900_000000_80_0_0,""),
            AlbumsClickDTO(R.drawable._081227958749,""),
            AlbumsClickDTO(R.drawable._1cc8d60_969a_4f67_82d0_37515ab13f95_thumbnail_4096
            ,""),
            AlbumsClickDTO(R.drawable.wretch,"")


        )
    }
}
