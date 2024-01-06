package com.example.trabalho.views

import android.annotation.SuppressLint
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.painterResource
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.trabalho.viewsmodels.ClientesViewModel

//servira para navegar para as outras views

@SuppressLint("UnusedMaterialScaffoldPaddingParameter", "ComposableDestinationInComposeScope")
@Composable
fun MainScreen (
    // passando parametros
    clientesViewModel: ClientesViewModel = viewModel()
) {
    val navController = rememberNavController()
    val uiState by  clientesViewModel.mainScreenUiState.collectAsState()
    Scaffold (
        // topAppBar para indicar as telas
        topBar = {
            TopAppBar() {
                Text(text = uiState.screenName )
            }
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {
                clientesViewModel.navigate(navController)
            }) {
                Icon(painter = painterResource(id = uiState.fabIcon), contentDescription = null ) // pucha o simbolo de outra classe
            }
        }
    ) {
        NavHost(navController = navController, startDestination = "cliente_list"){// rota principal do app
// aonde ficara armazenado as telas serao dois composable

            composable( "cliente_list"){
                TaskScreen(
                    navController = navController,  clientesViewModel =  clientesViewModel)
            }
            composable("insert_edit_cliente"){
                insertEditClienteScreen(navController = navController, clientesViewModel = clientesViewModel)

           // tela para lista de fotos
            // ao listaar essas pagina fico confuso rotas e funcoes toda a maneira de
                // passaar oss parametroda erro  ou talvez deveria ser fora ddo naveHost
            }

            composable("tatuagem"){
                AffirmationApp(navController = navController, clientesViewModel = clientesViewModel)
            }

        }
    }

}






