package com.victor.kotlinlearn.learn

import com.victor.kotlinlearn.model.Artist

/**
 * Created by victor on 2018/5/30.
 * Email: wwmdirk@gmail.com
 */
class ArtistLearn private constructor() {

    var notNullArtist: Artist = Artist(1, "name", "url", "mbid")

    var artist: Artist? = null

    fun test() {
        notNullArtist.print()
        artist?.print()

        var name = artist?.name
    }
}