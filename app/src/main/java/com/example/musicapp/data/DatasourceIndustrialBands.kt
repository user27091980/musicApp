package com.example.musicapp.data

import com.example.musicapp.R
class DatasourceIndustrialBands {

    fun LoadIndustrialBands():List<IndustrialBandsId>{

        return listOf<IndustrialBandsId>(

            IndustrialBandsId(R.drawable.nine_inch_nails_logo),
            IndustrialBandsId(R.drawable.m_icon_21red),
            IndustrialBandsId (R.drawable.synthesizer_3296626458),
            IndustrialBandsId (R.drawable.cactus_widescreen_wallpaper),
            IndustrialBandsId(R.drawable._84856),
            IndustrialBandsId(R.drawable.thumb_1920_891206)

        )
    }
}