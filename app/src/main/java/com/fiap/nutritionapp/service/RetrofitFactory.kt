package br.com.fiap.consultacep.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitFactory {

    private val URL = "https://nutrition-app-git-main-fabiomaginas-projects.vercel.app"

    private val retrofitFactory = Retrofit
        .Builder()
        .baseUrl(URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun getRefeicaoService(): RefeicaoService {
        return retrofitFactory.create(RefeicaoService::class.java)
    }

}