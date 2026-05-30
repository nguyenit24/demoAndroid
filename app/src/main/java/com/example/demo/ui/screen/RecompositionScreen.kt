package com.example.demo.ui.screen

import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.demo.ui.component.Content
import com.example.demo.ui.component.Footer
import com.example.demo.ui.component.Header

@Composable
fun RecompositionScreen(
    navController: NavController
) {

    var count by remember {
        mutableStateOf(0)
    }

    Column(
        modifier = Modifier.padding(20.dp)
    ) {

        Button(
            onClick = {
                navController.popBackStack()
            }
        ) {
            Text("Back")
        }

        Header()

        Content(count = count)

        Footer()

        Spacer(
            modifier = Modifier.height(16.dp)
        )

        Button(
            onClick = {

                count++

                Log.d(
                    "RECOMPOSITION",
                    "Count = $count"
                )
            }
        ) {
            Text("Increase")
        }
    }
}

