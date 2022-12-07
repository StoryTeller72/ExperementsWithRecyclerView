package com.example.experementswithrecyclerview.recyclerView.delegates

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.experementswithrecyclerview.R
import com.example.experementswithrecyclerview.recyclerView.holders.HeaderHolder
import com.example.experementswithrecyclerview.recyclerView.models.HeaderItem
import com.example.experementswithrecyclerview.recyclerView.models.Item

class HeaderDelegate(context: Context): Delegate {
    override fun forItem(listItem: Item): Boolean = listItem is HeaderItem

    override fun getViewHolder(parent: ViewGroup): RecyclerView.ViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.header_item, parent, false)
        return HeaderHolder(view)
    }

    override fun bindViewHolder(viewHolder: RecyclerView.ViewHolder, item: Item) {
        (viewHolder as HeaderHolder).let { headerHolder ->
            val headerItem = item as HeaderItem
            headerHolder.bind(headerItem)
        }
    }
}