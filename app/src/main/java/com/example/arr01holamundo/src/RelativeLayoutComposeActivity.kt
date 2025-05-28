package com.example.arr01holamundo.src

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class RelativeLayoutComposeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
    @Composable
    @Preview
    fun pantalla(){
        Surface(
            modifier = Modifier.fillMaxSize()
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp)
            ) {
                // Centro
                Text(
                    text = "•",
                    modifier = Modifier.align(Alignment.Center),
                    fontSize = 40.sp
                )

                // Norte
                Text(
                    text = "NORTE",
                    modifier = Modifier
                        .align(Alignment.Center)
                        .offset(y = -50.dp),
                    fontSize = 40.sp
                )

                // Sur
                Text(
                    text = "SUR",
                    modifier = Modifier
                        .align(Alignment.Center)
                        .offset(y = 50.dp),
                    fontSize = 40.sp
                )

                // Este
                Text(
                    text = "ESTE",
                    modifier = Modifier
                        .align(Alignment.Center)
                        .offset(x = 60.dp),
                    fontSize = 40.sp
                )

                // Oeste
                Text(
                    text = "OESTE",
                    modifier = Modifier
                        .align(Alignment.Center)
                        .offset(x = -60.dp),
                    fontSize = 40.sp
                )
            }
        }
    }
}