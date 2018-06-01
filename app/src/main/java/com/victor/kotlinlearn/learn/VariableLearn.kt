package com.victor.kotlinlearn.learn

import com.victor.kotlinlearn.model.Forecast
import java.util.*

/**
 * Created by victor on 2018/5/31.
 * Email: wwmdirk@gmail.com
 */
class VariableLearn {
    //var 可变
    //val 不可变
    //实例化之后不能再去改变它的状态，如果需要一个这个对象修改之后的版本，就会再创建一个新的对象
    //在Kotlin中如果我们想使用不可变性，编码时思考的方式要有一些改变。一个重要的概念是：尽可能的使用 val
    //除了个别情况(特别是在Android中，有很多类我们是不会直接调用构造函数的)，大多数时候是可以的。
    //之前提到的额另一件事是，我们通常不需要去指明类的类型，它会自动从后面分配的语句中推断出来，这样可以让代码
    //更加清晰和快速修改。以下是例子

    val s = "Example"//string
    val i = 23//int

    //如果需要指定更多的泛型类型，则需要指定

    val a: Any = 23

    val f1 = Forecast(Date(), 27.5f, "Shinny")
    //映射对象到变量中
    private fun testMapVariable() {
        val (date, temperature, details) = f1
    }
}