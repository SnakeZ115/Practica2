package com.example.practica2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnRadios = findViewById<Button>(R.id.btnRadios);
        val btnCheckbox = findViewById<Button>(R.id.btnCheckbox);
        val btnSpinner = findViewById<Button>(R.id.btnSpinner);
        val btnLista = findViewById<Button>(R.id.btnLista);
        val btnNoti = findViewById<Button>(R.id.btnNotificaciones);
        val btnShared = findViewById<Button>(R.id.btnSharedPreference);

        btnRadios.setOnClickListener() {
            val intent = Intent(this, RadiosActivity::class.java);
            startActivity(intent);
        }

        btnCheckbox.setOnClickListener() {
            val intent = Intent(this, CheckBoxActivity::class.java);
            startActivity(intent);
        }

        btnSpinner.setOnClickListener() {
            val intent = Intent(this, SpinnerActivity::class.java);
            startActivity(intent);
        }

        btnLista.setOnClickListener() {
            val intent = Intent(this, ListaActivity::class.java);
            startActivity(intent);
        }

        btnNoti.setOnClickListener() {
            val intent = Intent(this, NotificacionesActivity::class.java);
            startActivity(intent);
        }

        btnShared.setOnClickListener() {
            val intent = Intent(this, SharedPreferenceActivity::class.java);
            startActivity(intent);
        }
    }
}