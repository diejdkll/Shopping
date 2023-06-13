package com.shopping.model

import com.google.gson.annotations.SerializedName

data class Coupon(
    @SerializedName("imageUrl") val imageUrl : String,
    @SerializedName("name") val name : String,
    @SerializedName("coupon") val coupon : String,
) : ListItem {
    override val viewType: ViewType
        get() = ViewType.COUPON
}
