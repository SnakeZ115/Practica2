package com.example.practica2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView

class SpinnerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)

        var txtNumero1 = findViewById<EditText>(R.id.txtNumero1);
        var txtNumero2 = findViewById<EditText>(R.id.txtNumero2);
        var txtResultado = findViewById<TextView>(R.id.txtResultadoSpinner);
        var btnCalcular = findViewById<Button>(R.id.btnCalculo);
        var spinner = findViewById<Spinner>(R.id.spinner);

        val lista = arrayOf("Sumar", "Restar", "Multiplicar", "Dividir");
        val adaptador1 = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,lista);

        spinner.adapter = adaptador1;

        btnCalcular.setOnClickListener() {

            when(spinner.selectedItem.toString()) {

                "Sumar" -> txtResultado.text = "Resultado: ${txtNumero1.text.toString().toInt() + txtNumero1.text.toString().toInt()}";
                "Restar" -> txtResultado.text = "Resultado ${txtNumero1.text.toString().toInt() - txtNumero2.text.toString().toInt()}";
                "Multiplicar" -> txtResultado.text = "Rsultado: ${txtNumero1.text.toString().toInt() * txtNumero2.text.toString().toInt()}";
                "Dividir" -> txtResultado.text = "Resultado: ${txtNumero1.text.toString().toInt() / txtNumero1.text.toString().toInt()}";

            }

        }
    }

}