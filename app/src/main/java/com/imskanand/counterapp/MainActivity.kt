package com.imskanand.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var timesClicked = 0
        val textView = findViewById<TextView>(R.id.textView)
        val btnClickMe = findViewById<Button>(R.id.myCounter)
        btnClickMe.setOnClickListener {
            timesClicked += 1
            btnClickMe.text="Clicked!"
            textView.text = timesClicked.toString()
            Toast.makeText(this, "Hello, Shubham Here!",Toast.LENGTH_LONG).show()
        }
    }
}