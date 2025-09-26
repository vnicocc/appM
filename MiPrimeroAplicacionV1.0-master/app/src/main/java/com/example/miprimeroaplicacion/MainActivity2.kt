package com.example.miprimeroaplicacion

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        val txUsuario:TextView = findViewById(R.id.id_usuario_logueado)
        val recibirUsernameS = intent.getStringExtra("par_usern")

        val btnCalculadora: Button = findViewById(R.id.btn_calculadora)
        val btnMenu: Button = findViewById(R.id.btn_Menu)

        txUsuario.text = recibirUsernameS.toString()

        btnCalculadora.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)

            startActivity(intent)
        }
        btnMenu.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}