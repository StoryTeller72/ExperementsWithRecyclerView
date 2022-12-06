package com.example.experementswithrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.experementswithrecyclerview.databinding.ItemBinding

class ExampleAdapter(): RecyclerView.Adapter<ExampleViewHolder>() {
    private val data = mutableListOf(
        Item(1),
        Item(2),
        Item(3),
        Item(4),
    )
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return ExampleViewHolder(view)
    }

    override fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return  data.size
    }
}