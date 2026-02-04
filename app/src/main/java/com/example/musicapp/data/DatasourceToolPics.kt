package com.example.musicapp.data

import com.example.musicapp.R
import com.example.musicapp.data.modelo.AlbumsDTO

/**
 * @author Andrés
 */
class DatasourceToolPics {

    fun loadAlbumsTool(): List<AlbumsDTO> {

        return listOf(

            AlbumsDTO(
                R.drawable._591911,
                imageResourceId = TODO()
            ),
            AlbumsDTO(R.drawable.c0010220__10913),
            AlbumsDTO(R.drawable.tool_fear),
            AlbumsDTO(R.drawable.aenima),
            AlbumsDTO(R.drawable.anima_4580),
            AlbumsDTO(R.drawable.new_vinyl_tool_opiate_ep_12)


        )
    }
}