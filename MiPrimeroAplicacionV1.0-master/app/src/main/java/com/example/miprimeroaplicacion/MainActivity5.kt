package com.example.miprimeroaplicacion

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main5)


        val opcionesLV: ListView = findViewById(R.id.lv_menu_principal)


        val opcionesArr = arrayOf(
            "calculadora"
            , "api"
           // , "Multiplicar"
            //, "Hola Mundo"
            //, "Dividir"
            )


        val adaptador = ArrayAdapter(this
            , android.R.layout.simple_list_item_1
            , opcionesArr)


        opcionesLV.adapter = adaptador

        opcionesLV.setOnItemClickListener { parent, view, position, id ->
            val itemElegido = parent.getItemAtPosition(position).toString()

            if (itemElegido == "calculadora" ){
                val intent = Intent(this, MainActivity3::class.java)

                startActivity(intent)

            }else if (itemElegido ==  "api"){
                val intent = Intent(this, MainActivity4::class.java)

                startActivity(intent)
            }

            Toast.makeText(this, itemElegido, Toast.LENGTH_SHORT).show()
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}