package com.example.trabalho.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.trabalho.R
import com.example.trabalho.data.DataSource
import com.example.trabalho.models.Affirmation
import com.example.trabalho.models.Cliente
import com.example.trabalho.ui.theme.TrabalhoTheme
import com.example.trabalho.viewsmodels.ClientesViewModel

@Composable
fun TaskScreen(
    navController: NavController,
    clientesViewModel: ClientesViewModel

) {
    val uiState by clientesViewModel.clienteScreenUiState.collectAsState() // para ter todas as tarefas do viewModel
    // vai chamar o task list
    clientelist(
        clientes = uiState.allClientes,
        onCompletedChange = { cliente, isCompleted ->
            clientesViewModel.onClienteCompletedChange(cliente, isCompleted)
        }, onEditCliente = {clientesViewModel.editCliente(it, navController)},
            onDeleteCliente = {clientesViewModel.onDeleteCliente(it)}
        )

    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.BottomCenter
    ){
        Column() {
            Button(

                onClick = {
               // onde se ira passar como parametro a ação do botao
               clientesViewModel.navigat(navController = navController)
                }

            ) {
                Text(text = "Tatuagem Realizadas") // login
            }
        }
    }

}
// composable para receber uma lista de clientes
@Composable
fun clientelist(
    clientes: List<Cliente>,
    onCompletedChange: (Cliente, Boolean) -> Unit,
    onEditCliente: (Cliente) -> Unit,
    onDeleteCliente:(Cliente)-> Unit
) {
    LazyColumn(){
        items(clientes){cliente ->
            ClienteEntry(cliente = cliente,
                onCompletedChange = {onCompletedChange(cliente, it)},
                onEditCliente = {onEditCliente(cliente)},
                onDeleteCliente = {onDeleteCliente(cliente)}
                )


        }
    }
}

// vai receber uma unica tarefa
// onde se ira criar o card das tarefas individuais
// o card de entrada
@Composable
fun ClienteEntry(
    cliente: Cliente,
    onCompletedChange: (Boolean) -> Unit,  // funcao que recebe um boolean
    onEditCliente: () -> Unit,
    onDeleteCliente:(Cliente)-> Unit,
) {
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(4.dp)
        .clickable { onEditCliente() }, elevation = 4.dp

    ) {
        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            // vai estabelecer se o icone é importante ou nao
            Row() {
                if (cliente.isImportant){ // se a tarefa for importante ira exibir esse icone
                    Icon(
                        painter = painterResource(id = R.drawable.baseline_priority_high_24),
                        contentDescription = "prioridade")
                }
                Text(text = cliente.name)
            }

            Button(onClick = { onDeleteCliente})
            {
                Icon(painter = painterResource(id = R.drawable.baseline_delete_24), contentDescription = null)

            }

            Checkbox(checked = cliente.isCompleted, onCheckedChange = onCompletedChange)


        }
    }
}

/////

///////////////////////////////////////////////////
// função da lista de fotos
// essa função foi adicionada mais acho que o lugar dela naao é aqui
// não conseguimos adicionalla no onclick para abrir a pagina no caso passar como parametro

@Composable
fun AffirmationApp(
    navController: NavController,
    clientesViewModel: ClientesViewModel,

) {
   TrabalhoTheme() { }
    AffirmationList(affirmationList = DataSource().loadAffirmations())
}



@Composable
fun AffirmationList(affirmationList: List<Affirmation>, modifier: Modifier = Modifier) {
    LazyColumn {
        items(affirmationList) { affirmation ->
            AffirmationCard(affirmation)
        }
    }

}
// lista de fotos das tatuagens ja feitas
@Composable
fun AffirmationCard(affirmation: Affirmation, modifier: Modifier = Modifier) {
   
    Card(modifier = Modifier.padding(8.dp), elevation = 4.dp) {
        Column {
            Image(
                painter = painterResource(affirmation.imageResourceId),
                contentDescription = stringResource(affirmation.stringResourceId),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(194.dp),
                contentScale = ContentScale.Crop
            )
            Text( // vai mostra a legenda da tatuage
                text = LocalContext.current.getString(affirmation.stringResourceId),
                modifier = Modifier.padding(16.dp),
                style = MaterialTheme.typography.h6
            )
        }
    }

}