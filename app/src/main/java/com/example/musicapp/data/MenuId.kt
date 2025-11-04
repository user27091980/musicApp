package com.example.musicapp.data

import androidx.annotation.DrawableRes
//Cada MenuId se compone de un texto con un string
//la variable menuResourceId se corresponde con la anotación de @String
//menuResourceId representa un ID para el MenuId de Strings que representa lo almacenado en un el
//paquete values/strings.xml.

    data class MenuId(@ val menuResourceId: String)
