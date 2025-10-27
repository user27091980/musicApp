package com.example.musicapp.data

import androidx.compose.foundation.Image
import com.example.musicapp.R

class DatasourcePics() {

    //The loadImagesId() method gathers all of the data provided in the starter code
    // and returns it as a list. You will use this later to build the scrollable list.
    fun loadImagesId(): List<ImagesId> {

        return listOf<ImagesId>(

            ImagesId(R.drawable.metal_covers_header),
            ImagesId(R.drawable.canciones_rap_1),
            ImagesId (R.drawable.synthesizer_3296626458),
            ImagesId (R.drawable.cactus_widescreen_wallpaper),
            ImagesId(R.drawable._84856),
            ImagesId(R.drawable.punk_skull_with_mohawk_hair_vector_2247981175),
            ImagesId(R.drawable.s_l1600))

    }
}




