package waslim.binar.andlima.jetpackcompose.selasa.latihanappnote

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.R
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import waslim.binar.andlima.jetpackcompose.latihansatu.HitungK
import waslim.binar.andlima.jetpackcompose.selasa.latihanappnote.ui.theme.JetpackComposeTheme

class RegisterLayout : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting12("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting12(name: String) {
    var username by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var hasil by remember { mutableStateOf("") }

    Column( horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier
        .padding(15.dp)
        .fillMaxWidth()
        .height(100.dp)){

        Text(text = "Register",
            color = Color.Blue,
            fontFamily = FontFamily.SansSerif,
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.fillMaxWidth())

        Spacer(modifier = Modifier.padding(10.dp))

        Image(painter = painterResource(id = waslim.binar.andlima.jetpackcompose.R.drawable.ic_launcher_background), contentDescription = "iconregist")

        Spacer(modifier = Modifier.padding(40.dp))


        OutlinedTextField(
            value = username,
            onValueChange = { username = it },
            placeholder = { Text(text = "Masukan Username") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            modifier = Modifier.fillMaxWidth(),
            label = { Text("Username") }
        )

        OutlinedTextField(
            value = username,
            onValueChange = { username = it },
            placeholder = { Text(text = "Masukan Email") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            modifier = Modifier.fillMaxWidth(),
            label = { Text("Email") }
        )

        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            placeholder = { Text(text = "Masukan Password") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth(),
            label = { Text("Password") }
        )

        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            placeholder = { Text(text = "Masukan Konfirmasi Password") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth(),
            label = { Text("Konfirmasi Password") }
        )

        Spacer(modifier = Modifier.padding(10.dp))

        val mcontext = LocalContext.current

        Button(onClick = {
            mcontext.startActivity(Intent(mcontext, LoginLayout::class.java))
        },
            modifier = Modifier
                .border(width = 2.dp, color = Color.Black)
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(Color.Green)) {
            Text(text = "Daftar")
        }

        Spacer(modifier = Modifier.padding(10.dp))


    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview12() {
    JetpackComposeTheme {
        Greeting12("Android")
    }
}