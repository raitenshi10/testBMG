package com.example.testbmg

fun main() {
 test(50)
}

fun test(n: Int) {
    for(i in 1..n) {
        when{
            i % 15 == 0 -> print("Backend FrontEnd,")
            i % 10 == 0 -> print("Backend, ")
            i % 5 == 0 -> print("BackEnd, ")
            i % 3 == 0 -> print("Frontend, ")

            else -> print("$i, ")
        }
    }
   
}