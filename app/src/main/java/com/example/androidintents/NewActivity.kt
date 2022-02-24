package com.example.androidintents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class NewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)

        val backButton = findViewById<Button>(R.id.btnBack)

        backButton.setOnClickListener{
            finish()
        }
    }
}

