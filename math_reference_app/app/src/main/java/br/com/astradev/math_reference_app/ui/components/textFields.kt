package br.com.astradev.math_reference_app.ui.components

import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import br.com.astradev.math_reference_app.ui.theme.Math_reference_appTheme

@Composable
fun NormalTextField(){
    OutlinedTextField(
        value = "teste",
        onValueChange = {}
    )
}

@Composable
@Preview(showBackground = true)
fun NormalTextFieldPreview(){
    Math_reference_appTheme {
        NormalTextField()
    }
}