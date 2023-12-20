package com.example.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class profilpertamaActivity : AppCompatActivity() {
    private lateinit var btneditprofil : Button
    private lateinit var btnlogout :Button
    private lateinit var backprofile : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profilpertama)

        btneditprofil = findViewById(R.id.btneditprofil)
        btnlogout = findViewById(R.id.btnlogout)
        backprofile = findViewById(R.id.backprofile)

        btnprofil()
        btnlog()
        btnbackprofil()

    }
    private fun btnprofil(){
        btneditprofil.setOnClickListener{
            startActivity(Intent(this,editprofileActivity::class.java))
        }
    }
    private fun btnlog(){
        btnlogout.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
    private fun btnbackprofil(){
        backprofile.setOnClickListener{
            startActivity(Intent(this,homectivity::class.java))
        }
    }
}