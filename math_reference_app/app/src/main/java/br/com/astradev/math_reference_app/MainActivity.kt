package br.com.astradev.math_reference_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import br.com.astradev.math_reference_app.ui.screens.MathReferenceNavigationGraph
import br.com.astradev.math_reference_app.ui.theme.Math_reference_appTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Math_reference_appTheme {
                MathReferenceApp()
            }
        }
    }

    @Composable
    fun MathReferenceApp(){
        MathReferenceNavigationGraph()
    }
}

