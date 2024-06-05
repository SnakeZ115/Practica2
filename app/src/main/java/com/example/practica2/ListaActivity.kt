package com.example.practica2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView

class ListaActivity : AppCompatActivity() {

    private lateinit var txtDatos: TextView;
    private lateinit var lista: ListView;
    private val carreras = arrayOf("Biotécnología", "Tecnologías de la información", "Mecatrónica", "Energía",
        "Logística y Transporte", "Terapia Física", "Tecnología Ambiental", "Biomédica", "Animación", "Nanotecnología",
        "Administración");
    private val cantidadAlumnos = arrayOf(100, 200, 300, 400, 500, 600, 700, 800, 900, 1000, 1100)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)

        txtDatos = findViewById(R.id.txtDatos);
        lista = findViewById(R.id.Lista1);

        val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, carreras);
        lista.adapter = adaptador;

        lista.setOnItemClickListener { adapterView, view, i, l ->
            txtDatos.text = "${cantidadAlumnos[i]} Alumnos"
        }

    }
}