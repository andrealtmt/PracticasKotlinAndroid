package com.example.arr01holamundo.src

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.layout.layout
import androidx.compose.ui.tooling.preview.Preview

class AbsoluteLayoutComposeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AbsoluteLayoutScreen()
        }
    }
}
@Preview
@Composable
fun AbsoluteLayoutScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "Inicio",
            fontSize = 20.sp,
            modifier = Modifier.layout { measurable, constraints ->
                val placeable = measurable.measure(constraints)
                layout(placeable.width, placeable.height) {
                    placeable.place(50.dp.roundToPx(), 100.dp.roundToPx())
                }
            }
        )
        
        Text(
            text = "Planeación",
            fontSize = 20.sp,
            modifier = Modifier.layout { measurable, constraints ->
                val placeable = measurable.measure(constraints)
                layout(placeable.width, placeable.height) {
                    placeable.place(100.dp.roundToPx(), 150.dp.roundToPx())
                }
            }
        )
        
        Text(
            text = "Ejecución",
            fontSize = 20.sp,
            modifier = Modifier.layout { measurable, constraints ->
                val placeable = measurable.measure(constraints)
                layout(placeable.width, placeable.height) {
                    placeable.place(150.dp.roundToPx(), 200.dp.roundToPx())
                }
            }
        )
        
        Text(
            text = "Pruebas",
            fontSize = 20.sp,
            modifier = Modifier.layout { measurable, constraints ->
                val placeable = measurable.measure(constraints)
                layout(placeable.width, placeable.height) {
                    placeable.place(200.dp.roundToPx(), 250.dp.roundToPx())
                }
            }
        )
        
        Text(
            text = "Cierre",
            fontSize = 20.sp,
            modifier = Modifier.layout { measurable, constraints ->
                val placeable = measurable.measure(constraints)
                layout(placeable.width, placeable.height) {
                    placeable.place(260.dp.roundToPx(), 300.dp.roundToPx())
                }
            }
        )
    }
}