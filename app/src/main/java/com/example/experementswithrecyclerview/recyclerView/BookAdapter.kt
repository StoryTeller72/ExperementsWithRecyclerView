package com.example.experementswithrecyclerview.recyclerView

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.experementswithrecyclerview.R

class BookAdapter(): RecyclerView.Adapter<BookViewHolder>() {
    private val data = mutableListOf(
        BookItem("Идиот", "Достоевский.Ф.М"),
        BookItem("Мартин Иден", "Джек Лондон"),
        BookItem("Братья Карамазовы", "Достоевский.Ф.М"),
        BookItem("Триумфальная арка", "Эрих Мария Ремарк"),
        BookItem("Скрипка Ротшильда", "Чехов.А.П"),
    )
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.book_item, parent, false)
        return BookViewHolder(view)
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int {
        return  data.size
    }
}