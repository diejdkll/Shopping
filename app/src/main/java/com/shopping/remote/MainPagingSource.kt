package com.shopping.remote

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.shopping.model.ListItem
import com.shopping.remote.mock.SampleMock

class MainPagingSource(private val mainService: MainService) : PagingSource<Int, ListItem>() {

    override fun getRefreshKey(state: PagingState<Int, ListItem>) = 0

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, ListItem> {
        return try {
            val page = params.key ?: 1
            val size = params.loadSize
            val result = SampleMock.shoppingList() // mainService.getList(page, size).data

            LoadResult.Page(
                data = result,
                prevKey = null,
                nextKey = null // result.page.nextPage
            )

        } catch (e : Exception) {
            LoadResult.Error(e)
        }
    }
}