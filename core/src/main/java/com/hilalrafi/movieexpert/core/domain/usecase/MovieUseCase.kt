package com.hilalrafi.movieexpert.core.domain.usecase

import com.hilalrafi.movieexpert.core.data.source.Resource
import com.hilalrafi.movieexpert.core.domain.model.Movie
import kotlinx.coroutines.flow.Flow

interface MovieUseCase {
    fun getAllMovie(): Flow<Resource<List<Movie>>>
    fun getFavoriteMovie(): Flow<List<Movie>>
    fun setFavoriteMovie(movie: Movie, state: Boolean)
}