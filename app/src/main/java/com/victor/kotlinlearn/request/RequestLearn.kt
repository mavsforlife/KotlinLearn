package com.victor.kotlinlearn.request

import android.util.Log
import java.net.URL

/**
 * Created by victor on 2018/5/31.
 * Email: wwmdirk@gmail.com
 */
const val TAG = "RequestLearn"

public class RequestLearn(val url: String) {

    public fun run() {
        val forecastJsonStr = URL(url).readText()
        Log.d(TAG, forecastJsonStr)
    }
}