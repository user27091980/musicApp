package com.example.musicapp.data

import com.example.musicapp.R
import com.example.musicapp.data.modelo.BandsDTO

/**
 * @author="Andrés"
 *
 */
class DatasourceMainScreenPics() {

    //The loadImagesId() method gathers all of the data provided in the starter code
    // and returns it as a list. You will use this later to build the scrollable list.
    fun LoadImagesId(): List<BandsDTO> {

        return listOf(

            BandsDTO(R.string.boc, R.drawable.boards_20of_20canada_20new_20mix_20warp),
            BandsDTO(R.string.kyuss, R.drawable.kyuss,),
            BandsDTO(R.string.ae, R.drawable.autechre_tree1),
            BandsDTO(R.string.aphex, R.drawable.a1664460568_10),
            BandsDTO(R.string.venetian, R.drawable.venetiansnares),
            BandsDTO(R.string.tool, R.drawable.tool_band_2753374979)

        )
    }
}




