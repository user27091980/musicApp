package com.example.musicapp.data.dataSources

import com.example.musicapp.R
import com.example.musicapp.data.modelo.AlbumsClickDTO
import com.example.musicapp.data.modelo.AlbumsDTO

class DatasourceAePics {

    fun loadClickableAlbumsAe(): List<AlbumsClickDTO> {

        return listOf(

            AlbumsClickDTO(R.drawable.fc95b9d20dc47298746a7eedcc2f0a73_1000x1000x1,
                "https://www.youtube.com/watch?v=sGXJMrvMGUM"),
            AlbumsClickDTO(R.drawable.a2881947733_16,
                "https://www.youtube.com/watch?v=f8pLxK-n_4o&list=RDf8pLxK-n_4o&start_radio=1"),
            AlbumsClickDTO(R.drawable.d082db4c_d805_4422_8270_202183139e67,
                "https://www.youtube.com/watch?v=Wr6vARWre-Y&list=PL4wjgXyj5LGQWHfBI38Lizk13S8zm7Ibs"),
            AlbumsClickDTO(R.drawable.nzutmzmxos5qcgvn_500,
                "https://www.youtube.com/watch?v=rCbKZOwlZvc&list=RDrCbKZOwlZvc&start_radio=1"),
            AlbumsClickDTO(R.drawable.album_large_98280_574221d8b2b13,
                "https://www.youtube.com/watch?v=s00YGgmfYw4&list=RDs00YGgmfYw4&start_radio=1"),
            AlbumsClickDTO(R.drawable.a3617801006_16,
                "https://www.youtube.com/watch?v=OH4lS6Aem08&list=RDOH4lS6Aem08&start_radio=1")

        )
    }
}
