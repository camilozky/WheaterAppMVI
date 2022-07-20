package com.example.weatherappmvi.presentation.ui.viewmodel

import com.example.weatherappmvi.domain.weather.WeatherInfo

data class WeatherState(
    val weatherInfo: WeatherInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
