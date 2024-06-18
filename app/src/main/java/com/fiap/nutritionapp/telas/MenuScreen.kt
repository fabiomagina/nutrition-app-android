package com.fiap.nutritionapp.telas

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.fiap.nutritionapp.components.fragments.Header
import com.fiap.nutritionapp.components.MensagemEntrada
import com.fiap.nutritionapp.components.MenuPrincipal

@Composable
fun MenuScreen(navController: NavController) {
    Surface(color = Color.Gray) {
        Column(modifier = Modifier.fillMaxWidth()) {
            Header()
            MenuPrincipal(navController)
            MensagemEntrada()
        }
    }
}

@Preview
@Composable
fun MenuScreenPreview() {
    var navController = rememberNavController() 
    MenuScreen(navController = (navController))
}
