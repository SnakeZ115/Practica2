package com.example.practica2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class RadiosActivity : AppCompatActivity() {

    private lateinit var txtResultado: TextView;
    private lateinit var txtNum1: EditText;
    private lateinit var txtNum2: EditText;
    private lateinit var radioSumar: RadioButton;
    private lateinit var radioRestar: RadioButton;

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radios)

        txtResultado = findViewById<TextView>(R.id.txtResultado);
        txtNum1 = findViewById<EditText>(R.id.txtNum1);
        txtNum2 = findViewById<EditText>(R.id.txtNum2);
        radioSumar = findViewById<RadioButton>(R.id.radioSuma);
        radioRestar = findViewById<RadioButton>(R.id.radioRestar);

        var btnCalcular = findViewById<Button>(R.id.btnCalcular);

        btnCalcular.setOnClickListener() {
            calcular();
        }

    }

    fun calcular() {

        if(txtNum1.text.toString().isEmpty() || txtNum2.text.toString().isEmpty()) {
            txtResultado.text = "No hay numeros en alguna de las cajas de texto";
        }

        else {

            if(radioSumar.isChecked) {
                txtResultado.text = "Resultado: ${ txtNum1.text.toString().toInt() + txtNum2.text.toString().toInt() }";
            }

            if(radioRestar.isChecked) {
                txtResultado.text = "Resultado: ${ txtNum1.text.toString().toInt() - txtNum2.text.toString().toInt() }";
            }

        }

    }
}