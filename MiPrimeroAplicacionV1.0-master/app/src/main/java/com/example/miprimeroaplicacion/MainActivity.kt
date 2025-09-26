package com.example.miprimeroaplicacion


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val edUsername: EditText = findViewById(R.id.ed_username)
        val edPassw: EditText = findViewById(R.id.ed_passwd)
        val btnLogin: Button = findViewById(R.id.btn_login)


        var defUsername = "Vicente"
        var defPasswd = "vicho123"


        val btnApi: Button = findViewById(R.id.btn_api)


        btnLogin.setOnClickListener {


            if(edUsername.text.toString() == defUsername.toString() && edPassw.text.toString() == defPasswd.toString()){

                val nuevaVentana = Intent(this, MainActivity5::class.java)

                nuevaVentana.putExtra("par_usern", edUsername.text.toString())

                startActivity(nuevaVentana)

                Toast.makeText(this, "Pasaste mi loco", Toast.LENGTH_SHORT).show()

            }else{
                Toast.makeText(this, "Error: Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show()

            }

        }


        btnApi.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }






        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
