package com.example.listentomusic.UI

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.listentomusic.databinding.ActivityPersonBinding
class PersonActivity : AppCompatActivity() {
    private lateinit var binding : ActivityPersonBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityPersonBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnDangNhap.setOnClickListener {
            val intent = Intent(this, DangNhapActivity::class.java)
            startActivity(intent)
        }

        binding.btnDangKy.setOnClickListener {
            val intent = Intent(this, DangKyActivity::class.java)
            startActivity(intent)
        }
    }
}