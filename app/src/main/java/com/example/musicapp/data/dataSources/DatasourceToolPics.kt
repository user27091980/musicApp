package com.example.musicapp.data.dataSources

import com.example.musicapp.R
import com.example.musicapp.data.modelo.AlbumsClickDTO

/**
 * @author Andrés
 * class for the albums on the lazy row
 */
class DatasourceToolPics {

    fun loadClickableAlbumsTool(): List<AlbumsClickDTO> {

        return listOf(
            AlbumsClickDTO(imageResourceId = R.drawable._591911,""),
            AlbumsClickDTO(R.drawable.c0010220__10913,""),
            AlbumsClickDTO(R.drawable.tool_fear,""),
            AlbumsClickDTO(R.drawable.aenima,""),
            AlbumsClickDTO(R.drawable.anima_4580,""),
            AlbumsClickDTO(R.drawable.new_vinyl_tool_opiate_ep_12,"")
        )
    }
}