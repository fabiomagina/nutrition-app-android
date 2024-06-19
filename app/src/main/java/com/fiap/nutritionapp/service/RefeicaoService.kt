package br.com.fiap.consultacep.service

import com.fiap.nutritionapp.model.Refeicao
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface RefeicaoService {

    @POST("/api/busca-refeicoes")
    fun getRefeicoesByUserId(
        @Body userId: String
    ): Call<List<Refeicao>>

}
