package com.fiap.nutritionapp.components.fragments

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
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
import com.fiap.nutritionapp.model.Alimento

@Composable
fun ItemAlimento(alimento: Alimento, navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp)
            .background(Color.White, shape = RoundedCornerShape(8.dp))
            .padding(start = 4.dp, end = 16.dp, top = 4.dp, bottom = 4.dp)
            .clickable { navController.navigate("cadastrar") }
    ) {
        Row(Modifier.fillMaxWidth(), Arrangement.SpaceBetween) {
            Row() {
                Text(
                    text = alimento.nome,
                    color = Color.Black,
                    modifier = Modifier
                        .padding(horizontal = 8.dp),
                    fontSize = 24.sp,
                    lineHeight = 32.sp
                )
            }
            Row () {
                Text(
                    text = "C: " + alimento.carboidratos.toString(),
                    color = Color.Black,
                    modifier = Modifier
                        .padding(horizontal = 8.dp),
                    fontSize = 24.sp,
                    lineHeight = 32.sp
                )
                Text(
                    text = "P: " + alimento.proteinas.toString(),
                    color = Color.Black,
                    modifier = Modifier
                        .padding(horizontal = 8.dp),
                    fontSize = 24.sp,
                    lineHeight = 32.sp
                )
                Text(
                    text = "G: " + alimento.gorduras.toString(),
                    color = Color.Black,
                    modifier = Modifier
                        .padding(horizontal = 8.dp),
                    fontSize = 24.sp,
                    lineHeight = 32.sp
                )
            }
            Spacer(modifier = Modifier.width(2.dp))
        }

        Row(
            modifier = Modifier.align(Alignment.CenterEnd)
        ) {
            ArrowBlack()
        }
    }
}

@Preview
@Composable
fun ItemAlimentoPreview() {
    var navController = rememberNavController()
    var alimento = Alimento(0, "Feijão", 2, 3, 4)
    ItemAlimento(alimento, navController)
}