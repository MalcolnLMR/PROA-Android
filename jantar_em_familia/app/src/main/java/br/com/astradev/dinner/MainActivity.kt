package br.com.astradev.dinner

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.astradev.dinner.ui.theme.DinnerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DinnerTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Home()
                }
            }
        }
    }
}

@Composable
fun Home(modifier: Modifier = Modifier){

    var rand by remember {
        mutableIntStateOf(0)
    }

    val dinner = when(rand){
        0 -> "Arroz, Feijão, bife e salada"
        1 -> "Macarronada com molho de tomate e carne moída"
        2 -> "Sopa de legumes com carne"
        3 -> "Frango grelhado com purê de batata"
        4 -> "Peixe assado com batata e sadala de alface"
        5 -> "Panqueca de carne"
        else -> "Escondidinho de carne seca ou frango"
    }

    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            //.padding(top = 20.dp)
            .background(color = MaterialTheme.colorScheme.background)
    ) {
        Text(
            text = "Gerador super aleatório de janta",
            fontSize = 30.sp,
            color = Color.Black,
            modifier = Modifier
                .padding(30.dp)
                .fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontFamily = FontFamily.SansSerif
        )

        Text(
            text = dinner,
            fontSize = 20.sp,
            color = Color.Black,
            modifier = Modifier
                .padding(30.dp)
                .fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontFamily = FontFamily.SansSerif
        )

        Button(
            onClick = { rand = (0..6).random() },
            colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    contentColor = Color.White
                    )
        ) {
            Text("Escolher")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DinnerTheme {
        Home()
    }
}