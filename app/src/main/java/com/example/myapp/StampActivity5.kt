package com.example.myapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.Button
import android.widget.TextView

class StampActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stamp5)

        //버튼 클릭시 링크된 사이트로 이동
        val Site_button = findViewById<Button>(R.id.Site_button1)
        Site_button.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://hangang.seoul.go.kr/archives/46758"))
            startActivity(intent)
        }

        val text=findViewById<TextView>(R.id.textView1)
        text.setMovementMethod(ScrollingMovementMethod())
    }
}