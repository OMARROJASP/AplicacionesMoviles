package com.example.semana41

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)


        val message = intent.getStringExtra(EXTRA_MESS)
        val textview = findViewById<TextView>(R.id.tvFinalText).apply{
            text = message
        }
    }
}