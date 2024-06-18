package com.fiap.nutritionapp.telas

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import br.com.fiap.consultacep.service.RetrofitFactory
import com.fiap.nutritionapp.components.fragments.BotaoAdd
import com.fiap.nutritionapp.components.fragments.HeaderCustomizado
import com.fiap.nutritionapp.components.fragments.ItemRefeicao
import com.fiap.nutritionapp.components.fragments.TabelaNutricional
import com.fiap.nutritionapp.model.Refeicao

@Composable
fun RefeicoesScreen(navController: NavController) {
    var refeicoes = remember {
        mutableStateOf<List<Refeicao>>(emptyList())
    }

    Surface(color = Color(color = 0xFFE7E7E7)) {
        Column(modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceBetween) {
            Column () {

                HeaderCustomizado(texto1 = "Refeições de Hoje", texto2 = "21/03/2024", navController )
                Spacer(modifier = Modifier.height(16.dp))
                Column(Modifier.padding(horizontal = 8.dp)) {
                    ItemRefeicao("Café da Manhã", navController)
                    ItemRefeicao("Almoço", navController)
                    ItemRefeicao("Janta", navController)
                }
                Spacer(modifier = Modifier.height(4.dp))
                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                    horizontalArrangement = Arrangement.End) {
                    BotaoAdd(onClick = {})
                }
            }
            Column () {
                TabelaNutricional(
                    cabecalho = "Tabela nutricional do dia",
                    carboidratos = 325,
                    proteinas = 89,
                    gorduras = 89)
                Spacer(modifier = Modifier.height(120.dp))
            }
        }
    }
}

@Preview
@Composable
fun RefeicoesScreenPreview(){
    var navController = rememberNavController()
    RefeicoesScreen(navController)
}
