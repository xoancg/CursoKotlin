package com.example.cursokotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class Activity2 : AppCompatActivity() {
    // TAG para monitorizar o proceso
    private val TAG = "ACTIVITY2"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        // Receive data sent from Main Activity
        val extra = intent.extras!!
        val user = extra.get("idusuario")
        // Display data received on console
        Log.d(TAG,user.toString())

        // Botón Main Activity
        val button = findViewById<Button>(R.id.iraMainA)
        button.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            // Close this activity and recover las
            finish()
        }

    }
}