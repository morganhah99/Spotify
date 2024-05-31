package com.example.data.remote.di

import com.example.data.remote.source.RemoteSpotifyDataSourceImpl
import com.example.data.repo.SpotifyRepositoryImpl
import com.example.data.repo.remote.RemoteSpotifyDataSource
import com.example.domain.repo.SpotifyRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RemoteDataSourceModule {

    @Binds
    abstract fun bindRemoteSpotifyDataSource(
        remoteSpotifyDataSourceImpl: RemoteSpotifyDataSourceImpl
    ): RemoteSpotifyDataSource

    @Binds
    abstract fun bindSpotifyRepository(
        spotifyRepositoryImpl: SpotifyRepositoryImpl
    ): SpotifyRepository
}