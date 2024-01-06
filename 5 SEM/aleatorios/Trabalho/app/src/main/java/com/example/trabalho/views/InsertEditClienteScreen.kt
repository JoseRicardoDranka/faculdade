package com.example.trabalho.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Checkbox
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.trabalho.viewsmodels.ClientesViewModel

@Composable
fun insertEditClienteScreen(
    navController: NavController,
    clientesViewModel: ClientesViewModel,
) {
    val uiState by clientesViewModel.insertEditScreenUiState.collectAsState()
    InsertEditForm(
        name = uiState.clienteName,
        important = uiState.isImportant ,
        onNameChange = {clientesViewModel.onClientenameChange(it)},
        onImportantChange = {clientesViewModel.onClienteImportantChange(it)})
}



@Composable
fun InsertEditForm(
    name: String,
    important: Boolean,
    onNameChange: (String) -> Unit,
    onImportantChange: (Boolean) -> Unit
) {

    Column(modifier = Modifier
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Column(horizontalAlignment = Alignment.Start) {
            OutlinedTextField(
                label = { Text(text = "nome da tarefa") },
                value = name, onValueChange = onNameChange
            )
            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(checked = important, onCheckedChange = onImportantChange)
                Text(text = "tarefa importante ")
            }
        }
    }
}