package com.shopping.viewholder

import com.shopping.ListAdapter
import com.shopping.databinding.ItemHorizontalBinding
import com.shopping.model.Horizontal
import com.shopping.model.ListItem

class HorizontalViewHolder(
    private val binding : ItemHorizontalBinding
) : BindingViewHolder<ItemHorizontalBinding>(binding) {

    private val adapter = ListAdapter()

    init {
        binding.listView.adapter = adapter
    }

    override fun bind(item: ListItem) {
        super.bind(item)
        item as Horizontal
        binding.titleTextView.text = item.title
        adapter.submitList(item.items)
    }
}