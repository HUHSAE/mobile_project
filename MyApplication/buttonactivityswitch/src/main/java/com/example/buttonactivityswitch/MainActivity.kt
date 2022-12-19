package com.example.buttonactivityswitch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.buttonactivityswitch.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStart1.setOnClickListener{
            val intent: Intent = Intent(this, SubActivity::class.java)
            startActivity(intent)
        }

        binding.btnStart2.setOnClickListener{

        }

        binding.btnStart3.setOnClickListener{

        }

        binding.btnStart4.setOnClickListener{

        }
    }
}