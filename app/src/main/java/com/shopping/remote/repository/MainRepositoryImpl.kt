package com.shopping.remote.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import com.shopping.remote.MainPagingSource
import com.shopping.remote.MainService
import javax.inject.Inject

class MainRepositoryImpl @Inject constructor(
    private val mainService: MainService
): MainRepository {

    override fun loadList() = Pager(
        config = PagingConfig(
            pageSize = 20,
            enablePlaceholders = false
        ),
        pagingSourceFactory = {
            MainPagingSource(mainService)
        }
    ).flow
}