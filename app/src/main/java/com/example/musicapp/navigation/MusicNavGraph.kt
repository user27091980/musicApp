package com.example.musicapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument


object Routes {
    const val List = "list"
    const val Detail = "detail/{musicId}"
}

@Composable
fun MusicNavGraph() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.List) {
        composable(Routes.List) {


        }
    }
    composable(
        route = Routes.Detail,
        arguments = listOf(navArgument("musicId") { type = NavType.IntType })
    ) { backStackEntry ->

    }
}
}