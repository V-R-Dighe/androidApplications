package com.example.findmyageapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val calculateAgeButton = findViewById<Button>(R.id.getAgeBut)
        calculateAgeButton.setOnClickListener{
            calculateAge()
        }
    }

    fun calculateAge(){

        val inputText = findViewById<EditText>(R.id.getDate)
        val birthYear = Integer.parseInt(inputText.text.toString())
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        val ageOfUser = currentYear - birthYear
        val textViewVar = findViewById<TextView>(R.id.showAge)
        textViewVar.text = "Hi, Your age is ${ageOfUser}"

    }
}