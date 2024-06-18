package com.fiap.nutritionapp.components.fragments

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BotaoVoltar(
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .size(36.dp)
            .background(Color(0xFF227C73), shape = CircleShape)
            .clickable(
                onClick = onClick,
            ),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            imageVector = Icons.Default.ArrowBack,
            contentDescription = "Add",
            tint = Color.White
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BotaoVoltarPreview() {
    BotaoVoltar(onClick = {})
}