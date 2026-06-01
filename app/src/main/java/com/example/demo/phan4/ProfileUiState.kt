package com.example.demo.phan4

import androidx.compose.runtime.Immutable

@Immutable
data class ProfileUiState(
    val name: String = "",
    val updateCount: Int = 0
)


