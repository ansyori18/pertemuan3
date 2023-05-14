package com.ansyori.pertemuan3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val coba : Button = findViewById(R.id.batal)
        coba.setOnClickListener { bersih() }
        val hitung : Button = findViewById(R.id.proses)
        hitung.setOnClickListener { proseshitung() }
    }

    private fun proseshitung() {
        val inttxt : EditText = findViewById(R.id.tinggi)
        val satu : String = inttxt.text.toString().trim()
        val inttxt1 : EditText = findViewById(R.id.berat)
        val dua : String = inttxt1.text.toString().trim()
        //(tinggi badan-100)-((tinggi badan-100) x 10%)
        val result1 : Double = (satu.toDouble()-100)- ((satu.toDouble()-100)*0.1)
        val resultText: TextView = findViewById(R.id.result)
        resultText.text = result1.toString()

    }

    private fun bersih() {
        val inttxt : EditText = findViewById(R.id.tinggi)
        val inttxt1 : EditText = findViewById(R.id.berat)
        val resultText: TextView = findViewById(R.id.result)
        inttxt.setText("")
        inttxt1.setText("")
        resultText.text = "0"


    }
}


