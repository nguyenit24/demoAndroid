package com.example.demo.phan4

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class ProfileViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(ProfileUiState())
    val uiState = _uiState.asStateFlow()

    fun updateName(newName: String) {

        if (_uiState.value.name == newName) {
            return
        }

        _uiState.update {
            it.copy(
                name = newName,
                updateCount = it.updateCount + 1
            )
        }
    }
}