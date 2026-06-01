package com.example.demo.phan4

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun ProfileScreen(
    viewModel: ProfileViewModel = viewModel()
) {

    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        OutlinedTextField(
            value = uiState.name,
            onValueChange = {
                viewModel.updateName(it)
            },
            label = {
                Text("Name")
            }
        )

        Text(
            text = "Hello ${uiState.name}",
            modifier = Modifier.padding(top = 16.dp)
        )

        Text(
            text = "Update Count: ${uiState.updateCount}",
            modifier = Modifier.padding(top = 8.dp)
        )

        Button(
            onClick = {
                viewModel.updateName(uiState.name)
            },
            modifier = Modifier.padding(top = 16.dp)
        ) {
            Text("Lưu")
        }
    }
}

