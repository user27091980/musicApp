package com.example.musicapp.data.modelo

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/**
 * @author="Andrés"

 */
//Each BandsDTO consists of one image and one string
//annotate the imageResourceId with the @DrawableRes annotation
//The imageResourceId represents an ID for the BandsDTO image stored in a drawable resource.
data class BandsDTO(@StringRes val stringResourceId: Int, @DrawableRes val imageResourceId: Int)