package com.hilalrafi.movieexpert.core.utils

import com.hilalrafi.movieexpert.core.data.source.local.entity.MovieEntity
import com.hilalrafi.movieexpert.core.data.source.remote.response.MovieResponse
import com.hilalrafi.movieexpert.core.domain.model.Movie

object DataMapper {
    fun mapResponsesToEntities(input: List<MovieResponse>): List<MovieEntity> {
        val movieList = ArrayList<MovieEntity>()
        input.map {
                val movie = MovieEntity(
                movieId = it.id,
                title = it.title,
                overview = it.overview,
                date = it.releaseDate ?: "null date",
                isFavorite = false,
                posterPath = it.posterPath
            )
            movieList.add(movie)
        }
        return movieList
    }

    fun mapEntitiesToDomain(input: List<MovieEntity>): List<Movie> =
        input.map {
            Movie(
                movieId = it.movieId,
                title = it.title,
                overview = it.overview,
                date = it.date,
                isFavorite = it.isFavorite,
                posterPath = it.posterPath
            )
        }

    fun mapDomainToEntity(input: Movie) = MovieEntity(
        movieId = input.movieId,
        title = input.title,
        overview = input.overview,
        date = input.date,
        isFavorite = input.isFavorite,
        posterPath = input.posterPath
    )
}