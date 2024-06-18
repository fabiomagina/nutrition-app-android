package com.fiap.nutritionapp.components


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.fiap.nutritionapp.components.fragments.ItemMenu

@Composable
fun MenuPrincipal(navController: NavController) {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        ItemMenu(text = "Refeições de Hoje", navController)
        ItemMenu(text = "Meu Histórico", navController)
        ItemMenu(text = "Metas", navController)
        ItemMenu(text = "Fale com o Nutri", navController)
        ItemMenu(text = "Meu perfil", navController)

    }
}

@Composable
@Preview
fun MenuPrincipalPreview() {
    val navController = rememberNavController()
    MenuPrincipal(navController = navController)
}