package com.fiap.nutritionapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.fiap.nutritionapp.components.MenuPrincipal
import com.fiap.nutritionapp.telas.CadastrarAlimentoScreen
import com.fiap.nutritionapp.telas.LoginScreen
import com.fiap.nutritionapp.telas.MenuScreen
import com.fiap.nutritionapp.telas.RefeicaoScreen
import com.fiap.nutritionapp.telas.RefeicoesScreen
import com.fiap.nutritionapp.ui.theme.NutritionAPPTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NutritionAPPTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Black
                ) {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "login" ) {
                        composable(route = "login") { LoginScreen(navController)}
                        composable(route="menu") { MenuScreen(navController)}
                        composable(route ="refeicoes") { RefeicoesScreen(navController)}
                        composable(route = "refeicao") { RefeicaoScreen(navController) }
                        composable(route = "cadastrar") { CadastrarAlimentoScreen(navController)}

                    }

                }
            }
        }
    }
}


