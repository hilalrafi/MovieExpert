package com.hilalrafi.movieexpert.core.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class MovieResponse (

    @field:SerializedName("id")
    val id: String,

    @field:SerializedName("title")
    val title: String,

    @field:SerializedName("overview")
    val overview: String,

    @field:SerializedName("release_date")
    val releaseDate: String,

    @field:SerializedName("poster_path")
    val posterPath: String,
        )

data class MovieResult (

    @field:SerializedName("results")
    val results: List<MovieResponse>
)