package com.example.demo.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.demo.ui.screen.*

@Composable
fun AppNavHost() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.HOME
    ) {
        composable(Routes.HOME) {
            HomeScreen(navController)
        }

        composable(Routes.LAZY) {
            LazyColumnVsColumnScreen(navController)
        }

        composable(Routes.KEY) {
            LazyColumnKeyScreen(navController)
        }

        composable(Routes.RECOMPOSITION) {
            RecompositionScreen(navController)
        }
    }
}

