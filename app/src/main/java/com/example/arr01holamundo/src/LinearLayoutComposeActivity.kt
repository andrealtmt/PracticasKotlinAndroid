package com.example.arr01holamundo.src
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

class LinearLayoutComposeActivity: ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column {
                Row (Modifier.weight(1f).fillMaxHeight()) {}
                Row (Modifier.weight(1f).fillMaxHeight()) {
                    Column (Modifier.weight(1f).fillMaxWidth()) { Seccion("ME", 1) }
                    Column (Modifier.weight(1f).fillMaxWidth()) { Seccion("XI", 2) }
                    Column (Modifier.weight(1f).fillMaxWidth()) { Seccion("CO", 3) }
                }
                Row (Modifier.weight(1f).fillMaxHeight()) {}
            }
        }
    }

    @Composable
    fun Seccion(texto: String, color: Int) {
        Row () {
            Text(text = texto,
                color = if(color == 2) {
                    Color.Black
                } else {
                    Color.White
                },
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(
                        if (color == 1) {
                            Color(0xFF99CC00)
                        } else if (color == 2) {
                            Color.White
                        } else {
                            Color(0xFFFF4444)
                        }),
                textAlign = TextAlign.Center,
                fontSize = 40.sp
            )
        }
    }
}