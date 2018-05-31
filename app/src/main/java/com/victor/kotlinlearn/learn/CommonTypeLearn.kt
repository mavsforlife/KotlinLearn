package com.victor.kotlinlearn.learn

/**
 * Created by victor on 2018/5/30.
 * Email: wwmdirk@gmail.com
 */
const val FLAG1 = 1
const val FLAG2 = 2

class CommonTypeLearn {
    var i: Int = 7

    var d: Double = i.toDouble()
    var c: Char = '2'

    var c2i: Int = c.toInt()

    var bitWiseOr = FLAG1 or FLAG2
    var bitWiseAnd = FLAG1 and FLAG2

    val i2 = 12
    var i3 = 13//int

    val iHex = 0x0f//16进制
    val iL = 3L//long


    val s = "example"

    fun testIterator(s: String) {
        for(c in s) {
            print(c)
        }
    }

}