package com.example.musicapp.data

import androidx.annotation.DrawableRes

//Each ImagesId consists of one image and one string
//annotate the imageResourceId with the @DrawableRes annotation
//The imageResourceId represents an ID for the ImagesId image stored in a drawable resource.
data class ImagesId(@DrawableRes val imageResourceId: Int)





