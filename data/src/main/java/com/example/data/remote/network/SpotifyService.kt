package com.example.data.remote.network

import retrofit2.http.GET

interface SpotifyService {

    @GET("browse/new-releases")
    suspend fun getAlbums(): AlbumsModel
}

