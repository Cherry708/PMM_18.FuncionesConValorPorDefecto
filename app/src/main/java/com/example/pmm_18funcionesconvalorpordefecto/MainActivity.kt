package com.example.pmm_18funcionesconvalorpordefecto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etString = findViewById<EditText>(R.id.etString10)
        val tvResult = findViewById<TextView>(R.id.tvResult10)
        val btnGet = findViewById<Button>(R.id.btnGet10)

        btnGet.setOnClickListener {
            val userString = etString.text.toString()

            val result = getResult(userString)
            val resultSpacer = makeSpacer(userString)
            tvResult.text = result.plus("\n"+resultSpacer)
        }

    }

    fun getResult(string:String):String{
        return string
    }

    fun makeSpacer(string:String, spacer:String="* "):String{
        return spacer.repeat(string.length)
    }
}