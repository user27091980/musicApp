package com.example.musicapp.data

import com.example.musicapp.R

/**
 * @author="Andrés"
 *
 */
class DatasourceMainScreenPics() {

    //The loadImagesId() method gathers all of the data provided in the starter code
    // and returns it as a list. You will use this later to build the scrollable list.
    fun LoadImagesId(): List<BandsId> {

        return listOf(

            BandsId(R.string.boc,R.drawable.boards_20of_20canada_20new_20mix_20warp),
            BandsId(R.string.kyuss,R.drawable.kyuss,),
            BandsId(R.string.ae,R.drawable.autechre_tree1),
            BandsId(R.string.aphex,R.drawable.a1664460568_10),
            BandsId(R.string.venetian,R.drawable.venetiansnares),
            BandsId(R.string.tool,R.drawable.tool_band_2753374979)

        )
    }
}




