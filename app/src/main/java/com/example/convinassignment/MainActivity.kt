package com.example.convinassignment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.convinassignment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: MainScreenAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        adapter = MainScreenAdapter()
        binding.rvMainScreen.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvMainScreen.adapter = adapter

        binding.swipeRefreshLayout.setOnRefreshListener {
            adapter.addValueOnSwipe()
            binding.swipeRefreshLayout.isRefreshing = false
        }
        setContentView(binding.root)
    }
}