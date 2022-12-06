package com.example.experementswithrecyclerview

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.experementswithrecyclerview.databinding.ItemBinding

class ExampleViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    private val binding = ItemBinding.bind(itemView)
    fun bind(item: Item){
        binding.vhNumber.text = item.number.toString()
    }
}