package br.com.astradev.math_reference_app.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.com.astradev.math_reference_app.ui.screens.objects.Routes

@Composable
fun MathReferenceNavigationGraph(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.LOGIN_SCREEN)
    {
        composable(Routes.LOGIN_SCREEN){ LoginScreen(navController) }
        composable(Routes.REGISTER_SCREEN){ RegisterScreen(navController) }
    }
}