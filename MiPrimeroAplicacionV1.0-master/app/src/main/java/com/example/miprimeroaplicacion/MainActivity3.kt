package com.example.miprimeroaplicacion

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)

        val numeroUno: EditText = findViewById(R.id.ed_opUno)
        val numeroDos: EditText = findViewById(R.id.ed_opDos)
        val txResultado: TextView = findViewById(R.id.tx_resultado_act4)
        val spOperacionesMat: Spinner = findViewById(R.id.sp_operaciones)
        val btnCalcular: Button = findViewById(R.id.btn_calcular)



        /**
         * Declaramos un array list Menu
         */

        val opcionesSpinner2= arrayOf(
            "Hyundai"
            ,"Toyota"
            ,"Chevrolet"
            ,"kia"
            ,"Mitsubichi"
            ,"Jose PR"
            ,"Hola mundo")

        val opcionesSpinner = arrayOf(
            "Sumar"
            ,"Restar"
            ,"Multiplicar"
            ,"Hola Mundo"
            ,"Dividir")

        //adaptadr de Array
        val  adaptador = ArrayAdapter(this//contexto
                , android.R.layout.simple_list_item_1//elementos listView
                , opcionesSpinner2)//objeto spinner
        //
        spOperacionesMat.adapter = adaptador


        //}

        var numeroUnoConv:Int =numeroUno.text.toString().toIntOrNull() ?:0
        var numeroDosConv:Int =numeroDos.text.toString().toIntOrNull() ?:0

        /*
        if(str_op_selected == "Sumar"){
           val resultado = OpMatematicas.sumar(numeroUnoConv, numeroDosConv)
         txResultado.text = resultado.toString()+"op: " +str_op_selected
        }
        */

        //leo el elemento seleccionados del spinner o listView
        var str_op_selected = spOperacionesMat.selectedItem.toString()


        //toast (popup) pasando el elemento seleccionado
        val toast = Toast.makeText(this
            , str_op_selected
            , Toast.LENGTH_SHORT)
        toast.show()












        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}