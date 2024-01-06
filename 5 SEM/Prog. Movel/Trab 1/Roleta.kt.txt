package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusManager
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    RoletaApp()
                }
            }
        }
    }
}

@Composable
fun RoletaApp() {//Main

    var turnEnded by remember { mutableStateOf(false) }
    var resultado by remember { mutableStateOf(0) }
    var valorAposta by remember { mutableStateOf("") }
    var apostaColor by remember { mutableStateOf("") }

    val onPlayAgainButton:()->Unit={
        turnEnded=false
    }
    val redButton: () -> Unit = {
        apostaColor = "red"
        valorAposta = "10"
        resultado = Aposta()
        turnEnded = true
    }

    val blackButton: () -> Unit = {
        apostaColor = "black"
        valorAposta = "10"
        resultado = Aposta()
        turnEnded = true
    }

    val greenButton: () -> Unit = {
        apostaColor = "green"
        valorAposta = "10"
        resultado = Aposta()
        turnEnded = true
    }


    mainScreen(
        turnEnded = turnEnded,
        valorAposta = valorAposta,
        onHitredButon = redButton,
        onHitblackButton = blackButton,
        onHitgreenButton = greenButton,
        apostaColor = apostaColor,
    )
}

@Composable
fun mainScreen(//Main
    turnEnded: Boolean,
    valorAposta: String,
    onHitredButon: () -> Unit,
    onHitblackButton: () -> Unit,
    onHitgreenButton: () -> Unit,
    apostaColor: String,
) {
    var resultado: Int by remember { mutableStateOf(0) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Blue),

    ) {
        Image(
            modifier=Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable._a9de80f_c16a_4b52_86aa_9dce9124affd),
            contentDescription ="background",
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Actions(
                turnEnded = false,
                onHitgreenButton = onHitgreenButton,
                onHitblackButton = onHitblackButton,
                onHitredButon = onHitredButon,
            )
            if (turnEnded) {
                resultado = Aposta()
                Resultado(apostaColor, valorAposta, resultado)
            }

        }
    }
}

fun Aposta(): Int {// funça para girar roleta
    return (0..20).random()//gera um numero aleatorio entre 0 e 20 e retorna
}


@Composable
fun Resultado(// passa valor da aposta a cor da aposta e o retorno da função Aposta
    apostaColor: String,
    valorAposta: String,
    result: Int
) {
    var resultadoApostaColor: String
    if (result == 0)
        resultadoApostaColor = "green"
    else if (result % 2 == 0)
        resultadoApostaColor = "black"  //verifica se o resultado deu par impar ou 0
    else
        resultadoApostaColor = "red"

    var valorganho: Double

    val valorApostaDouble = runCatching { valorAposta.toDouble() }.getOrDefault(0.0)

    if (resultadoApostaColor == apostaColor && resultadoApostaColor == "green") {
        valorganho = valorApostaDouble * 15
        Text("You win $valorganho",fontSize = 30.sp, color = Green)
    } else if (resultadoApostaColor == apostaColor && resultadoApostaColor == "red") {
        valorganho = valorApostaDouble * 2
        Text("You win $valorganho",fontSize = 30.sp, color = Green)
    } else if (resultadoApostaColor == apostaColor && resultadoApostaColor == "black") { //verifica se o jogador ganhou ou perdeu
        valorganho = valorApostaDouble * 2
        Text("You win $valorganho",fontSize = 30.sp,color=Green)
    } else if (resultadoApostaColor != apostaColor) {
        Text("You lose $valorApostaDouble",fontSize = 30.sp, color = Red)
    }
    Roleta(listOf(result))//chama a função roleta e passa uma lista de valores que retorna da funçao aposta
}


@Composable
fun Roleta(// define as imagens que serao usados na roleta
    nums: List<Int> = listOf(0)
) {
    val offset = 25

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 25.dp)
    ) {
        nums.forEachIndexed { index, num ->
            val img = when (num) {
                0 -> R.drawable.num0
                1 -> R.drawable.num1
                2 -> R.drawable.num2
                3 -> R.drawable.num3
                4 -> R.drawable.num4
                5 -> R.drawable.num5
                6 -> R.drawable.num6
                7 -> R.drawable.num7
                8 -> R.drawable.num8
                9 -> R.drawable.num9
                10 -> R.drawable.num10
                11 -> R.drawable.num11
                12 -> R.drawable.num12
                13 -> R.drawable.num13
                14 -> R.drawable.num14
                15 -> R.drawable.num15
                16 -> R.drawable.num16
                17 -> R.drawable.num17
                18 -> R.drawable.num18
                19 -> R.drawable.num19
                else -> R.drawable.num20
            }
            Image(
                modifier = Modifier
                    .height(430.dp)
                    .width(350.dp)
                    .offset((index * offset).dp),
                painter = painterResource(id = img),
                contentDescription = "card $num",
            )
        }


    }
}


@Composable
fun Actions(// tem as açoes para o jogador(cria os botoes para o jogador poder apostar)
    turnEnded: Boolean,
    onHitgreenButton: () -> Unit,
    onHitblackButton: () -> Unit,
    onHitredButon: () -> Unit,
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Button(onClick = onHitredButon, enabled = !turnEnded) {
            Text(text = "Red")
        }
        Button(onClick = onHitblackButton, enabled = !turnEnded) {
            Text(text = "Black")
        }
        Button(onClick = onHitgreenButton, enabled = !turnEnded) {
            Text(text = "Green")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        RoletaApp()
    }
}

