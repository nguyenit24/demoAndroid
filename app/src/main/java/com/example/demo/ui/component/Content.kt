package com.example.demo.ui.component

import android.util.Log
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun Content(
    count: Int
) {

    Log.d(
        "RECOMPOSITION",
        "Content Recompose"
    )

    Text(
        text = "Count = $count"
    )
}

