package com.hilalrafi.movieexpert.favorite.di

import com.hilalrafi.movieexpert.favorite.FavoriteViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val favoriteModule = module {
    viewModel { FavoriteViewModel(get()) }
}