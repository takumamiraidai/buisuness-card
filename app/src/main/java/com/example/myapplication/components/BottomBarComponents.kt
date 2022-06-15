package com.example.myapplication.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.Navigation

@Composable
fun BottomBarComponents(navController: NavController) {
    var selectedItem by remember { mutableStateOf(0) }
    val items = listOf("Name", "Number", "Mail")

    BottomNavigation {
        items.forEachIndexed { index, item ->
            BottomNavigationItem(
                icon = {
                    Icon(
                        imageVector = Icons.Default.Email,
                        contentDescription = "mail-image"
                    )
                },
                label = { Text(text = item) },
                selected = selectedItem == index,
                onClick = { selectedItem = index,
                    //navController.navigate("screen2")

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