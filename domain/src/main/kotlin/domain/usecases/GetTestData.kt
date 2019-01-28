package com.bluelampcreative.domain.usecases

import com.bluelampcreative.domain.core.BaseCoroutinUseCase
import com.bluelampcreative.domain.models.None
import com.bluelampcreative.domain.models.TestDataModel
import com.bluelampcreative.domain.repositories.TestDataRepository
import kotlin.coroutines.CoroutineContext

class GetTestData(
    private val testDataRepository: TestDataRepository,
    providedCoroutineContext: CoroutineContext? = null
) :
    BaseCoroutinUseCase<None, TestDataModel>(providedCoroutineContext) {

    //replace this with repository data
    override fun execute(params: None): TestDataModel = testDataRepository.getTestData()
}