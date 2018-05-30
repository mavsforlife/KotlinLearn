package com.victor.kotlinlearn.forecast

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by victor on 2018/5/30.
 * Email: wwmdirk@gmail.com
 */
class ForecastAdapter(val items: List<String>): RecyclerView.Adapter<ForecastAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(TextView(parent.context))
    }

    override fun getItemCount(): Int {
       return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = items[position]
    }

    class ViewHolder(val textView: TextView): RecyclerView.ViewHolder(textView) {

    }
}