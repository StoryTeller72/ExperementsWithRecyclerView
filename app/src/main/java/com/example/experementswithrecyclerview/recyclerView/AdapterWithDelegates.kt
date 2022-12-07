package com.example.experementswithrecyclerview.recyclerView

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.experementswithrecyclerview.recyclerView.delegates.Delegate
import com.example.experementswithrecyclerview.recyclerView.models.Item

class AdapterWithDelegates(
    private val delegates: List<Delegate>,
    var items: List<Item>
): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemViewType(position: Int): Int = delegates.indexOfFirst { delegate -> delegate.forItem(items[position])  }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
        delegates[viewType].getViewHolder(parent)


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        delegates[getItemViewType(position)].bindViewHolder(holder, items[position])
    }

    override fun getItemCount(): Int = items.size

}