package com.example.ecosl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bt1= findViewById<Button>(R.id.button6)
        bt1.setOnClickListener {
            val Intent = Intent(this, login::class.java)
            startActivity(Intent)
        }



    }
}