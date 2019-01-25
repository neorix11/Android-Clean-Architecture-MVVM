package com.bluelampcreative.cleanarchitecturemvvm

import android.app.Application
import appModule
import domainModule
import localStorageModule
import networkModule
import org.koin.android.ext.android.startKoin
import org.koin.core.Koin.Companion.logger
import repositoryModule
import timber.log.Timber

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }

        startKoin(
            this,
            appModule +
                    domainModule +
                    localStorageModule +
                    networkModule +
                    repositoryModule
            , logger = logger
        )
    }
}