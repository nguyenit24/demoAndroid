package com.example.demo.ui.component

import android.util.Log
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun Footer() {

    Log.d(
        "RECOMPOSITION",
        "Footer Recompose"
    )

    Text("Footer")
}

