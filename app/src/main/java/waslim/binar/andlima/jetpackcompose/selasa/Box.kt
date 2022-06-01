package waslim.binar.andlima.jetpackcompose.selasa

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import waslim.binar.andlima.jetpackcompose.selasa.ui.theme.JetpackComposeTheme

class Box : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting7("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting7(name: String) {

    Column(modifier = Modifier.padding(20.dp)) {

        Row(modifier = Modifier
            .border(width = 3.dp, color = Color.Red)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center) {
            Text(text = "Contoh Row")
            Button(onClick = { /*TODO*/ },
                modifier = Modifier.padding(10.dp)) {
                Text(text = "Button Row")
            }
        }

        Spacer(modifier = Modifier.padding(15.dp))

        Column(modifier = Modifier
            .border(width = 3.dp, color = Color.Green)
            .fillMaxWidth()
            .fillMaxHeight(0.3f),
            horizontalAlignment = Alignment.CenterHorizontally) {

            Spacer(modifier = Modifier.padding(5.dp))

            Text(text = "Column 1", fontSize = 25.sp, fontWeight = FontWeight.Bold)

            Spacer(modifier = Modifier.padding(5.dp))

            Button(onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(Color.Green),
                modifier = Modifier
                    .border(width = 3.dp, color = Color.Red)) {
                Text(text = "Button Column 1")
            }

            Spacer(modifier = Modifier.padding(5.dp))

            Button(onClick = { /*TODO*/ }) {
                Text(text = "Button Column 1")
            }
        }

        Spacer(modifier = Modifier.padding(15.dp))
        
        Box ( modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.DarkGray)
            .fillMaxHeight(0.3f)){
            Button(onClick = { },
                modifier = Modifier.padding(start = 15.dp, top = 15.dp),
                colors = ButtonDefaults.buttonColors(Color.Red)
            ) {
                Text(text = "Button 1")
            }

            Button(onClick = { },
                modifier = Modifier.padding(start = 75.dp, top = 25.dp),
                colors = ButtonDefaults.buttonColors(Color.Green)
            ) {
                Text(text = "Button 2")
            }
        }
    }

     
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview7() {
    JetpackComposeTheme {
        Greeting7("Android")
    }
}