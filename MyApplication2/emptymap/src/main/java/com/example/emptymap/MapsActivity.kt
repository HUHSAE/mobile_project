package com.example.emptymap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.emptymap.databinding.ActivityMainBinding
import com.example.emptymap.databinding.ActivityMapsBinding

class MapsActivity : AppCompatActivity() {
    lateinit var binding: ActivityMapsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}