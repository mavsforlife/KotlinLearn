package com.victor.kotlinlearn.model

/**
 * Created by victor on 2018/5/30.
 * Email: wwmdirk@gmail.com
 */
data class Artist(
        var id: Long,
        var name: String,
        var url: String,
        var mbid: String
) {
    fun print() {

    }
}