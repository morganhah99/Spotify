package com.example.data.remote.network


import com.google.gson.annotations.SerializedName

data class AlbumModel(
    @SerializedName("albums")
    val albums: AlbumsModel? = AlbumsModel()
)