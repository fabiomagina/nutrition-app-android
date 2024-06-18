package com.fiap.nutritionapp.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.fiap.nutritionapp.components.fragments.TextoBGCircular
import com.fiap.nutritionapp.components.fragments.TextoBGRetangular

@Composable
fun MensagemEntrada() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .background(Color.White)
            .padding(16.dp),
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center) {
            Text(
                text = "Bruna, Parabéns!! ",
                fontSize = 24.sp,
                textAlign = TextAlign.Center
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center) {
            Text(
                text = "você fez: ",
                fontSize = 14.sp,
                textAlign = TextAlign.Center
            )
            TextoBGCircular("96") //implementar calculo
            Text(
                text = " refeições",
                fontSize = 14.sp,
                textAlign = TextAlign.Center
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center) {
            Text(
                text = "que o nutri passou no período de ",
            )
            TextoBGRetangular(text = "30")
            Text(
                text = " dias!",
            )
        }


    }
}

@Preview(showBackground = true)
@Composable
fun MensagemEntradaPreview() {
    Surface {
        MensagemEntrada()
    }
}