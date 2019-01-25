package com.bluelampcreative.domain.repositories

import com.bluelampcreative.domain.models.TestDataModel

interface TestDataRepository {
    fun getTestData(): TestDataModel
}