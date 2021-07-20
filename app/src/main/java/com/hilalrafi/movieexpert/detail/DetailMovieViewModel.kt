package com.hilalrafi.movieexpert.detail

import androidx.lifecycle.ViewModel
import com.hilalrafi.movieexpert.core.domain.model.Movie
import com.hilalrafi.movieexpert.core.domain.usecase.MovieUseCase

class DetailMovieViewModel(private val movieUseCase: MovieUseCase): ViewModel() {
    fun setFavoriteMovie(movie: Movie, newStatus: Boolean) =
        movieUseCase.setFavoriteMovie(movie, newStatus)
}