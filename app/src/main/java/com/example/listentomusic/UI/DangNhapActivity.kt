package com.example.listentomusic.UI

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.listentomusic.R
import com.example.listentomusic.databinding.ActivityDangNhapBinding

class DangNhapActivity : AppCompatActivity() {
    private lateinit var binding : ActivityDangNhapBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityDangNhapBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvDangKy.setOnClickListener{
            val intent = Intent(this, DangKyActivity::class.java)
            startActivity(intent)
        }

        binding.btnLogIn.setOnClickListener{
            if(binding.etEmail.equals("") || binding.etPassWord.equals("")){
                Toast.makeText(
                    this@DangNhapActivity,
                    "Yêu cầu nhập đầy đủ thông tin để sử dụng dịch vụ của chúng tôi",
                    Toast.LENGTH_LONG
                ).show()
            }

            // chuyển hướng
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}