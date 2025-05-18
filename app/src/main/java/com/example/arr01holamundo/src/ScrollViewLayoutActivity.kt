package com.example.arr01holamundo.src

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import android.widget.ToggleButton
import androidx.activity.ComponentActivity
import androidx.compose.ui.semantics.text
import com.example.arr01holamundo.R

class ScrollViewLayoutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scroll_view_layout)

        val editText: EditText = findViewById(R.id.txtEditable)
        val boton: Button = findViewById(R.id.btnButton)

        boton.setOnClickListener {
            val mensaje = editText.text.toString()
            Toast.makeText(this, "Ingresaste: $mensaje", Toast.LENGTH_SHORT).show()
        }

        val miToggleButton: ToggleButton = findViewById(R.id.btnToggleClicked)

        miToggleButton.setOnClickListener { view ->
            btnToggleClicked(view)
        }
    }

    fun btnToggleClicked(view: View) {
        var boton = view as ToggleButton

        if(boton.isChecked) {
            Toast.makeText(this, "Encendido", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Apagado", Toast.LENGTH_SHORT).show()
        }
    }
}