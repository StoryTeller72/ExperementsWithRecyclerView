package com.example.experementswithrecyclerview.recyclerView

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.experementswithrecyclerview.databinding.BookItemBinding
import com.example.experementswithrecyclerview.recyclerView.BookItem


class BookViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    private val binding = BookItemBinding.bind(itemView)
    fun bind(bookItem: BookItem){
        binding.bookTitleTv.text = bookItem.title
        binding.authorTv.text = bookItem.author
    }
}