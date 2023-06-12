package com.shopping

import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import com.shopping.model.ListItem
import com.shopping.viewholder.BindingViewHolder
import com.shopping.viewholder.ViewHolderGenerator

class PagingListAdapter : PagingDataAdapter<ListItem, BindingViewHolder<*>>(DiffCallback()) {

    override fun getItemViewType(position: Int): Int {
        val item = getItem(position)
        return item?.viewType?.ordinal ?: -1
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BindingViewHolder<*> {
        return ViewHolderGenerator.get(parent, viewType)
    }

    override fun onBindViewHolder(holder: BindingViewHolder<*>, position: Int) {
        val item = getItem(position)
        if (item != null){
            holder.bind(item)
        }
    }
}