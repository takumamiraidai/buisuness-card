package com.example.myapplication.navigation

sealed class AppScreen(val route: String) {
    object Screen1 : AppScreen("screen1")
    object Screen2 : AppScreen("screen2")
    object Screen3 : AppScreen("screen3")
}
