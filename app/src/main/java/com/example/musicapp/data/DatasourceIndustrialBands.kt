package com.example.musicapp.data

import com.example.musicapp.R
class DatasourceIndustrialBands {

    fun LoadIndustrialBands():List<IndustrialBandsId>{

        return listOf<IndustrialBandsId>(

            IndustrialBandsId(R.drawable.nin),
            IndustrialBandsId(R.drawable.ministry_tickets_10_04_21_17_6054b27f5e197),
            IndustrialBandsId (R.drawable.skinny_puppy),
            IndustrialBandsId(R.drawable._01204251326333675),
            IndustrialBandsId(R.drawable.coil_john_peter_wide_1628803312)

        )
    }
}