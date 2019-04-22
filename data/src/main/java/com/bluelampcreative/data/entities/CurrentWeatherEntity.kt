package com.bluelampcreative.data.entities

data class CurrentWeatherEntity(
    val summary: String,
    val precipProbability: Int,
    val temperature: Float,
    val humidity: Float
)