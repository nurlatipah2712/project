package com.example.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    private lateinit var btn2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        // supportActionBar?.hide()
        btn2 = findViewById(R.id.button2)
        btn2.setOnClickListener{
            startActivity(Intent(this, homectivity::class.java))
        }



    }
    }
