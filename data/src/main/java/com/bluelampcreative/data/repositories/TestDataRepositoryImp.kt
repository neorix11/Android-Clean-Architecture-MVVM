package com.bluelampcreative.data.repositories

import com.bluelampcreative.domain.models.TestDataModel
import com.bluelampcreative.domain.repositories.TestDataRepository

class TestDataRepositoryImp : TestDataRepository {
    override fun getTestData(): TestDataModel {
        return TestDataModel("This is now a nice message coming all the way from the depths of the Data module.")
    }

}