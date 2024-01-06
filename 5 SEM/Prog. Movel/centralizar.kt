package com.example.exemplo

import android.graphics.Color.*
import android.graphics.fonts.FontStyle
import android.os.Bundle
import android.webkit.WebSettings.TextSize
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

import com.example.exemplo.ui.theme.ExemploTheme
import com.example.exemplo.ui.theme.Typography
import java.time.format.TextStyle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExemploTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Box(
        modifier = Modifier.fillMaxSize(1f)
    ) {
        Image(
            painter = painterResource(id = R.drawable.fundo_img),
            contentDescription = "logo ifsc",
            modifier = Modifier.fillMaxSize(1f),
            contentScale = ContentScale.Crop
        )
        Image(
            painter = painterResource(id = R.drawable.logo_ifsc),
            contentDescription ="IFSC logo",
            modifier = Modifier.align(Alignment.TopStart)
            )
        Text(
            text = "Texto",
            modifier=Modifier.align(Alignment.TopCenter),
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "Caso você queira definir manualmente o alinhamento do texto de um elemento combinável Text, use TextAlign.Start e TextAlign.End em vez de TextAlign.Left e TextAlign.Right, respectivamente, porque eles se referem à borda correta do Text, dependendo da orientação do idioma preferencial. Por exemplo, TextAlign.End fica alinhado à direita para textos em francês e à esquerda para textos em árabe, mas TextAlign.Right alinha o texto à direita independente do alfabeto usado.",
            modifier=Modifier.align(Alignment.Center),
            textAlign = TextAlign.Justify)

    }


}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ExemploTheme {
        Greeting("Android")
    }
}