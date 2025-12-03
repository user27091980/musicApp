package com.example.musicapp.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/**
 * @author="Andrés"

 */
//Each BandsId consists of one image and one string
//annotate the imageResourceId with the @DrawableRes annotation
//The imageResourceId represents an ID for the BandsId image stored in a drawable resource.
data class BandsId(@StringRes val stringResourceId: Int,@DrawableRes val imageResourceId: Int)





