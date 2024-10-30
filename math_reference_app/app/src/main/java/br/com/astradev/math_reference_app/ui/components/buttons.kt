package br.com.astradev.math_reference_app.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import br.com.astradev.math_reference_app.ui.theme.AccentLight
import br.com.astradev.math_reference_app.ui.theme.Black
import br.com.astradev.math_reference_app.ui.theme.Math_reference_appTheme

@Composable
fun AccentButton(
    text: String,
    textColor: Color = Black,
    backgroundColor: Color = AccentLight,
    roundedRadius: Dp = 10.dp,
    height: Dp = 30.dp,
    onClick: () -> Unit
) {
    Surface (
        color = backgroundColor,
        shape = RoundedCornerShape(roundedRadius),
        modifier = Modifier.clickable { onClick() }
    ){
        Box(
            modifier = Modifier
                .height(height = height)
                .padding(horizontal = 10.dp),
            contentAlignment = Alignment.Center
        ){
            Text(
                text,
                color = textColor,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .height(height)
                    .wrapContentHeight()
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun ButtonPreview(){
    Math_reference_appTheme {
        AccentButton(
            text = "Testando botão"
        ) {

        }
    }
}