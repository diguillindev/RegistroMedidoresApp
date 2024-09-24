package com.example.registro_medidores.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun ListScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Listado de Mediciones") })
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { navController.navigate("formScreen") }) {
                Text("+")
            }
        }
    ) {
        // Ejemplo de LazyColumn
        LazyColumn {
            items(10) { index ->
                Text(text = "Medición $index", modifier = Modifier.padding(8.dp))
            }
        }
    }
}
