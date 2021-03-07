package com.example.cursokotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    // private val TAG = "MAIN_ACTIVITY"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

/*        // Lanzamos otra activity
        val intent = Intent(this, Activity2::class.java)

        // Send data to A2
        intent.putExtra("idusuario", 20)*/

        // Setting alarm clock
        val intent = Intent(AlarmClock.ACTION_SET_ALARM)
        intent.putExtra(AlarmClock.EXTRA_MESSAGE, "Esperta!")
        intent.putExtra(AlarmClock.EXTRA_HOUR, 5)
        intent.putExtra(AlarmClock.EXTRA_MINUTES, 30)

        // Start the other activity (another app activity or system activity)
        startActivity(intent)

        // Button Go to Activity 2
        val button = findViewById<Button>(R.id.iraA2)
        button.setOnClickListener{
            val intent = Intent(this, Activity2::class.java)
            // Create new activity
            startActivity(intent)
        }

    }


}