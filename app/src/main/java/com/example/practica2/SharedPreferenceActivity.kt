package com.example.practica2

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SharedPreferenceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preference)

        val txtEmail = findViewById<EditText>(R.id.txtEmail);
        val btnGuardar = findViewById<Button>(R.id.btnGuardar);

        val preferencias = getSharedPreferences("datos", Context.MODE_PRIVATE);

        txtEmail.setText(preferencias.getString("email", ""));

        btnGuardar.setOnClickListener() {
            val editor = preferencias.edit();
            editor.putString("email", txtEmail.text.toString());
            editor.commit();
        }

    }
}