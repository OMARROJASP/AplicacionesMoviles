package com.example.semana41

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
//crear una constante
const val EXTRA_MESS = "com.example.semana41"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessage(view: View){
        val editText = findViewById<EditText>(R.id.etText)
        val message = editText.text.toString()
        var intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESS, message)
        }
   startActivity(intent)
    }
}