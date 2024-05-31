package com.example.domain.repo

import com.example.data.remote.network.AlbumsModel
import kotlinx.coroutines.flow.Flow

interface SpotifyRepository {


    fun getNewReleases(clientId: String, clientSecret: String): Flow<AlbumsModel>


}