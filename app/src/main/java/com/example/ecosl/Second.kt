package com.example.ecosl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val buttt1= findViewById<Button>(R.id.button)
        buttt1.setOnClickListener {
            val Intent = Intent(this, signature::class.java)
            startActivity(Intent)
        }

        val buttt2= findViewById<Button>(R.id.button3)
        buttt2.setOnClickListener {
            val Intent = Intent(this, signature::class.java)
            startActivity(Intent)
        }

        val buttt3= findViewById<Button>(R.id.button2)
        buttt3.setOnClickListener {
            val Intent = Intent(this, signature::class.java)
            startActivity(Intent)
        }
    }
}