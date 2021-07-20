package com.hilalrafi.movieexpert

import android.app.Application
import com.hilalrafi.movieexpert.core.di.databaseModule
import com.hilalrafi.movieexpert.core.di.networkModule
import com.hilalrafi.movieexpert.core.di.repositoryModule
import com.hilalrafi.movieexpert.di.useCaseModule
import com.hilalrafi.movieexpert.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class MyApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.NONE)
            androidContext(this@MyApplication)
            modules(
                listOf(
                    databaseModule,
                    networkModule,
                    repositoryModule,
                    useCaseModule,
                    viewModelModule
                )
            )
        }
    }
}