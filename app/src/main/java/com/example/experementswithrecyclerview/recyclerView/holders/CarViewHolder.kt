package com.example.experementswithrecyclerview.recyclerView.holders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.experementswithrecyclerview.databinding.CarItemBinding
import com.example.experementswithrecyclerview.recyclerView.models.CarItem

class CarViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val binding = CarItemBinding.bind(view)
    fun bind(carItem: CarItem) = with(binding) {
        carTitle.text = carItem.name
        price.text = carItem.price.toString()
        year.text = carItem.age.toString()
    }
}
