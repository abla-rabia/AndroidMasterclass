package com.example.bankaccount

fun main (){
    var anotherUser=1
    println("Welcome to the bankAccount machine ! ")
    print("Enter your full name : ")
    val fullname= readln()
    println("Enter your balance : ")
    var balance= readln().toDouble()
    val user=BankAccount(fullname,balance)
    println("Congratulations! we've created for you a new accont ! ")
    do {
    println("What do you want to do ? Select one action :")
    println("-----------------------------------")
    println("| 1-get your balance .             |")
    println("| 2-deposit money .                |")
    println("| 3-withdraw money .               |")
    println("| 4-see your transactions History .|")
    println("| 5-Quit .                         |")
    println("-----------------------------------")
    var choice = readln().toInt()
    when (choice){
        1 -> {
            user.acctBalance()
        }
        2 ->{
            print("Enter the ammount : ")
            var amount= readln().toDouble()
            user.deposit(amount)
        }
        3 -> {
            print("Enter the ammount : ")
            var amount= readln().toDouble()
            user.withdraw(amount)
        }
        4 -> {
            user.seeTransactionHistory()
        }
    }
    }while (choice!=5)
}