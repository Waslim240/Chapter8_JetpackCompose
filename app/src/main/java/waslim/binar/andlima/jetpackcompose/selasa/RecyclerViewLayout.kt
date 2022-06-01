package waslim.binar.andlima.jetpackcompose.selasa

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import waslim.binar.andlima.jetpackcompose.R
import waslim.binar.andlima.jetpackcompose.selasa.ui.theme.JetpackComposeTheme

class RecyclerViewLayout : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    val studentRepository = StudentRepository()
                    val allData = studentRepository.getAllData()
                    LazyColumn(){
                        items(items = allData){ student ->
                            Greeting10(student = student)
                        }
                    }
                }
            }
        }
    }
}



@Composable
fun Greeting10(student: Student) {
    Column(modifier = Modifier
        .padding(15.dp)) {

        Card(shape = RoundedCornerShape(10.dp),
            backgroundColor = Color.Green,
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)) {

            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
                verticalAlignment = Alignment.CenterVertically) {

                Image(painter = painterResource(id = R.drawable.ic_baseline_account_circle_24), contentDescription = "icon")

                Column() {

                    Text(
                        text = "ID  : ${student.id}",
                        color = Color.Black,
                        fontWeight = FontWeight.Normal,
                        modifier = Modifier.padding(start = 20.dp))

                    Text(
                        text = "Nama : ${student.name}",
                        color = Color.Black,
                        fontWeight = FontWeight.Normal,
                        modifier = Modifier.padding(start = 20.dp))

                    Text(
                        text = "Umur : ${student.age}",
                        color = Color.Black,
                        fontWeight = FontWeight.Normal,
                        modifier = Modifier.padding(start = 20.dp))
                }

            }
        }
        
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview10() {
    JetpackComposeTheme {
        Greeting10(student = Student(0, "waslim", 21))
    }
}