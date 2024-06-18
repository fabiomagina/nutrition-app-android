package com.fiap.nutritionapp.model

data class Alimento(
    var id: Long = 0,
    var nome: String,
    var carboidratos: Int,
    var proteinas: Int,
    var gorduras: Int,
)
