package com.example.mytestingapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    // ErrorNullPointer
    // private var btnSetValue: Button? = null

    private lateinit var tvText: TextView
    private lateinit var btnSetValue: Button

    private var names = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvText = findViewById(R.id.tvText)
        btnSetValue = findViewById(R.id.btnSetValue)

        // btnSetValue!!.setOnClickListener(this)
        btnSetValue.setOnClickListener(this)

        names.add("Narenda Wicaksono")
        names.add("Kevin")
        names.add("Yoza")
    }

    @SuppressLint("SetTextI18n")
    override fun onClick(v: View?) {
        if (v?.id == R.id.btnSetValue) {
            Log.d("MainActivity", names.toString())
            val name = StringBuilder()
            // Error Index 3 out of bounds for length 3
            for (i in 0..2) {
                name.append(names[i]).append("\n")
            }
            tvText.text = name.toString()
        }
    }
}