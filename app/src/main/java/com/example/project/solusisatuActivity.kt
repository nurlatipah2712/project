package com.example.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class solusisatuActivity : AppCompatActivity() {
    private lateinit var backsolusi : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_solusisatu)
        backsolusi = findViewById(R.id.backsolusi)

        btnbacksolusi()
    }

        private fun btnbacksolusi(){
            backsolusi.setOnClickListener{
                startActivity(Intent(this,homectivity::class.java))
            }
        }
    }