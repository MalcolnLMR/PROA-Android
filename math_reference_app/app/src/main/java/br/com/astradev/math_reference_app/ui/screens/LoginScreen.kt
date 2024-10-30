package br.com.astradev.math_reference_app.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import br.com.astradev.math_reference_app.ui.screens.objects.Routes
import br.com.astradev.math_reference_app.ui.theme.Math_reference_appTheme

@Composable
fun LoginScreen(navController: NavController){
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .clickable {
                navController.navigate(Routes.REGISTER_SCREEN)
            }
    ) {
        Text("Login_SCREEN")
    }
}

@Composable
@Preview(showBackground = true)
fun LoginScreenPreview(){
    Math_reference_appTheme {
        LoginScreen(rememberNavController())
    }
}