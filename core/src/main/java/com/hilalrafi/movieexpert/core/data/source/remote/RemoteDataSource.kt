package com.hilalrafi.movieexpert.core.data.source.remote

import android.util.Log
import com.hilalrafi.movieexpert.core.data.source.remote.network.ApiResponse
import com.hilalrafi.movieexpert.core.data.source.remote.network.ApiService
import com.hilalrafi.movieexpert.core.data.source.remote.response.MovieResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class RemoteDataSource(private val apiService: ApiService) {

    companion object {
        const val API_KEY = "074482cd99a01edf151ad5b28ad0045d"
    }

    suspend fun getAllMovie(): Flow<ApiResponse<List<MovieResponse>>> {
        return flow {
            try {
                val response = apiService.getMoviePopular(API_KEY,1)
                val dataArray = response.results
                if (dataArray.isNotEmpty()) {
                    emit(ApiResponse.Success(response.results))
                } else {
                    emit(ApiResponse.Empty)
                }
            } catch (e: Exception) {
                emit(ApiResponse.Error(e.toString()))
                Log.e("RemoteDataSource", e.toString())
            }
        }.flowOn(Dispatchers.IO)
    }
}