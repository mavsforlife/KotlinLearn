package com.victor.kotlinlearn.learn

/**
 * Created by victor on 2018/7/3.
 * Email: wwmdirk@gmail.com
 */
class NormalVariableLearn {

    companion object {
        val FLAG1 = 111
        val FLAG2 = 222
    }

    //数字类型不会自动转型，必须要做一个明确的类型转换
    val i: Int = 7
    val d: Double = i.toDouble()

    //字符不能直接作为一个数字处理，在需要时我们要把它们转换为一个数字
    val c: Char = 'c'
    val ci: Int = c.toInt()

    //位运算用"and"和"or"
    val bitwiseOr = FLAG1 or FLAG2
    val bitwiseAnd = FLAG1 and FLAG2

    //string可以像数组那样访问，并且被迭代
    val s = "example"
    val cInS = s[2]

    fun testIterator() {
        for(c in s) {
            print(c)
        }
    }

}