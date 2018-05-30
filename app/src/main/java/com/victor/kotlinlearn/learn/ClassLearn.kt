package com.victor.kotlinlearn.learn

import android.content.Context
import android.util.Log
import android.widget.Toast
import com.victor.kotlinlearn.MainActivity

/**
 * Created by victor on 2018/5/30.
 * Email: wwmdirk@gmail.com
 */
class ClassLearn {
    //类有一个默认的唯一构造器，类名后写上参数即可，如果这个类没有
    //任何内容，可以省略大括号

    //初始化写在init块中
    class Class1Learn(name: String, id: Int) {
        var name: String? = null

        init {
            this.name = name + "111"
        }
    }

    open class ClassThatCanBeExtend(name: String)

    class SubClass(name: String) : ClassThatCanBeExtend(name)

    class SubClass2(name: String, id: Int) : ClassThatCanBeExtend(name) {

        var name: String? = null

        fun funTest() {
            Log.d("tag", "name is $name")
        }

        fun addTest(x: Int, y: Int): Int = x + y

        fun addTest2(x: Int, y:Int): Int {
            return x + y
        }

        fun toastTest(msg: String, length: Int = Toast.LENGTH_SHORT, context: Context) {
            Toast.makeText(context, msg, length).show()
        }

        fun niceToastTest(context: Context, msg: String, tag: String = "aaa", length: Int = Toast.LENGTH_SHORT) {
            Toast.makeText(context, "[$tag] $msg", length).show()
        }
    }
}

