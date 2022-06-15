package com.example.myapplication

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavigation(route:String){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "screen1") {
        composable(route = "screen1") {
            Screen1{
                navController.navigate("screen2")
                navController.navigate("screen3")

            }//{navController.navigate("second")}
        }
        composable(route = "screen2",) {
            Screen2{
                navController.navigate("screen1")
                navController.navigate("screen3")
            }
        }
        composable(route = "screen3",) {
            Screen3{
                navController.navigate("screen1")
                navController.navigate("screen2")
            }
        }

    }
}