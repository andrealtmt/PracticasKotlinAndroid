package com.example.arr01holamundo

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import android.util.Log // libreria para impresión en consola
import java.util.concurrent.atomic.AtomicInteger
import kotlin.random.Random
import android.widget.Button
import com.example.arr01holamundo.src.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.screenhome);

        // Linear Layout
        findViewById<Button>(R.id.btn_linearlayout).setOnClickListener {
            startActivity(Intent(this, LinearLayoutActivity::class.java))
        }
        findViewById<Button>(R.id.btn_linearlayoutCompose).setOnClickListener {
            startActivity(Intent(this, LinearLayoutComposeActivity::class.java))
        }

        // Relative Layout
        findViewById<Button>(R.id.btn_relativelayout).setOnClickListener {
            startActivity(Intent(this, RelativeLayoutActivity::class.java))
        }
        findViewById<Button>(R.id.btn_relativelayoutCompose).setOnClickListener {
            startActivity(Intent(this, RelativeLayoutComposeActivity::class.java))
        }

        // Table Layout
        findViewById<Button>(R.id.btn_tablelayout).setOnClickListener {
            startActivity(Intent(this, TableLayoutActivity::class.java))
        }
        findViewById<Button>(R.id.btn_tablelayoutCompose).setOnClickListener {
            startActivity(Intent(this, TableLayoutComposeActivity::class.java))
        }

        // Frame Layout
        findViewById<Button>(R.id.btn_framelayout).setOnClickListener {
            startActivity(Intent(this, FrameLayoutActivity::class.java))
        }
        findViewById<Button>(R.id.btn_framelayoutCompose).setOnClickListener {
            startActivity(Intent(this, FrameLayoutComposeActivity::class.java))
        }

        // Absolute Layout
        findViewById<Button>(R.id.btn_absolutelayout).setOnClickListener {
            startActivity(Intent(this, AbsoluteLayoutActivity::class.java))
        }
        findViewById<Button>(R.id.btn_absolutelayoutCompose).setOnClickListener {
            startActivity(Intent(this, AbsoluteLayoutComposeActivity::class.java))
        }

        // ScrollView Layout
        findViewById<Button>(R.id.btn_scrollviewlayout).setOnClickListener {
            startActivity(Intent(this, ScrollViewLayoutActivity::class.java))
        }
        findViewById<Button>(R.id.btn_scrollviewlayoutCompose).setOnClickListener {
            startActivity(Intent(this, ScrollViewLayoutComposeActivity::class.java))
        }

        // comentario de una línea
        /*
        Comentario multilinea
        */
        Log.i("INFO", "Mensaje Informativo") //Informativos
        Log.w("ADV", "Mensaje de Advertencia") //Advertencia
        Log.e("ERR", "Mensaje de Error") // Errores
        Log.d("DEP", "Mensaje de Depuración") // Identificar y solucionar Errores
        Log.v("VERB", "Mensaje de verbose") // Imprimir mensjae del flujo del proceso

        // Declaración de las Variables
        //Declaración indicando el tipo de dato
        var entero1: Int=10

        //Declaración de una variable de forma implicita
        var entero2 = 10

        //Declaración de una variable de un único valor
        val entero3: Int = 10

        // Ó
        val entero4 = 10

        // Declaración de una variable que admite un valor null
        var entero5: Int? = null

        // SAFETY NULL
        var numero: Int? = null
        var numero2: Int = 0

        if (numero != null){
            numero2 = numero.toInt()
        }

        // Declaración de Variable Booleanas
        var booleano1 = true
        val booleano2: Boolean = true
        val booleano3: Boolean? = null

        // Declaración de variables de Texto
        var string1 = "Hola"
        val string2: String = "Mundo"
        val string3: String? = null

        // Concatenación de cadenas
        val string4 = string1 + " " + string2

        // Declaración de chars
        var char1: Char = 'H'
        var char2: Char? = null;

        // declaración de un arreglo de forma implícita
        var arreglo1 = arrayOf("Uno", "dos", "tres");

        // array de tipo
        var arreglo2: Array<Int> = arrayOf(1,2,3);

        // array que puede ser nulo
        var arreglo3: Array<Int>? = null;

        // array vacío
        var arreglo4 = emptyArray<Int>();

        // array de valores nulos
        var arreglo5: Array<Int?> = arrayOfNulls(3);

        // manejo de arrays
        // agregar un elemento
        arreglo1 += "Cuatro";

        // quitar elemento por índice
        arreglo1 = arreglo1.filterIndexed{index, _ -> index !=3}.toTypedArray();

        // quitar un elemento por valor
        arreglo1 = arreglo1.filter { it != "tres" }.toTypedArray();

        // iterar un arreglo
        arreglo1.forEach {
            println(it);
        }
    }

    //Declaración de una propiedad de clase
    val TAGLOG = "ANDREA";

    fun generarSaludo(nombre: String): String {
        return "Hola, $nombre";
    }

    fun generarNumeroAleatorio(valorMin: Int? = null, valorMax: Int? = null): Int {
        if (valorMin != null && valorMax!= null) {
            return Random.nextInt(valorMin, valorMax);
        } else if (valorMin != null) {
            return Random.nextInt(0, valorMin + 1);
        } else if(valorMax != null) {
            return Random.nextInt(0, valorMax + 1);
        } else {
            return Random.nextInt();
        }
    }

    fun imprimirMensajes() {
        Log.d(TAGLOG, "Imprimiendo mensajes");
        Log.d(TAGLOG, generarSaludo(TAGLOG));
        Log.d(TAGLOG, generarNumeroAleatorio(5, 10).toString());
        Log.d(TAGLOG, generarNumeroAleatorio(10).toString());
        Log.d(TAGLOG, generarNumeroAleatorio(null, 5).toString());
    }

    // paso de parámetros por valor
    // funciones
    fun SumarPorValor(numero: Int) {
        var numero = numero + 1;
    }

    fun sumarPorReferencia(numero: AtomicInteger) {
        numero.set(numero.toInt() + 1);
    }



}


























