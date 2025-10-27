import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.musicapp.data.DatasourcePics
import com.example.musicapp.data.ImagesId
import com.example.musicapp.data.IndustrialBandsId
import com.example.musicapp.myComponents.Images
import com.example.musicapp.myComponents.ImagesList
@Composable
fun ImagesBandList(industrialList:List<IndustrialBandsId>, modifier: Modifier=Modifier){

    LazyRow(modifier=modifier) {

        items(industrialList){

            industrialBandsId -> Images(

                industrialBandsId=industrialBandsId

            )
        }
    }
}


@Composable
fun Images(imagesId: ImagesId){
    Box() {
        Image(
            painter = painterResource(imagesId.imageResourceId),
            contentDescription = "",
            contentScale = ContentScale.Inside,
        )
    }
}

//a esta función le mandamos la función ImagesList se crea un imagesList para
//que recorra el DataSourcesPics.
@Composable
fun LazyRowComponent(){

    ImagesList(imagesList = DatasourcePics().loadImagesId())

}