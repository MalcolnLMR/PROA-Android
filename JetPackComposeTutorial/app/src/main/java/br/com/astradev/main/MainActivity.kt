package br.com.astradev.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.astradev.main.dataclasses.Message
import br.com.astradev.main.ui.theme.JetPackComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetPackComposeTutorialTheme {
                Greeting(Message("Martha", "AMERICA YA!"))
            }
        }
    }
}

@Composable
fun Greeting(msg: Message) {
    Row {
        Image(
            painter = painterResource(id = R.drawable.download__1_),
            contentDescription = "Lua",
            modifier = Modifier
                .size(40.dp)
                .padding(4.dp)
                .clip(CircleShape)
        )

        Column {
            Text(
                text = msg.author
            )
            Text(
                text = msg.body
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetPackComposeTutorialTheme {
        Greeting(Message("Martha", "AMERICA YA!"))
    }
}