package com.example.weatherappmvi.data.remote

import com.example.weatherappmvi.data.remote.WeatherDataDto
import com.squareup.moshi.Json

data class WeatherDto(
    @field:Json(name = "hourly")
    val weatherData: WeatherDataDto
)
