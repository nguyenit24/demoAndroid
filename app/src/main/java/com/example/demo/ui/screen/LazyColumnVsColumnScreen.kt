package com.example.demo.ui.screen

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun LazyColumnVsColumnScreen(
    navController: NavController
) {

    val products = remember {
        List(1000) {
            "Product $it"
        }
    }

    Column {

        Button(
            onClick = {
                navController.popBackStack()
            }
        ) {
            Text("Back")
        }

        Text(
            text = "LazyColumn Demo"
        )

        LazyColumn {

            items(products) { product ->

                Log.d(
                    "LAZY_COLUMN",
                    "Render $product"
                )

                Text(
                    text = product,
                    modifier = Modifier.padding(16.dp)
                )
            }
        }
    }
}

