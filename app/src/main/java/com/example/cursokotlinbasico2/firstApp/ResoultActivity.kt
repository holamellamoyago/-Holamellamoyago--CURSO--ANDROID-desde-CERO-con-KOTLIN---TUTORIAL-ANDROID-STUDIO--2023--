package com.example.cursokotlinbasico2.firstApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.cursokotlinbasico2.R

class ResoultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resoult)
        val tvresoult = findViewById<TextView>(R.id.tvResoult)
        val name: String = intent.extras?.getString("EXTRA_NAME").orEmpty()
        tvresoult.text = "Hola $name"


    }
}