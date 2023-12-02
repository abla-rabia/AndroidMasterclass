package com.example.listmanipulationexercice

fun main(){
    var fruitsList= mutableListOf<String>("Banana","Apple","Cherries","Strawberry","Orange")
    println(fruitsList)
    fruitsList.add("Kiwi")
    println(fruitsList)
    fruitsList.remove("Cherries")
    println(fruitsList)
    val hasApple = fruitsList.contains("Apple")
    if (hasApple)
        println("There is an apple in the list .")
    else
        println("No apple in the list .")
}