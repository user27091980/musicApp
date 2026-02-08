package com.example.musicapp.data.dataSources

import com.example.musicapp.R
import com.example.musicapp.data.modelo.BandsDTO

/**
 * @author="Andrés"
 *
 */
class DatasourceMainScreenPics() {

    //The loadImagesId() method gathers all of the data provided in the starter code
    // and returns it as a list. You will use this later to build the scrollable list.
    fun loadImagesId(): List<BandsDTO> {

        return listOf(

            BandsDTO(R.drawable.boards_20of_20canada_20new_20mix_20warp, R.string.boc),
            BandsDTO(R.drawable.kyuss, R.string.kyuss),
            BandsDTO(R.drawable.autechre_tree1, R.string.ae),
            BandsDTO(R.drawable.a1664460568_10, R.string.aphex),
            BandsDTO(R.drawable.tool_band_2753374979, R.string.tool)

        )
    }
}




