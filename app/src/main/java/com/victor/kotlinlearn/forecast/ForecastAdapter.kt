package com.victor.kotlinlearn.forecast

import android.support.v7.widget.RecyclerView
import android.view.Gravity
import android.view.ViewGroup
import android.widget.TextView
import com.victor.kotlinlearn.domain.ForecastList

/**
 * Created by victor on 2018/5/30.
 * Email: wwmdirk@gmail.com
 */
class ForecastAdapter(val weekForecast: ForecastList): RecyclerView.Adapter<ForecastAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(TextView(parent.context))
    }

    override fun getItemCount(): Int {
       return weekForecast.size()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(weekForecast[holder.adapterPosition]) {
            holder.textView.text = "$date - $description - $high/$low"
        }
    }

    class ViewHolder(val textView: TextView): RecyclerView.ViewHolder(textView) {
        init {
            val layoutParams = ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT)
            textView.gravity = Gravity.CENTER
            textView.setPadding(0, 10, 0, 10)
            textView.layoutParams = layoutParams
        }
    }
}