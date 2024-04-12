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

        binding.tvDangNhap.setOnClickListener{
            val intent = Intent(this, DangKyActivity::class.java)
            startActivity(intent)
        }

        binding.btnLogIn.setOnClickListener {
            val email = binding.etEmail.text.toString()
            val password = binding.etPassWord.text.toString()
            val hoten = binding.etHoTen.text.toString()
            val nhapLai = binding.etEnterPassWord.text.toString()

            if(email.isEmpty() || password.isEmpty() ||
                hoten.isEmpty() || nhapLai.isEmpty()){
                Toast.makeText(
                    this@DangKyActivity,
                    "Yêu cầu nhập đầy đủ thông tin",
                    Toast.LENGTH_LONG
                ).show()
            }
            else {
                // chuyển hướng
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }


        }
    }
}