package com.example.rockpapperscissorsapp

fun main(){
    var ok="1"
    while (ok=="1") {
        println("Enter your choice : ")
        var playerChoice = readln()
        var randomNumper = (1..3).random()
        var computerChoice = ""
        when {
            randomNumper == 1 -> computerChoice = "Rock"
            randomNumper == 2 -> computerChoice = "Paper"
            randomNumper == 3 -> computerChoice = "Scissors"
        }
        println("Computer choice : $computerChoice")
        var winner = when {
            computerChoice == playerChoice -> "Tie"
            computerChoice == "Rock" && playerChoice == "Scissors" -> "Computer"
            computerChoice == "Scissors" && playerChoice == "Paper" -> "Computer"
            computerChoice == "Paper" && playerChoice == "Rock" -> "Computer"
            else -> "Player"
        }
        println("winner : $winner")
        print("Vould you like to continue ? Enter 1 to continue :")
        ok= readln()
    }
}