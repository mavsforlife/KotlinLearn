package com.victor.kotlinlearn.domain

import com.victor.kotlinlearn.model.ForecastResult
import java.text.DateFormat
import java.util.*

/**
 * Created by victor on 2018/7/3.
 * Email: wwmdirk@gmail.com
 */
//制定别名
import com.victor.kotlinlearn.model.Forecast as ModelForecast

public class ForecastDataMapper {

    fun convertFromDataModel(forecast: ForecastResult): ForecastList {
        return ForecastList(forecast.city.name,
                forecast.city.country,
                convertForecastListToDomain(forecast.list))
    }

    private fun convertForecastListToDomain(list: List<ModelForecast>): List<Forecast> {
        return list.map { convertForecastItemToDomain(it) }
    }

    private fun convertForecastItemToDomain(forecast: ModelForecast): Forecast {
        return Forecast(convertDate(forecast.dt),
                forecast.weather[0].description,
                forecast.temp.max.toInt(),
                forecast.temp.min.toInt())
    }

    private fun convertDate(date: Long): String {
        val df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.getDefault())
        return df.format(date * 1000)
    }
}