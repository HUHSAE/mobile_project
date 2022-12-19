package com.example.myapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val moveButton = findViewById<Button>(R.id.button)
        moveButton.setOnClickListener{
            val intent = Intent(this, StampActivity::class.java)
            startActivity(intent)
        }

        val moveButton1 = findViewById<Button>(R.id.button1)
        moveButton1.setOnClickListener{
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://papago.naver.com/"))
            startActivity(intent)
        }
    }
}