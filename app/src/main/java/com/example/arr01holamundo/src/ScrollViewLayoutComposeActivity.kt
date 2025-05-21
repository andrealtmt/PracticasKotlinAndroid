package com.example.arr01holamundo.src

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

class ScrollViewLayoutComposeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ScrollViewContent()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScrollViewContent() {
    var textFieldValue by remember { mutableStateOf("") }
    var toggleButtonState by remember { mutableStateOf(false) }
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(top = 10.dp)
    ) {
        // EditText
        OutlinedTextField(
            value = textFieldValue,
            onValueChange = { textFieldValue = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            placeholder = { Text("Nombre", textAlign = TextAlign.Center) },
            textStyle = LocalTextStyle.current.copy(textAlign = TextAlign.Center)
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Button
        Button(
            onClick = { 
                Toast.makeText(context, "Ingresaste: $textFieldValue", Toast.LENGTH_SHORT).show()
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        ) {
            Text("Botón")
        }

        Spacer(modifier = Modifier.height(8.dp))

        // ToggleButton
        Button(
            onClick = { 
                toggleButtonState = !toggleButtonState
                val mensaje = if (toggleButtonState) "Encendido" else "Apagado"
                Toast.makeText(context, mensaje, Toast.LENGTH_SHORT).show()
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        ) {
            Text(if (toggleButtonState) "ON" else "OFF")
        }

        Spacer(modifier = Modifier.height(8.dp))

        // Checkbox
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 50.dp)
        ) {
            Checkbox(
                checked = false,
                onCheckedChange = { }
            )
            Text("Checkbox", modifier = Modifier.padding(start = 8.dp))
        }

        // Single RadioButton
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 50.dp)
        ) {
            RadioButton(
                selected = false,
                onClick = { }
            )
            Text("RadioButton", modifier = Modifier.padding(start = 8.dp))
        }

        // RadioGroup
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 50.dp)
            ) {
                RadioButton(
                    selected = false,
                    onClick = { }
                )
                Text("Opción A", modifier = Modifier.padding(start = 8.dp))
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 50.dp)
            ) {
                RadioButton(
                    selected = false,
                    onClick = { }
                )
                Text("Opción B", modifier = Modifier.padding(start = 8.dp))
            }
        }

        Spacer(modifier = Modifier.height(30.dp))

        // ProgressBar
        LinearProgressIndicator(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
                .height(30.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))

        // Spinner
        OutlinedTextField(
            value = "",
            onValueChange = {},
            enabled = false,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        )

        // DatePicker
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp)
        ) {
            DatePicker(
                state = rememberDatePickerState(),
                modifier = Modifier.fillMaxWidth()
            )
        }

        // TimePicker
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp)
        ) {
            TimePicker(
                state = rememberTimePickerState(),
                modifier = Modifier.fillMaxWidth()
            )
        }

        // Espacio final
        Spacer(modifier = Modifier.height(16.dp))
    }
}