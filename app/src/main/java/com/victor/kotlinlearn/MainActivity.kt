package com.victor.kotlinlearn

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.victor.kotlinlearn.forecast.ForecastActivity

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        message.setText(R.string.hello_kotlin)

        message.setOnClickListener{
            val intent = Intent(this, ForecastActivity::class.java)
            startActivity(intent)
        }
    }

}
