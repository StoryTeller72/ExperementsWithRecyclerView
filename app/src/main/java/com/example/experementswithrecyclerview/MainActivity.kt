package com.example.experementswithrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.experementswithrecyclerview.databinding.ActivityMainBinding
import com.example.experementswithrecyclerview.recyclerView.MultipleBookAdapter

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.recyclerViewMain.layoutManager = LinearLayoutManager(this)
        binding.recyclerViewMain.adapter = MultipleBookAdapter()
    }

}