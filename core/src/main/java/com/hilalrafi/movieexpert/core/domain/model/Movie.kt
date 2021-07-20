package com.hilalrafi.movieexpert.core.domain.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Movie (
    val movieId: String,
    val title: String,
    val overview: String,
    val date: String,
    val isFavorite: Boolean,
    val posterPath: String
        ): Parcelable