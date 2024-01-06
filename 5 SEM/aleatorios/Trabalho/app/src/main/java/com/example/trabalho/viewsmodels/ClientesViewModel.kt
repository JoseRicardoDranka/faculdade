package com.example.trabalho.viewsmodels

import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.example.trabalho.R
import com.example.trabalho.models.Cliente
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class ClientesViewModel: ViewModel() {
// aonde se ira passar a referencia dos UiState

    private var _mainScreenUiState: MutableStateFlow<MainScreenUiState> = MutableStateFlow(
        MainScreenUiState()
    )
    val mainScreenUiState: StateFlow<MainScreenUiState> =
        _mainScreenUiState.asStateFlow()    // val para ter aceso a ele

    private var _clienteScreenUiState: MutableStateFlow<ClienteScreenUiState> = MutableStateFlow(
        ClienteScreenUiState()
    )
    val clienteScreenUiState: StateFlow<ClienteScreenUiState> = _clienteScreenUiState.asStateFlow()

    private var _insertEditScreenUiState: MutableStateFlow<InsertEditScreenUiState> =
        MutableStateFlow(
            InsertEditScreenUiState()
        )
    val insertEditScreenUiState: StateFlow<InsertEditScreenUiState> =
        _insertEditScreenUiState.asStateFlow()

    var editCliente: Boolean = false
    var clienteToEdit: Cliente = Cliente("")
// -------------------------------------------



    fun onDeleteCliente(clienteExcluir: Cliente){

    val allClientesTemp = _clienteScreenUiState.value.allClientes.toMutableList()
    var pos = -1
    allClientesTemp.forEachIndexed { index, cliente ->
        // descobrindo a posicao
        if (clienteExcluir == cliente) {
            pos = index
        }
    }
        allClientesTemp.removeAt(pos)
        _clienteScreenUiState.update{  currentState ->
            currentState.copy(allClientes = allClientesTemp.toList())

        }
}

    fun onClientenameChange(newClienteName: String) { // a acao dessa funcao ocorrera no inserteditTask
        _insertEditScreenUiState.update { currentState ->
            currentState.copy(clienteName = newClienteName)
        }
    }

    fun onClienteImportantChange(newClienteImportance: Boolean) {
        _insertEditScreenUiState.update { currentState ->
            currentState.copy(isImportant = newClienteImportance)
        } // serra modificada nessa tela
    }


    // verifica o checkbox
    fun onClienteCompletedChange(
        updateCliente: Cliente,
        newClienteCompleted: Boolean
    ) {  // função realizara mudança no ClienteScreen
        // a partir desse momento ele identificara a tarefa certa dentro da lista e modificara somente ela
        // fara uma copia da lista do tipo mutavel
        val allClientesTemp = _clienteScreenUiState.value.allClientes.toMutableList()
        var pos = -1
        allClientesTemp.forEachIndexed { index, cliente ->
            // descobrindo a posicao
            if (updateCliente == cliente) {
                pos = index
            }
        }
        allClientesTemp.removeAt(pos)  // vai remover da lista
        allClientesTemp.add(
            pos,
            updateCliente.copy(isCompleted = newClienteCompleted)
        )//  add de novo alterando a condição se ela ta completa ou não
        _clienteScreenUiState.update { currentState ->
            currentState.copy(allClientes = allClientesTemp.toList())
        }
    }

    fun navigate(navController: NavController) {
        if (_mainScreenUiState.value.screenName == "Agenda Do Dia") {
            if (editCliente) {
                _mainScreenUiState.update { currentState ->
                    currentState.copy(
                        screenName = "Alterção Da Agenda",  // titulo na pagina de alteração
                        fabIcon = R.drawable.baseline_check_24,
                    )
                }
            } else {
                _mainScreenUiState.update { currentState ->
                    currentState.copy(
                        screenName = "Insira um novo cliente",
                        fabIcon = R.drawable.baseline_check_24,
                    )
                }
            }
            navController.navigate("insert_edit_cliente")
        } else {
            _mainScreenUiState.update { currentState ->
                currentState.copy(
                    screenName = "Agenda Do Dia",
                    fabIcon = R.drawable.baseline_add_24,
                )
            }
            if (editCliente) {
                val allClientesTemp = _clienteScreenUiState.value.allClientes.toMutableList()
                var pos = -1
                allClientesTemp.forEachIndexed { index, cliente ->
                    // descobrindo a posicao
                    if (clienteToEdit == cliente) {
                        pos = index
                    }
                }
                allClientesTemp.removeAt(pos)  // vai remover da lista
                allClientesTemp.add(
                    pos, clienteToEdit.copy(
                        name = _insertEditScreenUiState.value.clienteName,
                        isImportant = _insertEditScreenUiState.value.isImportant
                    )
                )//  add de novo alterando a condição se ela ta completa ou não
                _clienteScreenUiState.update { currentState ->
                    currentState.copy(allClientes = allClientesTemp.toList())
                }
            } else {
                _clienteScreenUiState.update { currentstate ->
                    currentstate.copy(
                        allClientes = currentstate.allClientes + Cliente(
                            name = _insertEditScreenUiState.value.clienteName,
                            isImportant = _insertEditScreenUiState.value.isImportant
                        )
                    )
                }
            }
            _insertEditScreenUiState.update {// função para dechar limpo o campo textfield nao dechando as tarefas anteriores
                InsertEditScreenUiState()
            }
            editCliente = false
            clienteToEdit = Cliente("")
            navController.navigate("cliente_list") {
                popUpTo("task_list") {
                    inclusive = true
                }
            }
        }
    }


    fun editCliente(
        cliente: Cliente, navController: NavController
    ){
        editCliente = true
        clienteToEdit =  cliente
        _insertEditScreenUiState.update { currentState ->
            currentState.copy(
                clienteName = cliente.name,
                isImportant = cliente.isImportant
            )
        }
        // linha a se observar caso contrario retornar ao padrao
        navigate(navController )

    }

    fun navigat(navController: NavController) {
       navController.navigate("tatuagem")
    }
}



