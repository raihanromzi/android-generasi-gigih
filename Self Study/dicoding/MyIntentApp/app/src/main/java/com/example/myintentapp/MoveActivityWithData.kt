package com.example.myintentapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MoveActivityWithData : AppCompatActivity() {
    private lateinit var tvDataReceived: TextView

    // Object inside class
    companion object {
        const val EXTRA_AGE = "extra_age"
        const val EXTRA_NAME = "extra_name"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_move_with_data)

        tvDataReceived = findViewById<TextView>(R.id.tvDataReceived)

        // Take the data from intent
        val name = intent.getStringExtra(EXTRA_NAME)
        val age = intent.getIntExtra(EXTRA_AGE, 0)

        // Assign new data to tvDataReceived

        val text = "Name : $name, Your Age : $age"
        tvDataReceived.text = text
    }
}