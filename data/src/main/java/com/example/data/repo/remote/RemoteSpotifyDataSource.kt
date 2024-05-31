package com.example.data.repo.remote

import com.example.data.remote.network.AlbumsModel
import kotlinx.coroutines.flow.Flow

interface RemoteSpotifyDataSource {

    fun getAccessToken(clientId: String, clientSecret: String): String

    fun getNewReleases(clientId: String, clientSecret: String): Flow<AlbumsModel>

}