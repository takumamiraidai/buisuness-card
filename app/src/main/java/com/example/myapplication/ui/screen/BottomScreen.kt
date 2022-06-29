package com.example.myapplication.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Bottom() {
    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.End,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .padding(60.dp, 100.dp),

        ) {
        Row(
            //modifier = Modifier.padding(30.dp),
        ) {
            Icon(
                imageVector = Icons.Default.Phone,
                contentDescription = "mail-image",
                modifier = Modifier.size(50.dp),
            )
            Text(
                modifier = Modifier.fillMaxWidth(1f),
                text = "070 3519 0394",
                fontSize = 20.sp,
                textAlign = TextAlign.End,
            )

        }

        Row() {
            Icon(
                imageVector = Icons.Default.Share,
                contentDescription = "mail-image",
                modifier = Modifier.size(50.dp)
            )
            Text(
                modifier = Modifier.fillMaxWidth(1f),
                text = "b1021236@fun.ac.jp",
                fontSize = 20.sp,
                textAlign = TextAlign.End,
            )

        }

        Row() {
            Icon(
                imageVector = Icons.Default.Email,
                contentDescription = "mail-image",
                modifier = Modifier.size(50.dp)
            )
            Text(
                modifier = Modifier.fillMaxWidth(1f),
                text = "jnrwigei.com",
                fontSize = 20.sp,
                textAlign = TextAlign.End,
            )

        }
    }

}
