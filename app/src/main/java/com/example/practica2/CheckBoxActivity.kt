package com.example.practica2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView

class CheckBoxActivity : AppCompatActivity() {

    private lateinit var checkbox: CheckBox;
    private lateinit var checkbox2: CheckBox;
    private lateinit var checkbox3: CheckBox;
    private lateinit var checkbox4: CheckBox;
    private lateinit var checkbox5: CheckBox;
    private lateinit var txtRes: TextView;


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box)

        checkbox = findViewById<CheckBox>(R.id.checkBox);
        checkbox2 = findViewById<CheckBox>(R.id.checkBox2);
        checkbox3 = findViewById<CheckBox>(R.id.checkBox3);
        checkbox4 = findViewById<CheckBox>(R.id.checkBox4);
        checkbox5 = findViewById<CheckBox>(R.id.checkBox5);
        txtRes = findViewById<TextView>(R.id.txtRes);

        val btnMostar = findViewById<Button>(R.id.btnMostrar);

        btnMostar.setOnClickListener() {
            mostrar();
        }
    }

    fun mostrar() {

        var msg = " ";

        if(checkbox.isChecked) {
            msg += "${checkbox.text.toString()}, ";
        }
        if(checkbox2.isChecked) {
            msg += "${checkbox2.text.toString()}, ";
        }
        if(checkbox3.isChecked) {
            msg += "${checkbox3.text.toString()}, ";
        }
        if(checkbox4.isChecked) {
            msg += "${checkbox4.text.toString()}, ";
        }
        if(checkbox5.isChecked) {
            msg += "${checkbox5.text.toString()}, ";
        }

        txtRes.text = "Tus pasatiempos son: ${msg}";
    }
}