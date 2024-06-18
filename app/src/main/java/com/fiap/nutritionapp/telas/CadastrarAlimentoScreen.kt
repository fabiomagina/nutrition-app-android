package com.fiap.nutritionapp.telas

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.fiap.nutritionapp.components.fragments.HeaderCustomizado
import com.fiap.nutritionapp.model.Alimento

@Composable
fun CadastrarAlimentoScreen(navController: NavController) {
    var nomeAlimento = remember {
        mutableStateOf("")
    }
    var carboidratos = remember {
        mutableStateOf("")
    }
    var proteinas = remember {
        mutableStateOf("")
    }
    var gorduras = remember {
        mutableStateOf("")
    }
    Surface(color = Color(color = 0xFFE7E7E7)) {
    Column() {
        HeaderCustomizado(texto1 = "Cadastrar Alimento", texto2 = "", navController)
        AlimentoForm(
            nome = nomeAlimento.value,
            carboidratos = carboidratos.value,
            proteinas = proteinas.value,
            gorduras = gorduras.value,
            onNomeChange = {
                nomeAlimento.value = it
            },
            onCarboidratosChange = {
                carboidratos.value = it
            },
            onProteinasChange = {
                proteinas.value = it
            },
            onGorduraChange = {
                gorduras.value = it
            },
            navController
        )
    }}
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AlimentoForm(
    nome: String,
    carboidratos: String,
    proteinas: String,
    gorduras: String,
    onNomeChange: (String) -> Unit,
    onCarboidratosChange: (String) -> Unit,
    onProteinasChange: (String) -> Unit,
    onGorduraChange: (String) -> Unit,
    navController: NavController
) {
    // Obter Contexto
    val context = LocalContext.current
    Column (
        modifier = Modifier.padding(16.dp)
    ) {
        Text(text = "Adicione um alimento:",
            fontSize = 24.sp,
            color = Color(0xFF505050)
        )
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            value = nome,
            onValueChange = { onNomeChange(it) },
            modifier = Modifier.fillMaxWidth(),
            label = {
                Text(text = "Nome")
            }
        )
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            value = carboidratos,
            onValueChange = { onCarboidratosChange(it) },
            modifier = Modifier.fillMaxWidth(),
            label = {
                Text(text = "Carboidratos")
            }
        )
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            value = proteinas,
            onValueChange = { onProteinasChange(it) },
            modifier = Modifier.fillMaxWidth(),
            label = {
                Text(text = "Proteinas")
            }
        )
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            value = gorduras,
            onValueChange = { onGorduraChange(it) },
            modifier = Modifier.fillMaxWidth(),
            label = {
                Text(text = "Gorduras")
            }
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {val alimento = Alimento(
                0,
                nome,
                carboidratos.toInt(),
                proteinas.toInt(),
                gorduras.toInt()
            )
                navController.navigateUp()},
            modifier = Modifier.fillMaxWidth()) {
            Text(
                text = "Cadastrar",
                modifier = Modifier.padding(8.dp)
            )
        }
    }
}

@Preview
@Composable
fun CadastrarAlimentoScreenPreview(){
    val navController = rememberNavController()
    CadastrarAlimentoScreen(navController)
}