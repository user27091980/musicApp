package com.example.musicapp.data.dataSources

import com.example.musicapp.R
import com.example.musicapp.data.modelo.GroupsDTO

class DataSourceBands()  {

    fun loadBands(): List<GroupsDTO> {

        return listOf(

            GroupsDTO(R.string.tool),
            GroupsDTO(R.string.kyuss),
            GroupsDTO(R.string.boc),
            GroupsDTO(R.string.aphex),
            GroupsDTO(R.string.ae)

        )
    }
}





