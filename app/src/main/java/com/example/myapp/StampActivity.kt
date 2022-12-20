package com.example.myapp

import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import android.media.Image
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapp.databinding.ActivityStampBinding
import com.journeyapps.barcodescanner.ScanContract
import com.journeyapps.barcodescanner.ScanIntentResult
import com.journeyapps.barcodescanner.ScanOptions
import android.util.Log
import androidx.core.content.ContextCompat.startActivity


class StampActivity:AppCompatActivity(){
    var stamp_value=0

    lateinit var txtResult:TextView
    lateinit var imageButton : ImageButton
    lateinit var imageButton2 : ImageButton
    lateinit var imageButton3 : ImageButton
    lateinit var imageButton4 : ImageButton
    lateinit var imageButton5 : ImageButton
    lateinit var imageButton6 : ImageButton
    var distinct1=0
    var distinct2=0
    var distinct3=0
    var distinct4=0
    var distinct5=0
    var distinct6=0

    lateinit var button: Button


    // 스캐너 설정
    val barcodeLauncher = registerForActivityResult(
        ScanContract()
    ) { result: ScanIntentResult ->
        // result : 스캔된 결과

        // 내용이 없다면
        if (result.contents == null) {
            Toast.makeText(this, "Cancelled", Toast.LENGTH_LONG).show()
        }
        else if(result.contents=="https://www.nseoultower.co.kr:8501" && distinct1==0){ // 내용이 있다면 1번

            // 1. Toast 메시지 출력.
            Toast.makeText(
                this,
                "Scanned: " + result.contents,
                Toast.LENGTH_LONG
            ).show()

            // 2. 결과 값 TextView에 출력.
            stamp_value++ // 값 추가
            txtResult.text = "SUCCESS!"
            imageButton.setImageResource(R.drawable.after_stamp)
            distinct1=1
            if(stamp_value==6){
                button.isEnabled=true
                button.setBackgroundResource(R.color.main)
            }
        }
        else if(result.contents=="https://www.royalpalace.go.kr"&& distinct2==0){ // 내용이 있다면 2번

            // 1. Toast 메시지 출력.
            Toast.makeText(
                this,
                "Scanned: " + result.contents,
                Toast.LENGTH_LONG
            ).show()

            // 2. 결과 값 TextView에 출력.
            stamp_value++ // 값 추가
            txtResult.text = "SUCCESS!"
            imageButton2.setImageResource(R.drawable.after_stamp)
            distinct2=1
            if(stamp_value==6){
                button.isEnabled=true
                button.setBackgroundResource(R.color.main)
            }
        }
        else if(result.contents=="https://www.museum.go.kr/site/main/home"&& distinct3==0){ // 내용이 있다면 3번

            // 1. Toast 메시지 출력.
            Toast.makeText(
                this,
                "Scanned: " + result.contents,
                Toast.LENGTH_LONG
            ).show()

            // 2. 결과 값 TextView에 출력.
            stamp_value++ // 값 추가
            txtResult.text = "SUCCESS!"
            imageButton3.setImageResource(R.drawable.after_stamp)
            distinct3=1
            if(stamp_value==6){
                button.isEnabled=true
                button.setBackgroundResource(R.color.main)
            }
        }
        else if(result.contents=="https://ddp.or.kr/?menuno=228"&& distinct4==0){ // 내용이 있다면 4번

            // 1. Toast 메시지 출력.
            Toast.makeText(
                this,
                "Scanned: " + result.contents,
                Toast.LENGTH_LONG
            ).show()

            // 2. 결과 값 TextView에 출력.
            stamp_value++ // 값 추가
            txtResult.text = "SUCCESS!"
            imageButton4.setImageResource(R.drawable.after_stamp)
            distinct4=1
            if(stamp_value==6){
                button.isEnabled=true
                button.setBackgroundResource(R.color.main)
            }
        }
        else if(result.contents=="https://hangang.seoul.go.kr/archives/46758"&& distinct5==0){ // 내용이 있다면 5번

            // 1. Toast 메시지 출력.
            Toast.makeText(
                this,
                "Scanned: " + result.contents,
                Toast.LENGTH_LONG
            ).show()

            // 2. 결과 값 TextView에 출력.
            stamp_value++ // 값 추가
            txtResult.text = "SUCCESS!"
            imageButton5.setImageResource(R.drawable.after_stamp)
            distinct5=1
            if(stamp_value==6){
                button.isEnabled=true
                button.setBackgroundResource(R.color.main)
            }
        }
        else if(result.contents=="https://www.gjmarket.org"&& distinct6==0){ // 내용이 있다면 6번

            // 1. Toast 메시지 출력.
            Toast.makeText(
                this,
                "Scanned: " + result.contents,
                Toast.LENGTH_LONG
            ).show()

            // 2. 결과 값 TextView에 출력.
            stamp_value++ // 값 추가
            txtResult.text = "SUCCESS!"
            imageButton6.setImageResource(R.drawable.after_stamp)
            distinct6=1
            if(stamp_value==6){
                button.isEnabled=true
                button.setBackgroundResource(R.color.main)
            }
        }
    }

    fun onScanButtonClicked() {
        // Launch ( SCAN 실행 )
        barcodeLauncher.launch(ScanOptions())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding= ActivityStampBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.applicationButton.isEnabled=false// 버튼 비활성화


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

        txtResult = findViewById(R.id.txtResult)
        imageButton=findViewById(R.id.imageButton1)
        imageButton2=findViewById(R.id.imageButton2)
        imageButton3=findViewById(R.id.imageButton3)
        imageButton4=findViewById(R.id.imageButton4)
        imageButton5=findViewById(R.id.imageButton5)
        imageButton6=findViewById(R.id.imageButton6)
        button=findViewById(R.id.application_button)

        binding.btnScan.setOnClickListener{
            onScanButtonClicked()
        } // 바코드 인식기로 넘어가기

        binding.applicationButton.setOnClickListener{
            val intent = Intent(this,ApplicationActivity::class.java)
            startActivity(intent)
        }

    }

}