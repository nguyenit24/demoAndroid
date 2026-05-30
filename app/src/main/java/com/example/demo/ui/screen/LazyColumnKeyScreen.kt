package com.example.demo.ui.screen

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.demo.model.Product

@Composable
fun LazyColumnKeyScreen(
    navController: NavController
) {

    var products by remember {

        mutableStateOf(
            List(20) {
                Product(
                    id = it,
                    name = "Product $it"
                )
            }
        )
    }

    Column {

        Button(
            onClick = {
                navController.popBackStack()
            }
        ) {
            Text("Back")
        }

        Button(
            onClick = {

                products = products.drop(1)

                Log.d(
                    "KEY_DEMO",
                    "Delete first item"
                )
            }
        ) {
            Text("Delete First Item")
        }

        LazyColumn {

            items(
                items = products,
                key = { it.id }
            ) { product ->

                Log.d(
                    "KEY_DEMO",
                    "Compose ${product.id}"
                )

                Text(
                    text = product.name,
                    modifier = Modifier.padding(16.dp)
                )
            }
        }
    }
}

