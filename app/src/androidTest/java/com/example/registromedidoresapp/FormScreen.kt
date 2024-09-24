package com.example.registro_medidores.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.registro_medidores.ui.screens.FormScreen
import com.example.registro_medidores.ui.screens.ListScreen

@Composable
fun Navigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "listScreen") {
        composable("listScreen") { ListScreen(navController) }
        composable("formScreen") { FormScreen(navController) }
    }
}
