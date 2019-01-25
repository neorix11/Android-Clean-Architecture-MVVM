package com.bluelampcreative.cleanarchitecturemvvm.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.bluelampcreative.cleanarchitecturemvvm.R
import org.koin.androidx.viewmodel.ext.android.viewModel
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    private val mainActivityViewModel: MainActivityViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainActivityViewModel.getTestData()

        mainActivityViewModel.resultData.observe(this, Observer {
            Timber.e("We have received some test data: ${it.message}")
        })
    }
}
