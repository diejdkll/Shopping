package com.shopping.model

import com.google.gson.annotations.SerializedName

data class Horizontal(
    @SerializedName("title") val title: String,
    @SerializedName("items") val items: List<ListItem>
) : ListItem {
    override val viewType: ViewType
        get() = ViewType.HORIZONTAL
}
