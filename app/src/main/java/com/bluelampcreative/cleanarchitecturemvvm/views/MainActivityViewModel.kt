package com.bluelampcreative.cleanarchitecturemvvm.views

import androidx.lifecycle.MutableLiveData
import com.bluelampcreative.cleanarchitecturemvvm.core.BaseViewModel
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

class MainActivityViewModel(override val coroutineContext: CoroutineContext) : BaseViewModel() {

    val resultData = MutableLiveData<String>()

    fun getTestData() {
        launch {
            //call suspend function here
        }
    }
}
