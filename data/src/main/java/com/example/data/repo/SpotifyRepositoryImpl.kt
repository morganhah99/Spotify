package com.example.data.repo

import com.example.data.remote.network.AlbumsModel
import com.example.data.repo.remote.RemoteSpotifyDataSource
import com.example.domain.repo.SpotifyRepository
import kotlinx.coroutines.flow.Flow

class SpotifyRepositoryImpl(
    private val remoteSpotifyDataSource: RemoteSpotifyDataSource
): SpotifyRepository {
    override fun getNewReleases(clientId: String, clientSecret: String): Flow<AlbumsModel> {
        return remoteSpotifyDataSource.getNewReleases(clientId, clientSecret)
    }


}