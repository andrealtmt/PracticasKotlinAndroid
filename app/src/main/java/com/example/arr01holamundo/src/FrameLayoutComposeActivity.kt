package com.example.arr01holamundo.src

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class FrameLayoutComposeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FrameLayoutScreen()
        }
    }
}

@Composable
fun FrameLayoutScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        // Negro text
        Text(
            text = "Negro",
            fontSize = 20.sp,
            color = Color.White,
            modifier = Modifier
                .width(90.dp)
                .height(120.dp)
                .background(Color.Black),
            textAlign = TextAlign.Center
        )

        // Rojo text
        Text(
            text = "Rojo",
            fontSize = 20.sp,
            modifier = Modifier
                .wrapContentSize()
                .align(Alignment.TopEnd)
                .background(Color(0xFFFF4444)) // holo_red_light color
        )

        // Naranja text
        Text(
            text = "Naranja",
            fontSize = 20.sp,
            modifier = Modifier
                .wrapContentWidth()
                .height(100.dp)
                .align(Alignment.TopCenter)
                .background(Color(0xFFFF8800)), // holo_orange_dark color
            textAlign = TextAlign.Center
        )

        // Azul text
        Text(
            text = "Azul",
            fontSize = 20.sp,
            modifier = Modifier
                .width(70.dp)
                .wrapContentHeight()
                .align(Alignment.CenterStart)
                .background(Color(0xFF33B5E5)) // holo_blue_light color
        )

        // Amarillo text
        Text(
            text = "Amarillo",
            fontSize = 20.sp,
            modifier = Modifier
                .width(150.dp)
                .wrapContentHeight()
                .align(Alignment.Center)
                .background(Color(0xFFFFBB33)), // holo_orange_light color
            textAlign = TextAlign.End
        )

        // Verde text
        Text(
            text = "Verde",
            fontSize = 20.sp,
            modifier = Modifier
                .width(150.dp)
                .wrapContentHeight()
                .align(Alignment.BottomCenter)
                .background(Color(0xFF99CC00)), // holo_green_light color
            textAlign = TextAlign.End
        )
    }
}