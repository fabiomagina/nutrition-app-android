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
import com.fiap.nutritionapp.R

@Composable
fun Header() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .background(Color(0xFF19776E)),
        contentAlignment = Alignment.CenterStart
    ) {
        Row(Modifier.fillMaxHeight().fillMaxWidth().padding(horizontal = 8.dp, vertical = 0.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween) {
            Text(
                text = "Olá Bruna Macedo!",
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                color = Color(0xFFECECEC),
                textAlign = TextAlign.Start,
                modifier = Modifier.padding(start = 4.dp)
            )
            CircularImage(imageId = R.drawable.nutrition_logo, size = 62 )
        }

    }
}

@Composable
@Preview
fun HeaderPreview() {
    Header()
}