package com.example.experementswithrecyclerview.recyclerView

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.experementswithrecyclerview.databinding.ItemHeaderBinding

class HeaderViewHolder(view: View): RecyclerView.ViewHolder(view) {
    val binding = ItemHeaderBinding.bind(view)
    fun bind(header: ChapterHeader){
        binding.headerTv.text = header.nameOfChapter
    }
}