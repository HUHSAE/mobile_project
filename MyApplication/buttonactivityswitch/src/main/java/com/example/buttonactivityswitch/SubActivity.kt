package com.example.buttonactivityswitch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.buttonactivityswitch.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {
    lateinit var binding: ActivitySubBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySubBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBack1.setOnClickListener {
            finish()
        }

        binding.btnBack2.setOnClickListener {

        }

        binding.btnBack3.setOnClickListener {

        }
    }
}