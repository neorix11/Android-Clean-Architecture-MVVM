package com.bluelampcreative.domain.usecases

import com.bluelampcreative.domain.core.BaseCoroutinUseCase
import com.bluelampcreative.domain.models.None
import com.bluelampcreative.domain.models.TestDataModel
import kotlin.coroutines.CoroutineContext

class GetTestData(providedCoroutineContext: CoroutineContext? = null) :
    BaseCoroutinUseCase<None, TestDataModel>(providedCoroutineContext) {

    //replace this with repository data
    override fun execute(params: None): TestDataModel = TestDataModel("This is a test message")
}