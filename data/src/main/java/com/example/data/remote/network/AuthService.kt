package com.example.data.remote.network

import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.Header
import retrofit2.http.POST

interface AuthService {

    @POST("api/token")
    @FormUrlEncoded
    suspend fun getAccessToken(
        @Field("grant_type") grantType: String = "client_credentials",
        @Header("Authorization") authorization: String
    ): AccessTokenResponse
}
