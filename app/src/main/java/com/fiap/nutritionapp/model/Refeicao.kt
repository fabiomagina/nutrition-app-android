package com.fiap.nutritionapp.model
import com.google.gson.annotations.SerializedName

data class ItemRefeicao(
    @SerializedName("id") var id: Number,
    @SerializedName("qtde") var qtde: Number,
)

data class Refeicao(
    @SerializedName("id") var id: String = "",
    @SerializedName("userId") var userId: String = "",
    @SerializedName("nome") var nome: String = "",
    @SerializedName("descricao") var descricao: String? = null,
    @SerializedName("disponivel") var disponivel: Boolean = true,
    @SerializedName("alimentos") var alimentos: List<ItemRefeicao>,
)

