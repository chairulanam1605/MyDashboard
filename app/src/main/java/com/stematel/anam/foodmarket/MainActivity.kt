package com.stematel.anam.foodmarket

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)

        button.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.button ->{
                val intentBiasa = Intent(this@MainActivity, Home::class.java)
                startActivity(intentBiasa)
            }
        }
    }
}