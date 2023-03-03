package com.spase_y.homeworkint0break

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

fun main2(){
    while (true){
        print("\nВведите любое число на клавиатуре: ")
        var number:Any? = readLine()
        number = number.toString().toInt()
        if(number == 0){
            println("Вы ввели 0 - THE END")
            break
        }
    }


}
fun main(){
    var result = sum (3,4)
    println(result)
}
fun sum (a:Int, b:Int):Int{
    return a + b
}




