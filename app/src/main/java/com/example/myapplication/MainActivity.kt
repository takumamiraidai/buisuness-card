package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MainScreen()
                    BottomScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen(){
    Column (
        //modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        Image(
            painter = painterResource(R.drawable.android_logo),
            contentDescription = "android_image",
            modifier = Modifier.size(250.dp)

        )
        Text(
            "Takuma Yamamoto",
            fontSize = 40.sp
        )
        Text(
            "Student",
            fontSize = 25.sp
        )

    }
}

@Composable
fun BottomScreen(){
    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.Start,
        modifier = Modifier.fillMaxWidth().padding(60.dp,0.dp),

    ){
        Row(
            //modifier = Modifier.padding(30.dp),
        ) {
            Image(
                painter = painterResource(R.drawable.android_logo),
                contentDescription = "android_image",
                modifier = Modifier.size(50.dp) ,
            )
            Text(
                modifier = Modifier.fillMaxWidth(1f),
                text = "070 3519 0394",
                fontSize = 20.sp,
                textAlign = TextAlign.End,
            )

        }

        Row() {
            Image(
                painter = painterResource(R.drawable.android_logo),
                contentDescription = "android_image",
                modifier = Modifier.size(50.dp)
            )
            Text(
                modifier = Modifier.fillMaxWidth(1f),
                "b1021236@fun.ac.jp",
                fontSize = 20.sp
            )

        }

        Row() {
            Image(
                painter = painterResource(R.drawable.android_logo),
                contentDescription = "android_image",
                modifier = Modifier.size(50.dp)
            )
            Text(
                "jnrwigei.com",
                fontSize = 20.sp
            )

        }
    }

}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}