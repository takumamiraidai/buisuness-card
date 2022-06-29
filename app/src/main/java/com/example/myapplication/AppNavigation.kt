package com.example.myapplication

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.components.BottomBarComponents
import com.example.myapplication.navigation.AppScreen
import com.example.myapplication.ui.screen.SecondScreen
import com.example.myapplication.ui.screen.ThirdScreen

@Composable
fun AppNavigation(route:String){
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomBarComponents(navController = navController) },
        content = {
            NavHost(navController = navController, startDestination = AppScreen.Screen1.route) {
                composable(route = AppScreen.Screen1.route) {
                    Screen1()
                }
                composable(route = AppScreen.Screen2.route) {
                    SecondScreen()
                }
                composable(route = AppScreen.Screen3.route) {
                    ThirdScreen()
                }

            }
        })

}