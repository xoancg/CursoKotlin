package com.example.cursokotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val button = findViewById<Button>(R.id.iraMainA)
        button.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            // Close this activity and recover las
            finish()
        }

    }
}