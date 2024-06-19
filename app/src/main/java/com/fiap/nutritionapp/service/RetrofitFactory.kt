
//    private val URL = "https://nutrition-app-git-main-fabiomaginas-projects.vercel.app"
import br.com.fiap.consultacep.service.RefeicaoService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    private const val BASE_URL = "https://nutrition-app-git-main-fabiomaginas-projects.vercel.app"

    val api: RefeicaoService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(RefeicaoService::class.java)
    }
}
