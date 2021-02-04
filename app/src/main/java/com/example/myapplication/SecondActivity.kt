package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val button = findViewById<Button>(R.id.back_button)
        button.setOnClickListener {
            val intent= Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val myButton=findViewById<ImageButton>(R.id.resourceButton)
        myButton.setOnClickListener {
            val intent=Intent(this, ResourceActivity::class.java)
            startActivity(intent)
        }
    }
}