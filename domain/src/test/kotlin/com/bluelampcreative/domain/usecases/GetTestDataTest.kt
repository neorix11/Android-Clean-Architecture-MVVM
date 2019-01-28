package com.bluelampcreative.domain.usecases

import com.bluelampcreative.domain.models.None
import com.bluelampcreative.domain.models.TestDataModel
import com.bluelampcreative.domain.repositories.TestDataRepository
import com.nhaarman.mockitokotlin2.given
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertEquals
import org.junit.Test

class GetTestDataTest {

    @Test
    fun `can get test data`() {
        val testString = "This is now a nice message coming all the way from the depths of the Data module."

        val testDataModel =
            TestDataModel(testString)
        val mockRespository = mock<TestDataRepository> {
            given { it.getTestData() }.willReturn(testDataModel)
        }

        val sut = GetTestData(mockRespository)
        runBlocking { sut(None) }
        verify(mockRespository).getTestData()
        assertEquals("The string should be identical", testString, testDataModel.message)

    }
}