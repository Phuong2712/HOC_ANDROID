package com.example.listentomusic

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.listentomusic.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        bottomNavigationView = binding.narView
        bottomNavigationView.inflateMenu(R.menu.menu_navigation)

        bottomNavigationView.setOnNavigationItemSelectedListener {
            menuItem -> when(menuItem.itemId){
                R.id.menu_home ->{

                    true
                }
                R.id.menu_fav ->{

                    true
                }
                R.id.menu_per ->{

                    true
                }
                else -> false
            }
        }


    }
}