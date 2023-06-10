package com.shopping.viewholder

import com.shopping.ListAdapter
import com.shopping.databinding.ItemViewpagerBinding
import com.shopping.model.ListItem
import com.shopping.model.ViewPager

class ViewPagerViewHolder(
    binding: ItemViewpagerBinding
) : BindingViewHolder<ItemViewpagerBinding>(binding) {

    private val adapter = ListAdapter()

    init {
        binding.viewpager.adapter = adapter
    }

    override fun bind(item: ListItem) {
        super.bind(item)
        item as ViewPager
        adapter.submitList(item.items)
    }
}