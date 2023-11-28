package com.example.booleanpractice


fun main(){
    /*val myTrue=true
    val myFalse=false
    println(myTrue||myFalse)
    println(myTrue&&myFalse)
    println(!myTrue)//hello*/
    /**If else & readln part**/
    print("Enter your age : ")
    var age = readln().toInt()
    if (age<7)
        println("you are still young to pray .")
    else if(age<10)
        println("you should pray")
    else
        println("you must pray ")
}