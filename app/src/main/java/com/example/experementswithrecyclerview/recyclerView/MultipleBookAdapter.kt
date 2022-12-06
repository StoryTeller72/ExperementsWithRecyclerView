package com.example.experementswithrecyclerview.recyclerView

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.experementswithrecyclerview.R

class MultipleBookAdapter(): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val data = mutableListOf(
        ChapterHeader("Русская литература"),
        BookItem("Идиот", "Достоевский.Ф.М"),
        BookItem("Скрипка Ротшильда", "Чехов.А.П"),
        BookItem("Братья Карамазовы", "Достоевский.Ф.М"),
        ChapterHeader("Зарубежная литература"),
        BookItem("Мартин Иден", "Джек Лондон"),
        BookItem("Триумфальная арка", "Эрих Мария Ремарк"),
        BookItem("Солярис", "Станислав Лем"),
        BookItem("Я робот", "Айзек Азимов"),
        ChapterHeader("Поэзия"),
        BookItem("Евгений Онегин", "Пушкин.А.С"),
        BookItem("Сборник стихов", "Ахматова.А"),

    )

    override fun getItemViewType(position: Int) =
        when (data[position]) {
            is BookItem -> BOOK_ITEM_TYPE
            is ChapterHeader -> HEADER_VIEW_TYPE
            else -> throw IllegalStateException()
        }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return when(viewType){
            BOOK_ITEM_TYPE -> {
                val view =
                    LayoutInflater.from(parent.context).inflate(R.layout.book_item, parent, false)
                BookViewHolder(view)
            }
            HEADER_VIEW_TYPE ->{
                val view =
                    LayoutInflater.from(parent.context).inflate(R.layout.item_header, parent, false)
                HeaderViewHolder(view)
            }
            else -> throw IllegalStateException()
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        holder.bind(data[position])
        when(getItemViewType(position)){
            BOOK_ITEM_TYPE -> {
                val bookViewHolder = holder as BookViewHolder
                val bookItem = data[position] as BookItem
                bookViewHolder.bind(bookItem)
            }
            HEADER_VIEW_TYPE ->{
                val headerViewHolder = holder as HeaderViewHolder
                val headerItem = data[position] as ChapterHeader
                headerViewHolder.bind(headerItem)
            }

        }
    }

    override fun getItemCount(): Int {
        return  data.size
    }

    companion object{
        const val BOOK_ITEM_TYPE = 0
        const val HEADER_VIEW_TYPE = 1
    }
}