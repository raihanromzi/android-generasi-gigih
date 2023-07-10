package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    // Variable initialize
    private lateinit var ed_year_of_birth: EditText
    private lateinit var tv_title: TextView
    private lateinit var btn_find_generation: Button

    // initialize the essential components of your activity
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // define the layout for the activity's user interface
        setContentView(R.layout.activity_main)

        // Logic
        ed_year_of_birth = findViewById<EditText>(R.id.ed_year_of_birth)
        tv_title = findViewById<TextView>(R.id.tv_title)
        btn_find_generation = findViewById<Button>(R.id.btn_find_generation)

        btn_find_generation.setOnClickListener { // interface -> View.onClickLister
            val result = when (ed_year_of_birth.text.toString().toInt()) {
                in 1946..1964 -> "Baby Boomer"
                in 1965..1980 -> "Generation X"
                in 1981..1996 -> "Millennial"
                in 1997..2012 -> "Generation Z"
                else -> "Unknown"
            }
            tv_title.text = "Your Generation is $result"
        }

    }

    // activity becomes visible to the user
    override fun onStart() {
        super.onStart()
    }

    // just before the activity starts interacting with the user.
    // At this point, the activity is at the top of the activity stack, and captures all user input
    // Most of an app’s core functionality is implemented in the onResume() method.
    override fun onResume() {
        super.onResume()
    }

    // when the activity loses focus and enters a Paused state
    // when user tap back, or recent button

    // means your activity is still partially visible,
    // but most often is an indication that the user is leaving the activity,
    // and the activity will soon enter the Stopped or Resumed state.

    // An activity in the Paused state may continue to update the UI

    // You should not use onPause() to save application or user data,
    // make network calls, or execute database transactions
    override fun onPause() {
        super.onPause()
    }

    // activity is no longer visible to the user
    // activity is being destroyed, a new activity is starting,
    // or an existing activity is entering a Resumed state and is covering the stopped activity
    override fun onStop() {
        super.onStop()
    }

    // when an activity in the Stopped state is about to restart
    // restores the state of the activity from the time that it was stopped
    override fun onRestart() {
        super.onRestart()
    }

    // system invokes this callback before an activity is destroyed.
    override fun onDestroy() {
        super.onDestroy()
    }
}