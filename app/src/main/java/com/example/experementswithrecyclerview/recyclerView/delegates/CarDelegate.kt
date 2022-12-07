package com.example.experementswithrecyclerview.recyclerView.delegates

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.experementswithrecyclerview.R
import com.example.experementswithrecyclerview.recyclerView.holders.CarViewHolder
import com.example.experementswithrecyclerview.recyclerView.models.CarItem
import com.example.experementswithrecyclerview.recyclerView.models.Item

class CarDelegate(context: Context): Delegate {
    override fun forItem(listItem: Item): Boolean = listItem is CarItem

    override fun getViewHolder(parent: ViewGroup): RecyclerView.ViewHolder{
        val view = LayoutInflater.from(parent.context).inflate(R.layout.car_item, parent, false)
        return CarViewHolder(view)
    }

    override fun bindViewHolder(viewHolder: RecyclerView.ViewHolder, item: Item) {
        (viewHolder as CarViewHolder).let { carViewHolder ->
            val carItem = item as CarItem
            carViewHolder.bind(item)
        }
    }
}