package com.example.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class homectivity : AppCompatActivity() {
    private lateinit var profilhome: ImageView
    private lateinit var masalah1: ImageView
    private lateinit var masalah2: ImageView
    private lateinit var masalah3: ImageView
    private lateinit var masalah4: ImageView
    private lateinit var masalah5: ImageView
    private lateinit var masalah6: ImageView
    private lateinit var masalah7: ImageView
    private lateinit var masalah8: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homectivity)
        profilhome = findViewById(R.id.profilhome)
        masalah1 = findViewById(R.id.masalah1)
        masalah2 = findViewById(R.id.masalah2)
        masalah3 = findViewById(R.id.masalah3)
        masalah4 = findViewById(R.id.masalah4)
        masalah5 = findViewById(R.id.masalah5)
        masalah6 = findViewById(R.id.masalah6)
        masalah7 = findViewById(R.id.masalah7)
        masalah8 = findViewById(R.id.masalah8)



        btnprofilhome()
        btnmasalah1()
        btnmasalah2()
        btnmasalah3()
        btnmasalah4()
        btnmasalah5()
        btnmasalah6()
        btnmasalah7()
        btnmasalah8()

    }

    private fun btnprofilhome() {
        profilhome.setOnClickListener {
            startActivity(Intent(this, profilpertamaActivity::class.java))
        }
    }

    private fun btnmasalah1() {
        masalah1.setOnClickListener {
            startActivity(Intent(this, solusisatuActivity::class.java))
        }
    }

    private fun btnmasalah2() {
        masalah2.setOnClickListener {
            startActivity(Intent(this, solusiduaMainActivity::class.java))

        }
    }

    private fun btnmasalah3() {
        masalah3.setOnClickListener {
            startActivity(Intent(this, solusitigaMainActivity::class.java))
        }
    }
    private fun btnmasalah4() {
        masalah4.setOnClickListener {
            startActivity(Intent(this, solusiempatMainActivity::class.java))
        }
    }
    private fun btnmasalah5() {
        masalah5.setOnClickListener {
            startActivity(Intent(this, solusilimaMainActivity::class.java))
        }
    }
    private fun btnmasalah6() {
        masalah6.setOnClickListener {
            startActivity(Intent(this, solusienamMainActivity::class.java))
        }
    }
    private fun btnmasalah7() {
        masalah7.setOnClickListener {
            startActivity(Intent(this, solusitujuhMainActivity::class.java))
        }
    }
    private fun btnmasalah8() {
        masalah8.setOnClickListener {
            startActivity(Intent(this, solusidelapanMainActivity::class.java))
        }
    }
}






