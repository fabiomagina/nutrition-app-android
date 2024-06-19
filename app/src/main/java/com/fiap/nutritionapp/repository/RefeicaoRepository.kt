import com.fiap.nutritionapp.model.Refeicao
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RefeicaoRepository {
    private val apiService = RetrofitInstance.api

    fun fetchData(userId: String, callback: (List<Refeicao>?, Throwable?) -> Unit) {
        val call = apiService.getRefeicoesByUserId(userId)
        call.enqueue(object : Callback<List<Refeicao>> {
            override fun onResponse(call: Call<List<Refeicao>>, response: Response<List<Refeicao>>) {
                if (response.isSuccessful) {
                    callback(response.body(), null)
                } else {
                    callback(null, Throwable("Response not successful"))
                }
            }

            override fun onFailure(call: Call<List<Refeicao>>, t: Throwable) {
                callback(null, t)
            }
        })
    }
}