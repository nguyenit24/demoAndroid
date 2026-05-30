package com.example.demo.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.demo.ui.navigation.Routes

@Composable
fun HomeScreen(
    navController: NavController
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),

        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {

        Button(
            onClick = {
                navController.navigate(Routes.LAZY)
            }
        ) {
            Text("Demo LazyColumn vs Column")
        }

        Button(
            onClick = {
                navController.navigate(Routes.KEY)
            }
        ) {
            Text("Demo LazyColumn Key")
        }

        Button(
            onClick = {
                navController.navigate(Routes.RECOMPOSITION)
            }
        ) {
            Text("Demo Recomposition")
        }
    }
}

