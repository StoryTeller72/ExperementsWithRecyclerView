package com.example.experementswithrecyclerview.recyclerView

interface ListItem

data class CommonItem(val text: String): ListItem

data class ExpandableItem(
    val text: String,
    val isExpanded: Boolean,
    val innerItem: List<InnerItem>
)

data class InnerItem(val text: String) : ListItem