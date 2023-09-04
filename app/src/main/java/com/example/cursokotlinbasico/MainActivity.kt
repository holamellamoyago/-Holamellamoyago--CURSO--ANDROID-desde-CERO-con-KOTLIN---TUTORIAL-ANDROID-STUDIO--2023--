package com.example.cursokotlinbasico

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.cursokotlinbasico.ui.theme.CursoKotlinBasicoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CursoKotlinBasicoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CursoKotlinBasicoTheme {
        Greeting("Android")
    }
}

fun main(){
    showMyName("Yago")
    calculadorasuma(30, 20)
    val myCalculadoraResta = calculadoraResta(50, 40)
    println(myCalculadoraResta)
}

fun showMyName(nombre: String){
    println("Mi nombre es $nombre")
}

fun calculadorasuma(numero1:Int , numero2:Int){
    println(numero1 + numero2)
}

fun calculadoraResta(numero1: Int, numero2: Int):Int{
    return numero1 - numero2
}

