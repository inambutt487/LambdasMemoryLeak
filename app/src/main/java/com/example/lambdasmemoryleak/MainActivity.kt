package com.example.lambdasmemoryleak

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val c = Calculator()

        val listener = { sum: Int ->
            println("sum: $sum")
        }

        c.addListener(listener)
        c.removeListener(listener)
        println(c.sum(10, 20).toString())

        //listener is wrapped in MainKt$sam$test_Calculator_Listener$0(listener) each time before it is passed to addListener or removeListener, which then are two different Java objects.

//        val listener = Calculator.Listener {
//                sum: Int -> println("sum: $sum")
//        }
//        c.addListener(listener)
//        c.removeListener(listener)
//
//        Listener listener = (Listener)null.INSTANCE;
//        c.addListener(listener);
//        c.removeListener(listener);
    }
}