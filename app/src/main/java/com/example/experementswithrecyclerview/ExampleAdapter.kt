package com.example.experementswithrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.experementswithrecyclerview.databinding.ItemBinding

class ExampleAdapter(): RecyclerView.Adapter<ExampleViewHolder>() {

//    var items: List<Item> = emptyList()
    var items: List<Item> = listOf(Item(1), Item(3), Item(6))
        set(value) {
            val callback = CommonCallbackImpl(
                oldItems = field,
                newItems = value
            )
            field = value
            val diffResult = DiffUtil.calculateDiff(callback)
            diffResult.dispatchUpdatesTo(this)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return ExampleViewHolder(view)
    }

    override fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int {
        return  items.size
    }
}