package com.example.experementswithrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.experementswithrecyclerview.databinding.ActivityMainBinding
import com.example.experementswithrecyclerview.recyclerView.AdapterWithDelegates
import com.example.experementswithrecyclerview.recyclerView.delegates.CarDelegate
import com.example.experementswithrecyclerview.recyclerView.delegates.HeaderDelegate
import com.example.experementswithrecyclerview.recyclerView.models.CarItem
import com.example.experementswithrecyclerview.recyclerView.models.HeaderItem

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val dataList = listOf(
            HeaderItem("Отечественный автопром"),
            CarItem("Волга", 1987, 20000 ),
            CarItem("Жигули", 1990, 12300 ),
            CarItem("Семерка", 1978, 21200 ),
            HeaderItem("Иномарки"),
            CarItem("Nissan Skyline gtr 34", 1987, 210000 ),
            CarItem("BMW M5 Competition", 2017, 5_000_000 ),
            CarItem("Mercedes", 2019, 2_000_000 ),
        )
        binding.recyclerViewMain.adapter = AdapterWithDelegates(listOf(CarDelegate(this), HeaderDelegate(this)),
            dataList)
    }

}