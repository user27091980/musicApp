package com.example.musicapp.vista.pages

dimport androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import com.example.musicapp.navigation.MainScreenPage
import com.example.musicapp.vista.myComponents.GridViewComponent
import kotlinx.coroutines.delay

/**
 * @author Andrés
 */
@Composable
fun SplashScreen(navController: NavHostController) {
    // Simulamos una carga de 2 segundos
    LaunchedEffect(key1 = true) {
        delay(2000) // 2 segundos de carga simulada
        navController.popBackStack() // Eliminamos la pantalla de carga
        navController.navigate(MainScreenPage)
    }
    SplashScreenPage()
}


@Composable
fun SplashScreenPage() {

    GridViewComponent()

}

@Preview
@Composable
fun SplashPrev() {

    SplashScreenPage()

}

