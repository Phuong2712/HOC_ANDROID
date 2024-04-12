package com.example.listentomusic.UI

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.listentomusic.R
import com.example.listentomusic.databinding.ActivityListenBinding

class ListenActivity : AppCompatActivity() {
    private lateinit var binding : ActivityListenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityListenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // đổi trái tym
        binding.fabHeart.setOnClickListener {
            binding.fabHeart.setImageResource(R.drawable.ic_heart_click)


        }

        // đổi nút pase

    }
}