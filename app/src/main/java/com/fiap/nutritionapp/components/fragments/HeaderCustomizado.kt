package com.fiap.nutritionapp.components.fragments

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun HeaderCustomizado(texto1: String, texto2: String, navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(84.dp)
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(horizontal = 0.dp, vertical = 0.dp)
                .height(60.dp)
                .background(Color(0xFF797019)),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = texto1,
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                color = Color(0xFFDBDBDB),
                textAlign = TextAlign.Start,
                modifier = Modifier.padding(start = 16.dp)
            )
            Text(
                text = texto2,
                fontSize = 18.sp,
                color = Color(0xFFECECEC),
                textAlign = TextAlign.Start,
                modifier = Modifier.padding(end = 4.dp)
            )
        }
        Row(Modifier.offset(y=48.dp)) {
            BotaoVoltar {
                navController.navigateUp()
            }
        }
    }
}

@Preview
@Composable()
fun HeaderPersonalizadoPreview(){
    var navController = rememberNavController()
    HeaderCustomizado(texto1 = "Header Custom", texto2 = "texto 2", navController )
}