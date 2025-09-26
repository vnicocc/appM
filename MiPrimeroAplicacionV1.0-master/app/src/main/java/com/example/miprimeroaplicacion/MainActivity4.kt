package com.example.miprimeroaplicacion

import android.os.Bundle
import android.widget.Button
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.proyectobase.ApiRegionComuna.CargarRegionComunaAPI

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main4)

        val spRegion: Spinner = findViewById(R.id.sp_region)
        val spComuna: Spinner = findViewById(R.id.sp_comuna)
        val btnHacerAlgo: Button = findViewById(R.id.btn_boton)

        ///CargarAlumnosAPI.cargarAlumnos(this, spRegion)

        CargarRegionComunaAPI.cargarRegionComuna(this, spRegion)
        CargarRegionComunaAPI.cargarRegionComuna2(this, spComuna)



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}