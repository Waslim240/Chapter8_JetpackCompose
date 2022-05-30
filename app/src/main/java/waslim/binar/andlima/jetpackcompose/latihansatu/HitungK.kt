package waslim.binar.andlima.jetpackcompose.latihansatu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import waslim.binar.andlima.jetpackcompose.latihansatu.ui.theme.JetpackComposeTheme

class HitungK : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting5("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting5(name: String) {
    var p by remember { mutableStateOf("") }
    var l by remember { mutableStateOf("") }
    var t by remember { mutableStateOf("") }
    var hasil by remember { mutableStateOf("") }

    Column(modifier = Modifier
        .padding(15.dp)
        .fillMaxWidth()
        .height(100.dp)){

        Text(text = "Hitung K",
            color = Color.Blue,
            fontFamily = FontFamily.SansSerif,
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.fillMaxWidth())

        Spacer(modifier = Modifier.padding(10.dp))

        OutlinedTextField(
            value = p,
            onValueChange = { p = it },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier.fillMaxWidth(),
            label = { Text("Masukan Panjang") }
        )

        OutlinedTextField(
            value = l,
            onValueChange = { l = it },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier.fillMaxWidth(),
            label = { Text("Masukan Lebar") }
        )

        OutlinedTextField(
            value = t,
            onValueChange = { t = it },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier.fillMaxWidth(),
            label = { Text("Masukan Tinggi") }
        )

        Spacer(modifier = Modifier.padding(10.dp))

        Button(onClick = {
            hasil = (p.toInt() * l.toInt() * t.toInt()).toString()
        },
            modifier = Modifier
                .border(width = 2.dp, color = Color.Black)
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(Color.Green)) {
            Text(text = "Hitung")
        }

        Spacer(modifier = Modifier.padding(10.dp))

        Text( text = "p x l x t = $hasil", fontSize = 20.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview5() {
    JetpackComposeTheme {
        Greeting5("Android")
    }
}