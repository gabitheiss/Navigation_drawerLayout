package com.example.navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class TesteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teste)
        //button back
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp() : Boolean{
        finish()
        return super.onSupportNavigateUp()
    }

}