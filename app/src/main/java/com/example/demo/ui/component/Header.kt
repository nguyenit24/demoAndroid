package com.example.demo.ui.component

import android.util.Log
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun Header() {

    Log.d(
        "RECOMPOSITION",
        "Header Recompose"
    )

    Text("Header")
}

