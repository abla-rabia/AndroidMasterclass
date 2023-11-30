package com.example.functionsexercices


fun main(){
    /*var choice =1
    var name =""
    var sugarCount=0
    var price=0
    while (choice==1){
        print("Name : ")
        name= readln()
        print("Number of sugar spoons : ")
        sugarCount= readln().toInt()
        price=makeCoffee(name, sugarCount)
        println("the price is : $price")
        print("Do you want more ? enter 1 to say yes :")
        choice= readln().toInt()
    }*/
    var numbers=listOf(1, 2, 3, 4, 5)
    println("the averga is ${calculateAverage(numbers)}")

}



// Define Function

fun makeCoffee(name:String,sugarCount : Int):Int{

    if (sugarCount==1 )
        println("Coffee with $sugarCount spoon of sugar for $name")
    else if (sugarCount==0)
        println("Coffee with no sugar for $name")
    else
        println("Coffee with $sugarCount spoons of sugar for $name")

    return (1000)

}
fun calculateAverage(numbers: List<Int>):Double{
    var s=numbers.sum()
    var average=s/numbers.size.toDouble()
    return average
}