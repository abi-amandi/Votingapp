package com.example.ecosl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class signature : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signature)

        val butttt1= findViewById<Button>(R.id.button5)

        butttt1.setOnClickListener {
            val Intent = Intent(this, Home ::class.java)
            startActivity(Intent)
            voted()
        }
    }

    fun voted(){
        Toast.makeText(this, "VOTED SUCCESSFULLY", Toast.LENGTH_LONG).show()
    }
}