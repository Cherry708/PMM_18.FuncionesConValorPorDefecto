package com.example.pmm_18funcionesconvalorpordefecto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.zip.Adler32

class ProblemaPropuesto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema_propuesto)

        val etNumber0 = findViewById<EditText>(R.id.etNumber20)
        val etNumber1 = findViewById<EditText>(R.id.etNumber21)
        val tvResult = findViewById<TextView>(R.id.tvResult20)
        val btnCalculate = findViewById<Button>(R.id.btnCalculate20)

        btnCalculate.setOnClickListener {
            tvResult.text = addition(etNumber0.text.toString().toInt(), etNumber1.text.toString().toInt()).toString()
        }

    }

    fun addition(number0:Int,number1:Int, number2:Int = 5, number3:Int = 5, number4:Int = 5):Int{
        return number0+number1+number2+number3+number4
    }
}