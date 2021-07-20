package com.hilalrafi.movieexpert.core.data.source.remote.network

import com.hilalrafi.movieexpert.core.data.source.remote.response.MovieResult
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("movie/popular")
    suspend fun getMoviePopular(
        @Query("api_key") api_key: String,
        @Query("page") page: Int
    ): MovieResult
}