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
import androidx.compose.ui.Alignment.Companion.CenterEnd
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun ItemMenu(text: String, navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp)
            .background(Color(0xFF5F541A), shape = RoundedCornerShape(8.dp))
            .padding(start = 4.dp, end = 16.dp, top = 4.dp, bottom = 4.dp)
            .clickable { navController.navigate("refeicoes") }

    ) {
        Text(
            text = text,
            color = Color.White,
            modifier = Modifier.padding(horizontal = 4.dp),
            fontSize = 24.sp,
            lineHeight = 32.sp
        )
        Row(
            modifier = Modifier.align(CenterEnd)
        ) {
            Arrow()
        }
    }
}

@Composable
fun Arrow() {
    Icon(
        imageVector = Icons.Default.ArrowForward,
        contentDescription = "com.fiap.nutritionapp.components.fragments.Arrow",
        modifier = Modifier.size(24.dp),
        tint = Color.White
    )
}

@Composable
@Preview
fun ItemMenuPreview() {
    val navController = rememberNavController()
    ItemMenu(text = "Menu", navController = navController)
}
