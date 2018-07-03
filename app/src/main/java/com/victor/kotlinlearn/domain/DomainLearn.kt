package com.victor.kotlinlearn.domain

/**
 * Created by victor on 2018/6/1.
 * Email: wwmdirk@gmail.com
 */

data class ForecastList(val city: String, val country: String,
                        val dailyForecast: List<Forecast>) {

    operator fun get(position: Int): Forecast = dailyForecast[position]

    fun size(): Int {
        return dailyForecast.size
    }
}

data class Forecast(val date: String, val description: String,
                    val high: Int, val low: Int)
class DomainLearn {
}