package com.example.arr01holamundo.src

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class TableLayoutComposeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize()
            ) {
                TableLayoutContent()
            }
        }
    }
}

@Composable
fun TableLayoutContent() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 100.dp, top = 100.dp)
    ) {
        // Primera fila: 1, 2, 3
        Row {
            Text(
                text = "1",
                fontSize = 80.sp,
                modifier = Modifier.padding(10.dp)
            )
            Text(
                text = "2",
                fontSize = 80.sp,
                modifier = Modifier.padding(10.dp)
            )
            Text(
                text = "3",
                fontSize = 80.sp,
                modifier = Modifier.padding(10.dp)
            )
        }

        // Segunda fila: 4 (span 2), 5
        Row {
            Text(
                text = "4",
                fontSize = 80.sp,
                modifier = Modifier
                    .padding(10.dp)
                    // El width aproximado para ocupar el espacio de 2 celdas
                    .width(320.dp)
            )
            Text(
                text = "5",
                fontSize = 80.sp,
                modifier = Modifier.padding(10.dp)
            )
        }
    }
}