package waslim.binar.andlima.jetpackcompose

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import waslim.binar.andlima.jetpackcompose.latihansatu.HitungK
import waslim.binar.andlima.jetpackcompose.latihansatu.Login
import waslim.binar.andlima.jetpackcompose.latihansatu.Payment
import waslim.binar.andlima.jetpackcompose.selasa.CardViewLayout
import waslim.binar.andlima.jetpackcompose.selasa.RecyclerViewLayout
import waslim.binar.andlima.jetpackcompose.selasa.ScrollActivity
import waslim.binar.andlima.jetpackcompose.selasa.latihanappnote.LoginLayout
import waslim.binar.andlima.jetpackcompose.selasa.latihanappnote.RegisterLayout
import waslim.binar.andlima.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android 5")
//                    Column() {
//                        ButtonCustom(title = "ButtonEmpat", color = Color.Blue)
//                        ButtonCustom(title = "ButtonLima", color = Color.Black)
//                        ButtonCustom(title = "ButtonEnam", color = Color.Green)
//                    }

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column(modifier = Modifier
        .padding(15.dp)
        .fillMaxWidth()
        .height(100.dp)){
        Text(text = "Hello, $name!, ditengah",
            color = Color.Blue,
            fontFamily = FontFamily.SansSerif,
            fontSize = 15.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.fillMaxWidth())
        Spacer(modifier = Modifier.padding(15.dp))

        Text(text = "Hello, $name!, start",
            color = Color.Black,
            fontFamily = FontFamily.Monospace,
            fontSize = 15.sp,
            textAlign = TextAlign.Start,
            fontWeight = FontWeight.SemiBold)
        Spacer(modifier = Modifier.padding(15.dp))

        Text(text = "Hello, $name!, end",
            color = Color.Blue,
            fontFamily = FontFamily.SansSerif,
            fontSize = 15.sp,
            textAlign = TextAlign.End,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.fillMaxWidth())

        Spacer(modifier = Modifier.padding(15.dp))

        Button(onClick = {},
            modifier = Modifier
                .padding(start = 15.dp, end = 15.dp)
                .border(width = 2.dp, color = Color.Black)
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(Color.Green)) {
            Text(text = "Simpan 1")
        }

        Spacer(modifier = Modifier.padding(3.dp))

        Row() {
            val mcontext = LocalContext.current

            Button(onClick = {
                mcontext.startActivity(Intent(mcontext, Login::class.java))
            }) {
                Text(text = "Ke Login")
            }

            Spacer(modifier = Modifier.padding(3.dp))

            Button(onClick = {
                mcontext.startActivity(Intent(mcontext, HitungK::class.java))
            }) {
                Text(text = "Ke Hitung K")
            }

            Spacer(modifier = Modifier.padding(3.dp))

            Button(onClick = {
                mcontext.startActivity(Intent(mcontext, Payment::class.java))
            }) {
                Text(text = "Ke Payment")
            }

            Spacer(modifier = Modifier.padding(15.dp))

            Column() {
                Text(text = "1")
                Text(text = "2")
            }

        }

        var text by remember { mutableStateOf("")}
        TextField(value = "Edit Text", onValueChange = {text = it})

        var text2 by remember { mutableStateOf("")}
        TextField(value = "Edit Text", onValueChange = {text2 = it})

        var text3 by remember { mutableStateOf("") }
        OutlinedTextField(
            value = text3,
            onValueChange = { text3 = it },
            label = { Text("Masukan Nama") }
        )

        Spacer(modifier = Modifier.padding(10.dp))

        Row() {
            val mcontext = LocalContext.current

            Button(onClick = {
                mcontext.startActivity(Intent(mcontext, waslim.binar.andlima.jetpackcompose.selasa.Box::class.java))
            }) {
                Text(text = "box")
            }


            Spacer(modifier = Modifier.padding(3.dp))


            Spacer(modifier = Modifier.padding(3.dp))

            Button(onClick = {
                mcontext.startActivity(Intent(mcontext, ScrollActivity::class.java))
            }) {
                Text(text = "scroll view")
            }

        }

        Spacer(modifier = Modifier.padding(7.dp))

        Row() {
            val mcontext = LocalContext.current

            Button(onClick = {
                mcontext.startActivity(Intent(mcontext, CardViewLayout::class.java))
            }) {
                Text(text = "card view")
            }

            Spacer(modifier = Modifier.padding(3.dp))

            Button(onClick = {
                mcontext.startActivity(Intent(mcontext, RecyclerViewLayout::class.java))
            }) {
                Text(text = "recycler view")
            }

            Button(onClick = {
                mcontext.startActivity(Intent(mcontext, LoginLayout::class.java))
            }) {
                Text(text = "Register")
            }


        }
    }


}

@Composable
fun ButtonCustom(title : String, color: Color){
    Button(onClick = { },
        modifier = Modifier.padding(10.dp),
        colors = ButtonDefaults.buttonColors(color)
    ) {
        Text(text = title)

    }
}

//@Composable
//fun textCustom(){
//    Text(text = "Hello Android 5",
//        fontSize = 20.sp,
//        fontWeight = FontWeight.Bold)
//}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    JetpackComposeTheme {
        Greeting("Android 5")
    }
}