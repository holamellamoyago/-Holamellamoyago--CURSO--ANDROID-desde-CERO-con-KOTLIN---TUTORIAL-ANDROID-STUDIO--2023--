package com.example.cursokotlinbasico2.firstApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.cursokotlinbasico2.R
import com.example.cursokotlinbasico2.imccalculator.ImcCalculatorActivity

class CurriculumActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_curriculum)

        val btnsaludApp = findViewById<Button>(R.id.btnsaludApp)
        val btnfirstApp = findViewById<Button>(R.id.btnfirstApp)
        val btnIMCApp = findViewById<Button>(R.id.btnIMCApp)

        btnsaludApp.setOnClickListener {navigateToSaludApp()}
        btnfirstApp.setOnClickListener{navigateToFirstApp()}
        btnIMCApp.setOnClickListener{navigateToIMCApp()}

    }

    private fun navigateToIMCApp() {
        val intentIMCApp = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intentIMCApp)
    }

    fun navigateToFirstApp(){
        val intentFirstApp = Intent(this, FirstAppActivity::class.java)

        startActivity(intentFirstApp)
    }

    fun navigateToSaludApp() {
        val intentSaludApp = Intent(this, ResoultActivity::class.java)

        startActivity(intentSaludApp)
    }

}