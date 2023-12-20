package com.example.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class editprofileActivity : AppCompatActivity() {
    private lateinit var backeditprofile: ImageView
    private lateinit var btnupdateprofil: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editprofile)
        backeditprofile = findViewById(R.id.backeditprofile)
        btnupdateprofil = findViewById(R.id.btnupdateprofil)

        btneditprofile()
        btnbackeditprofil()
    }
    private fun btneditprofile(){
        btnupdateprofil.setOnClickListener{
            startActivity(Intent(this,profilpertamaActivity::class.java))
        }
    }
    private fun btnbackeditprofil(){
        backeditprofile.setOnClickListener{
            startActivity(Intent(this,profilpertamaActivity::class.java))
        }
    }
}
