package com.victor.kotlinlearn.domain

import com.victor.kotlinlearn.request.ForecastRequest

/**
 * Created by victor on 2018/7/3.
 * Email: wwmdirk@gmail.com
 */
class RequestForecastCommand(val zipCode: String) : Command<ForecastList> {

    override fun execute(): ForecastList {
        val forecastRequest = ForecastRequest(zipCode)
        return ForecastDataMapper().convertFromDataModel(forecastRequest.execute())
    }

}