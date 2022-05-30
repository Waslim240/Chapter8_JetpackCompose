package waslim.binar.andlima.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import waslim.binar.andlima.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting3("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting3(name: String) {

    var angka1 by remember { mutableStateOf("") }
    var angka2 by remember { mutableStateOf("") }
    var hasil by remember { mutableStateOf("") }

    Column(modifier = Modifier
        .padding(15.dp)
        .fillMaxWidth()
        .height(100.dp), verticalArrangement = Arrangement.Center){

//        TextField(value = angka1, onValueChange = {angka1 = it})
//        TextField(value = angka2, onValueChange = {angka2 = it})

        OutlinedTextField(
            value = angka1,
            onValueChange = { angka1 = it },
            label = { Text("Masukan Angka 2") }
        )

        OutlinedTextField(
            value = angka2,
            onValueChange = { angka2 = it },
            label = { Text("Masukan Angka 2") }
        )

        Button(onClick = {
            hasil = (angka1.toInt() + angka2.toInt()).toString()
        }) {
            Text(text = "Proses Tambah")
        }

        Text(text = hasil)
    }


}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview3() {
    JetpackComposeTheme {
        Greeting3("Android")
    }
}