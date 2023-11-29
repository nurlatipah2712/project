package com.example.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterActivity : AppCompatActivity() {
    private lateinit var btn2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        // supportActionBar?.hide()
        btn2 = findViewById(R.id.btnLogin)
        btn2.setOnClickListener{
            startActivity(Intent(this, LoginActivity::class.java))
        }



    }
//    private fun btncreatnow() {
//        button2.setOnClickListener{
//            startActivity(Intent(this, LoginActivity::class.java))
//        }
//    }

}


