package com.victor.kotlinlearn.forecast

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.victor.kotlinlearn.R
import com.victor.kotlinlearn.domain.RequestForecastCommand
import org.jetbrains.anko.async
import org.jetbrains.anko.find
import org.jetbrains.anko.uiThread

class ForecastActivity : AppCompatActivity() {

    private val items = listOf(
            "Mon 6/23 - Sunny - 31/17",
            "Tue 6/24 - Foggy - 21/8",
            "Wed 6/25 - Cloudy - 22/17",
            "Thurs 6/26 - Rainy - 18/11",
            "Fri 6/27 - Foggy - 17/10",
            "Sat 6/28 - TRAPPED IN WEATHERSTATION - 23/18",
            "Sun 6/29 - Sunny - 20/7"
    )

    private var mRvForecast: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forecast)

        mRvForecast = find(R.id.rv_forecast)
        mRvForecast?.layoutManager = LinearLayoutManager(this)
        getWeatherInfo()
    }

    fun getWeatherInfo() {
        async() {
            val result = RequestForecastCommand("94043").execute()
            uiThread {
                mRvForecast?.adapter = ForecastAdapter(result)
            }
        }
    }
}
