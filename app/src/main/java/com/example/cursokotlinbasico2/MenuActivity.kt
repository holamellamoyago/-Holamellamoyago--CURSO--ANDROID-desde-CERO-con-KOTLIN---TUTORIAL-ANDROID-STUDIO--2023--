package com.example.cursokotlinbasico2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.cursokotlinbasico2.firstApp.CurriculumActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnsaludApp = findViewById<Button>(R.id.btnsaludApp)

        btnsaludApp.setOnClickListener{
            val intent = Intent(this, CurriculumActivity::class.java)
            startActivity(intent)
        }
    }
}