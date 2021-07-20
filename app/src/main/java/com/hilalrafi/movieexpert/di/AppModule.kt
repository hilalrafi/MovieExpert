package com.hilalrafi.movieexpert.di

import com.hilalrafi.movieexpert.core.domain.usecase.MovieInteractor
import com.hilalrafi.movieexpert.core.domain.usecase.MovieUseCase
import com.hilalrafi.movieexpert.detail.DetailMovieViewModel
import com.hilalrafi.movieexpert.home.HomeViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val useCaseModule = module {
    factory<MovieUseCase> { MovieInteractor(get()) }
}

val viewModelModule = module {
    viewModel { HomeViewModel(get()) }
    viewModel { DetailMovieViewModel(get()) }
}