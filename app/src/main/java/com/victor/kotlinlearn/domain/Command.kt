package com.victor.kotlinlearn.domain

/**
 * Created by victor on 2018/6/1.
 * Email: wwmdirk@gmail.com
 * 一切Kotlin函数都会返回一个值，如果没有指定，它就默认返回一个Unit类。
 * 所以如果我们想让Command不反回数据，我们可以指定他的类型为Unit
 */
interface Command<T> {

    fun execute(): T
}