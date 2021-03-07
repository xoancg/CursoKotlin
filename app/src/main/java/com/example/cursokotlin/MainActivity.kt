package com.example.cursokotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    // private val TAG = "MAIN_ACTIVITY"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

/*        // Lanzamos otra activity
        val intent = Intent(this, Activity2::class.java)
        // Agora pasamos á nova activity
        startActivity(intent)*/

        val button = findViewById<Button>(R.id.iraA2)
        button.setOnClickListener{
            val intent = Intent(this, Activity2::class.java)
            // Create new activity
            startActivity(intent)
        }

    }


}