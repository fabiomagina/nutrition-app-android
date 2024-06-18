package com.fiap.nutritionapp.components.fragments

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun ItemRefeicao(text: String, navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp)
            .background(Color.White, shape = RoundedCornerShape(8.dp))
            .padding(start = 4.dp, end = 16.dp, top = 4.dp, bottom = 4.dp)
            .clickable { navController.navigate("refeicao") }
    ) {
        Text(
            text = text,
            color = Color.Black,
            modifier = Modifier
                .align(Alignment.CenterStart)
                .padding(horizontal = 8.dp),
            fontSize = 24.sp,
            lineHeight = 32.sp
        )
        Row(
            modifier = Modifier.align(Alignment.CenterEnd)
        ) {
            ArrowBlack()
        }
    }
}

@Composable
fun ArrowBlack() {
    Icon(
        imageVector = Icons.Default.ArrowForward,
        contentDescription = "com.fiap.nutritionapp.components.fragments.Arrow",
        modifier = Modifier.size(24.dp),
        tint = Color.Black
    )
}


@Preview
@Composable
fun ItemRefeicaoPreview() {
    val navController = rememberNavController()
    ItemRefeicao(text = "Primeira Refeicao", navController = navController)
}