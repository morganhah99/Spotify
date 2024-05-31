package com.example.data.remote.network


import com.google.gson.annotations.SerializedName

data class AlbumsModel(
    @SerializedName("href")
    val href: String? = "",
    @SerializedName("items")
    val items: List<ItemModel>? = listOf(),
    @SerializedName("limit")
    val limit: Int? = 0,
    @SerializedName("next")
    val next: String? = "",
    @SerializedName("offset")
    val offset: Int? = 0,
    @SerializedName("previous")
    val previous: Any? = Any(),
    @SerializedName("total")
    val total: Int? = 0
)