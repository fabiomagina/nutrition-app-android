import androidx.lifecycle.ViewModel
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.State
import com.fiap.nutritionapp.model.Refeicao

class RefeicaoViewModel : ViewModel() {
    private val repository = RefeicaoRepository()

    private val _data = mutableStateOf<List<Refeicao>>(emptyList())
    val data: State<List<Refeicao>> get() = _data

    init {
        fetchData("userId")
    }

    private fun fetchData(userId: String) {
        repository.fetchData(userId) { result, error ->
            if (result != null) {
                _data.value = result
            } else {
                // Handle the error
                error?.printStackTrace()
            }
        }
    }
}
