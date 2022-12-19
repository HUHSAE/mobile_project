package com.example.myapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.myapp.databinding.ActivityStampBinding



class StampActivity:AppCompatActivity(){
    val stamp_value=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding= ActivityStampBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.applicationButton.setEnabled(false) // 버튼 비활성화

        binding.imageButton1.setOnClickListener{
            val intent = Intent(this, StampActivity1::class.java)
            startActivity(intent)
        }

        binding.imageButton2.setOnClickListener{
            val intent = Intent(this, StampActivity2::class.java)
            startActivity(intent)
        }

        binding.imageButton3.setOnClickListener{
            val intent = Intent(this, StampActivity3::class.java)
            startActivity(intent)
        }

        binding.imageButton4.setOnClickListener{
            val intent = Intent(this, StampActivity4::class.java)
            startActivity(intent)
        }

        binding.imageButton5.setOnClickListener{
            val intent = Intent(this, StampActivity5::class.java)
            startActivity(intent)
        }

        binding.imageButton6.setOnClickListener{
            val intent = Intent(this, StampActivity6::class.java)
            startActivity(intent)
        }


        binding.btnScan.setOnClickListener{
            //이 부분 아직 덜 구현했음
        } // 바코드 인식기로 넘어가기

        if(stamp_value==6){
            binding.applicationButton.setEnabled(true)
        } // 스탬프 다 모을시 버튼 활성화

        binding.applicationButton.setOnClickListener{
            val intent = Intent(this,ApplicationActivity::class.java)
            startActivity(intent)
        }

    }

}