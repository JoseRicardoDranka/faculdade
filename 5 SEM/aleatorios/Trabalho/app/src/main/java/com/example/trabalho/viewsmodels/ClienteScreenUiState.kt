package com.example.trabalho.viewsmodels

import com.example.trabalho.models.Cliente

data class ClienteScreenUiState(
// aonde eu preciso de uma lista de todas as tarefas
// lista pré definida
    val allClientes: List<Cliente> = listOf(
        Cliente("jeferson", isImportant  = true),
        Cliente("amanda"),
        Cliente("carlos", isImportant = true , isCompleted = true),
        Cliente("maicon"),
    )
)