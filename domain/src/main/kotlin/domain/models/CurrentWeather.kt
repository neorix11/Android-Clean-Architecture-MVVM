package domain.models

data class CurrentWeather(
    val summary: String,
    val precipProbability: Int,
    val temperature: Float,
    val humidity: Float
)