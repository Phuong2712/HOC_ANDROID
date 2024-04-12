package com.example.listentomusic.UI

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.listentomusic.databinding.ActivityDangKyBinding

class DangKyActivity : AppCompatActivity() {
    private lateinit var binding : ActivityDangKyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityDangKyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogIn.setOnClickListener {
            if(binding.etHoTen.equals("") || binding.etEmail.equals("") ||
                binding.etPassWord.equals("") || binding.etEnterPassWord.equals("")){
                Toast.makeText(
                    this@DangKyActivity,
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