package com.example.musicapp.data

import androidx.compose.ui.res.stringResource
import com.example.musicapp.R

//El método LoadMenuId() reune a todo el data proveido em MenuId, que nos retorna una lista
//que emplearemos para la construción del menú desplegable You will use this later to build the scrollable list.
class DataSourceMenu {

    fun LoadMenuId(): List<MenuId> {

        return listOf<MenuId>(

            MenuId(R.string.menu_discos),
            MenuId(R.string.menu_configuracion),


        )
    }
}