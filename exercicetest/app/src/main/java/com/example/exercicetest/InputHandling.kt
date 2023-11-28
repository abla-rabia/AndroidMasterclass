package com.example.exercicetest

fun main (){
    println("Please enter a number:")
    var inputString=readln()
    val inputNumber=inputString.toInt()
    val multiplier = 5
    val result = inputNumber*multiplier
    println("the result is : $result")
}