package com.example.ecosl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val bttt1= findViewById<ImageView>(R.id.imageButton4)
        bttt1.setOnClickListener {
            val Intent = Intent(this, MainActivity::class.java)
            startActivity(Intent)
        }
        val bttt2= findViewById<ImageView>(R.id.imageButton)
        bttt2.setOnClickListener {
            val Intent = Intent(this, scroll::class.java)
            startActivity(Intent)
        }

        val bttt3= findViewById<Button>(R.id.button)
        bttt3.setOnClickListener {
            val Intent = Intent(this, Second::class.java)
            startActivity(Intent)
        }

        val bttt4= findViewById<Button>(R.id.button3)
        bttt4.setOnClickListener {
            val Intent = Intent(this, Second::class.java)
            startActivity(Intent)
        }

        val bttt5= findViewById<Button>(R.id.button2)
        bttt5.setOnClickListener {
            val Intent = Intent(this, Second::class.java)
            startActivity(Intent)
        }
    }
}