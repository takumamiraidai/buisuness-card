package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.navigation.AppScreen
import com.example.myapplication.ui.screen.Bottom
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppNav()
            Bottom()
        }
    }
}


@Composable
fun AppNav(){
    MyApplicationTheme {
            // A surface container using the 'background' color from the theme
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colors.background
            ) {
                AppNavigation(route = AppScreen.Screen1.route)
            }
        }

}

@Composable
fun Screen1() {
    Column(
        //modifier = Modifier.fillMaxWidth(),
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
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

        Text(text = "Screen 1")
        Button(onClick = {  }) {
            Text(text = "Next")
        }
    }
}
//
//@Composable
//fun Screen2(toSecond: () -> Unit) {
//    Column(modifier = Modifier.fillMaxSize()) {
//        Text("Student", fontSize = 50.sp)
//        Column(
//            verticalArrangement = Arrangement.Center,
//            horizontalAlignment = Alignment.CenterHorizontally,
//            modifier = Modifier.fillMaxSize()
//        ) {
//
//            Button(
//                onClick = { //toSecond()
//                },
//            ) {
//                Text(text = "Back")
//            }
//
//        }
//    }
//
//}
//
//
//@Composable
//fun Screen3(toSecond: () -> Unit) {
//    Icon(
//        imageVector = Icons.Default.Phone,
//        contentDescription = "mail-image",
//        modifier = Modifier.size(50.dp),
//    )
//}



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

@Preview
@Composable
fun PreviewMainScreen2() {
//    MainScreen2(){
//
//    }
}