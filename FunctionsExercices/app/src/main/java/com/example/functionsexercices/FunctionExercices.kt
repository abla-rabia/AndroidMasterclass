package com.example.functionsexercices


fun main(){
    var choice =1
    var name =""
    var sugarCount=0
    while (choice==1){
        print("Name : ")
        name= readln()
        print("Number of sugar spoons : ")
        sugarCount= readln().toInt()
        makeCoffee(name, sugarCount)
        print("Do you want more ? enter 1 to say yes :")
        choice= readln().toInt()
    }

}



// Define Function

fun makeCoffee(name:String,sugarCount : Int){

    if (sugarCount==1 )
        println("Coffee with $sugarCount spoon of sugar for $name")
    else if (sugarCount==0)
        println("Coffee with no sugar for $name")
    else
        println("Coffee with $sugarCount spoons of sugar for $name")



}