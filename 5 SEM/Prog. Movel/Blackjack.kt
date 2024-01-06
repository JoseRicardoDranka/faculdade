package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    BlackJackApp()
                }
            }
        }
    }
}

@Composable
fun App(wins:Int,
        draws: Int,
        losses: Int,
        dealerHand:List<Int>,
        playerHand:List<Int>,
        dealerPoints: Int,
        playerPoints: Int,
        showAllCards: Boolean,
        onHitClickButton:()->Unit
        ) {

    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.background),
            contentDescription = "backgroud",
            contentScale = ContentScale.Crop,
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Placar(wins = 0, draws = 0, losses = 0)
            Cartas(cards = listOf(0, 1), showAllCards = false)
            GameResult(playerPoints = 1, dealerPoints = 1)
            Cartas(cards = listOf(10, 13), showAllCards = true)
            PlayerMoves(onHitClickButton)

        }
    }


}

@Composable
fun Placar(wins: Int, draws: Int, losses: Int) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly

    ) {
        Text(text = "Wins:$wins")
        Text(text = "Draws:$draws")
        Text(text = "loss:$losses")
    }
}

@Composable
fun Cartas(
    cards: List<Int>,
    showAllCards: Boolean,
) {
    val offset = 23
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)

    ) {
        cards.forEachIndexed { index, card ->
            val cardImage = if (!showAllCards && index == 1) {
                R.drawable.back
            } else {
                when (card) {
                    1 -> R.drawable.ace
                    2 -> R.drawable.two
                    3 -> R.drawable.three
                    4 -> R.drawable.four
                    5 -> R.drawable.five
                    6 -> R.drawable.six
                    7 -> R.drawable.seven
                    8 -> R.drawable.eight
                    9 -> R.drawable.nine
                    10 -> R.drawable.ten
                    11 -> R.drawable.jack
                    12 -> R.drawable.queen
                    else -> R.drawable.king
                }
            }
            Image(
                modifier = Modifier
                    .height(234.dp)
                    .width(168.dp)
                    .offset((index * offset).dp),
                painter = painterResource(id = cardImage),
                contentDescription = "card $card"
            )
        }
    }
}

@Composable
fun GameResult(playerPoints: Int, dealerPoints: Int) {
    val result = if (playerPoints > 21) "you lost,exceed 21 points!"
    else if (dealerPoints > 21) "you won,dealer exceed 21 Points!"
    else if (playerPoints > dealerPoints) "you won,$playerPoints x $dealerPoints!"
    else "you lost,$playerPoints x $dealerPoints!"

    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(text = result)
        Button(onClick = {}) {
            Text(text = "Play Again")
        }
    }


}

@Composable
fun PlayerMoves(onHitButtonClick: () -> Unit) {
    Row(
        modifier = Modifier.fillMaxWidth()
            .padding(6.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Button(onClick = {}) {
            Text(text = "Hold")
        }
        Button(onClick = {onHitButtonClick}) {
            Text(text ="Hit")
        }
    }
}

@Composable
fun BlackJackApp() {
    var wins by remember {
        mutableStateOf(0)
    }
    var draws by remember {
        mutableStateOf(0)
    }
    var losses by remember {
        mutableStateOf(0)
    }
    var dealerHand by remember {
        mutableStateOf(
            listOf((1..13).random(),
            listOf(1..13).random()
            )
        )
    }
    var playerHand by remember {
        mutableStateOf(
            listOf((1..13).random(),
            listOf(1..13).random()
            )
        )
    }
    var dealerPoints by remember {
        mutableStateOf(0)
    }
    var playerPoints by remember {
        mutableStateOf(0)
    }
    var showDealerHand by remember {
        mutableStateOf(false)
    }
    val hit:()->Unit={
        playerHand=playerHand+(1..13).random()
    }

}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        BlackJackApp()
    }
}