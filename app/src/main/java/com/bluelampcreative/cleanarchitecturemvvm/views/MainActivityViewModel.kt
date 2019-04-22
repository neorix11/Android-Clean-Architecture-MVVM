package com.bluelampcreative.cleanarchitecturemvvm.views

import androidx.lifecycle.MutableLiveData
import com.bluelampcreative.cleanarchitecturemvvm.core.BaseViewModel
import com.bluelampcreative.domain.models.None
import com.bluelampcreative.domain.models.TestDataModel
import com.bluelampcreative.domain.usecases.GetTestData
import kotlinx.coroutines.launch
import kotlin.coroutines.CoroutineContext

class MainActivityViewModel(private val getTestData: GetTestData) : BaseViewModel() {

    val resultData = MutableLiveData<TestDataModel>()

    fun getTestData() {
        launch {
            resultData.value = getTestData(None)
        }
    }
}
