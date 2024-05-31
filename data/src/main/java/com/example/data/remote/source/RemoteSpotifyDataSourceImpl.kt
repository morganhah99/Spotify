package com.example.data.remote.source

import android.util.Base64
import com.example.data.remote.network.AlbumsModel
import com.example.data.remote.network.AuthService
import com.example.data.remote.network.SpotifyService
import com.example.data.repo.remote.RemoteSpotifyDataSource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class RemoteSpotifyDataSourceImpl @Inject constructor(
    private val authService: AuthService,
    private val spotifyService: SpotifyService
) : RemoteSpotifyDataSource {

    private var accessToken: String? = null

    override suspend fun getAccessToken(clientId: String, clientSecret: String): String {
        if (accessToken.isNullOrEmpty()) {
            val credentials = "$clientId:$clientSecret"
            val basicAuth = "Basic " + Base64.encodeToString(credentials.toByteArray(), Base64.NO_WRAP)
            val response = authService.getAccessToken(authorization = basicAuth)
            accessToken = "${response.tokenType} ${response.accessToken}"
        }
        return accessToken!!
    }

    override fun getNewReleases(clientId: String, clientSecret: String): Flow<AlbumsModel> = flow {
        val token = getAccessToken(clientId, clientSecret)
        emit(spotifyService.getAlbums("Bearer $token"))
    }
}
