package com.victor.kotlinlearn

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import android.widget.Toast
import com.victor.kotlinlearn.forecast.ForecastActivity
import com.victor.kotlinlearn.model.Forecast
import com.victor.kotlinlearn.request.RequestLearn

import org.jetbrains.anko.find

import org.jetbrains.anko.async
import org.jetbrains.anko.longToast
import org.jetbrains.anko.uiThread
import java.util.*

class MainActivity : AppCompatActivity() {

    private var mTvMsg: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mTvMsg = find(R.id.message)

        mTvMsg?.setText(R.string.hello_kotlin)

        mTvMsg?.setOnClickListener{
            val intent = Intent(this, ForecastActivity::class.java)
            startActivity(intent)
        }

        testAsyncRequest("http://gank.io/api/data/Android/10/1")
    }

    //扩展函数
    private fun Context.toast(msg: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, msg, duration).show()
    }

    fun testToast() {
        toast("testToast")
    }

    fun toastToastLong() {
        toast("test toast long", Toast.LENGTH_LONG)
    }

    //扩展函数
    public var TextView.text: CharSequence
        get() = getText()
        set(value) = setText(value)

    public fun testAsyncRequest(url: String) {
        async {
            RequestLearn(url).run()
            uiThread { longToast("Request performed") }
        }

    }

    //复制数据类
    val f1 = Forecast(Date(), 27.5f, "Shiny day")
    val f2 = f1.copy(temperature = 28.5f)


}
