package com.example.experementswithrecyclerview.recyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.experementswithrecyclerview.R
import com.example.experementswithrecyclerview.databinding.ItemBinding

class Adapter(private var listOfLanguages: List<Item>):RecyclerView.Adapter<Adapter.ItemHolder>() {

    class ItemHolder(viewItem: View): RecyclerView.ViewHolder(viewItem) {
        val binding = ItemBinding.bind(viewItem)
        fun bind(item: Item, onDataSetChanged: () -> Unit) = with(binding){
            tvLangName.text = item.languageName
            tvDescription.text = item.description
            expandedView.visibility = if(item.expand) View.VISIBLE else View.GONE

            cardLayout.setOnClickListener {
                item.expand = !item.expand
                onDataSetChanged()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
       val binding = ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemHolder(binding.root)
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        holder.bind(listOfLanguages[position], { notifyDataSetChanged() })
    }

    override fun getItemCount(): Int {
       return listOfLanguages.size
    }
}