package waslim.binar.andlima.jetpackcompose.selasa

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import waslim.binar.andlima.jetpackcompose.R
import waslim.binar.andlima.jetpackcompose.selasa.ui.theme.JetpackComposeTheme

class CardViewLayout : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting9("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting9(name: String) {
    Column(modifier = Modifier.padding(15.dp)) {
        Card(modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            .height(100.dp),
        backgroundColor = Color.Gray,
        shape = RoundedCornerShape(15.dp)){
            Row(modifier = Modifier.padding(10.dp)) {
                Image(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription = "icon")
                Column(modifier = Modifier.padding(start = 10.dp)) {
                    Text(text = "judul FIlm satu")
                    Text(text = "12/12/12")
                    Text(text = "James")
                }

            }
        }

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview9() {
    JetpackComposeTheme {
        Greeting9("Android")
    }
}