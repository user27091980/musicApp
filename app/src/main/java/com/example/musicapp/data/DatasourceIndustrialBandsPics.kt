package com.example.musicapp.data

import com.example.musicapp.R

/**
 * @author="Andrés"
 *
 */
/*
/*EStá clase es una función con una lista para el lazyy row  de la pagina bandScreen.*/
 */
class DatasourceIndustrialBandsPics {

    fun LoadIndustrialBands():List<IndustrialBandsId>{

        return listOf(

            IndustrialBandsId(R.drawable.nin),
            IndustrialBandsId(R.drawable.ministry_tickets_10_04_21_17_6054b27f5e197),
            IndustrialBandsId (R.drawable.skinny_puppy),
            IndustrialBandsId(R.drawable._01204251326333675),
            IndustrialBandsId(R.drawable.coil_john_peter_wide_1628803312)

        )
    }
}