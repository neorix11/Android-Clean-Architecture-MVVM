package com.bluelampcreative.cleanarchitecturemvvm

import android.app.Application
import appModule
import domainModule
import localStorageModule
import networkModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import repositoryModule
import timber.log.Timber

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }

        startKoin {
            logger()
            androidContext(this@MainApplication)
            modules(
                appModule +
                        domainModule +
                        localStorageModule +
                        networkModule +
                        repositoryModule
            )
        }
    }
}