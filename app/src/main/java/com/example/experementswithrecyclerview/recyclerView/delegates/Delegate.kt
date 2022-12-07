package com.example.experementswithrecyclerview.recyclerView.delegates

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.experementswithrecyclerview.recyclerView.models.HeaderItem
import com.example.experementswithrecyclerview.recyclerView.models.Item

interface Delegate {
    fun forItem(listItem: Item): Boolean
    fun getViewHolder(parent: ViewGroup): RecyclerView.ViewHolder
    fun bindViewHolder(viewHolder: ViewHolder, item: Item)
}