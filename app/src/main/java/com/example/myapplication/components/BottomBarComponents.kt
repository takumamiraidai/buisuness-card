package com.example.myapplication.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Phone
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavController
import com.example.myapplication.navigation.AppScreen

sealed class BottomBarItem(var dist: String, var icon: ImageVector, var screenRoute: String) {
    object Screen1: BottomBarItem("Name", Icons.Default.Home, AppScreen.Screen1.route)
    object Screen2: BottomBarItem("Number", Icons.Default.Phone, AppScreen.Screen2.route)
    object Screen3: BottomBarItem("Mail", Icons.Default.Email, AppScreen.Screen3.route)
}

@Composable
fun BottomBarComponents(
    navController: NavController,
) {
    var selectedItem by remember { mutableStateOf(0) }
    // val items = listOf("Name", "Number", "Mail")
    // val screenRoute = listOf("screen1", "screen2", "screen3")
    val items = listOf(BottomBarItem.Screen1, BottomBarItem.Screen2, BottomBarItem.Screen3)

    BottomNavigation {
        // index→リストの番号、item→itemsの要素が１つずつ入る
        // fun forEach(items)に近い
        items.forEachIndexed { index, item ->
            BottomNavigationItem(
                icon = {
                    Icon(
                        imageVector = item.icon,
                        contentDescription = "mail-image"
                    )
                },
                label = { Text(text = item.dist) },
                selected = selectedItem == index,
                onClick = {
                    selectedItem = index
                    navController.navigate(item.screenRoute)
                })
        }
    }

//    Column(
//        verticalArrangement = Arrangement.Bottom,
//        horizontalAlignment = Alignment.End,
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(60.dp, 0.dp),
//    )
//    {
//        Row {
//            Button(
//                onClick = { //toSecond()
//                },
//            ) {
//                Icon(
//                    imageVector = Icons.Default.Phone,
//                    contentDescription = "mail-image",
//                    modifier = Modifier.size(50.dp),
//                )
//            }
//
//            Button(
//                onClick = { /*toSecond()*/ },
//            ) {
//                Icon(
//                    imageVector = Icons.Default.Share,
//                    contentDescription = "mail-image",
//                    modifier = Modifier.size(50.dp),
//                )
//            }
//
//            Button(
//                onClick = { //navController.navigate("friendslist")
//                },
//            ) {
//                Icon(
//                    imageVector = Icons.Default.Email,
//                    contentDescription = "mail-image",
//                    modifier = Modifier.size(50.dp),
//                )
//            }
//
//        }
//    }
}