package com.example.musicapp.data

import com.example.musicapp.R
/**
 * @author="Andrés"
 *
 */
class DatasourceStonerPics {

    /*
    /*EStá clase es una función con una lista para el lazyy row  de la pagina bandScreen.*/
     */
    fun LoadStonerBands(): List<StonerBandsId> {

        return listOf(

            StonerBandsId(R.drawable.kyuss),
            StonerBandsId(R.drawable.queens_of_the_stone_age),
            StonerBandsId(R.drawable.mondo),
            StonerBandsId(R.drawable.stoner_band_portrait)

        )
    }

}