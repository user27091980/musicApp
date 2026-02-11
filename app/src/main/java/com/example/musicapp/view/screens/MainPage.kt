package com.example.musicapp.view.screens

//compoose imports
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
//navigation
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
//reused lazycolumncomponent
import com.example.musicapp.view.myComponents.LazyColumnComponent

/**
 * @author="Andrés"
 * @param navController navigation controller for changes between screens
 * @param modifier modifier for layout personalization from outside
 */
@Composable
fun MainScreenPage(navController: NavController,modifier: Modifier = Modifier) {

    //Component which shows a lazycolumnt content
    //it passed a Navcontroller for the navigation between items
    LazyColumnComponent(
        navController = NavController,
        modifier = modifier
    )

}

/**
 * MainScreen preview. It doesn´t executes on the app, only on the preview
 */
@Preview
@Composable
fun MainPrev() {

    val navController = rememberNavController()
    MainScreenPage(
        navController = navController,
        modifier = Modifier
    )

}
