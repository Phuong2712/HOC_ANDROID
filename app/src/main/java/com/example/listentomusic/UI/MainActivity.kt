package com.example.listentomusic.UI

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listentomusic.R
import com.example.listentomusic.data.ParentAdapter
import com.example.listentomusic.data.ParentList
import com.example.listentomusic.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var bottomNavigationView: BottomNavigationView
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ParentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // thêm recyclerview và adapter
        recyclerView = binding.recyclerView
        adapter = ParentAdapter(ParentList.song)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        // thêm Navigation: thanh điều hướng
        bottomNavigationView = binding.narView
        bottomNavigationView.inflateMenu(R.menu.menu_navigation)

        bottomNavigationView.setOnNavigationItemSelectedListener {
            menuItem -> when(menuItem.itemId){
                R.id.menu_home ->{
                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.menu_fav ->{
                    val intent = Intent(this, FavoriteActivity::class.java)
                    startActivity(intent)
                    true
                }
                R.id.menu_per ->{
                    val intent = Intent(this, PersonActivity::class.java)
                    true
                }
                else -> false
            }
        }


    }
}