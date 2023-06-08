package com.shopping.model

class Empty : ListItem {
    override val viewType: ViewType
        get() = ViewType.EMPTY
}