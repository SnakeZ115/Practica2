package com.example.practica2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class NotificacionesActivity : AppCompatActivity() {

    private lateinit var txtNumeroAleatorio: EditText;
    private var numero = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notificaciones)

        val btnValidar = findViewById<Button>(R.id.btnValidar);

        txtNumeroAleatorio = findViewById(R.id.txtNumeroAleatorio);
        numero = (Math.random() * 100001).toInt();

        Toast.makeText(this, "Número a recordar: ${numero}", Toast.LENGTH_LONG).show();

        btnValidar.setOnClickListener() {
            validar();
        }
    }

    fun validar() {

        if(numero == txtNumeroAleatorio.text.toString().toInt()) {
            Toast.makeText(this, "Muy bien, recordaste el número!!", Toast.LENGTH_SHORT).show()
        }
        else {
            Toast.makeText(this, "Lo siento pero no es el número correcto", Toast.LENGTH_SHORT).show()
        }

    }

}