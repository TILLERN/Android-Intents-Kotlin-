package com.example.androidintents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOpenNewActivity.setOnClickListener{
            Intent(this, NewActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}