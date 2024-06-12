package com.example.ecosl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btt1= findViewById<Button>(R.id.button4)
        btt1.setOnClickListener {
            val Intent = Intent(this, Home::class.java)
            startActivity(Intent)
        }
    }
}