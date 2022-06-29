package com.example.myapplication.ui.screen

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun SecondScreen(
    //navController: NavController,
    //onClickButton: () -> Unit

) {
    Text(
        text = "Second",
        fontSize = 100.sp,
        textAlign = TextAlign.Center
    )
}