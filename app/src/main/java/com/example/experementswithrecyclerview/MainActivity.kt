package com.example.experementswithrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.experementswithrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.recyclerViewMain.layoutManager = LinearLayoutManager(this)
        val thisAdapter = ExampleAdapter()
        binding.recyclerViewMain.adapter = thisAdapter

        binding.ftBtn.setOnClickListener {
            thisAdapter.items = listOf(
                Item(14325),
                Item(11234),
                Item(154435),
                Item(21739),
                Item(21341),
                Item(112312),
            )
        }
    }
}

