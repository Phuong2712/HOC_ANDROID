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
            val email = binding.etEmail.text.toString()
            val password = binding.etPassWord.text.toString()

            if(email.isEmpty() || password.isEmpty()){
                Toast.makeText(
                    this@DangNhapActivity,
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