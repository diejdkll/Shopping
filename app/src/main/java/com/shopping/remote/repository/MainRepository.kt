package com.shopping.remote.repository

import androidx.paging.PagingData
import com.shopping.model.ListItem
import kotlinx.coroutines.flow.Flow

interface MainRepository {

    fun loadList() : Flow<PagingData<ListItem>>
}