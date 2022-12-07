package com.example.experementswithrecyclerview.recyclerView.holders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.experementswithrecyclerview.databinding.HeaderItemBinding
import com.example.experementswithrecyclerview.recyclerView.models.HeaderItem

class HeaderHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val binding = HeaderItemBinding.bind(view)
    fun bind(headerItem: HeaderItem) = with(binding) {
        header.text = headerItem.HeaderText
    }
}
