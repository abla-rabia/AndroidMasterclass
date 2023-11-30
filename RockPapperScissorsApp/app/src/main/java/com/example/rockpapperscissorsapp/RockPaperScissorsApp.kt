package com.example.rockpapperscissorsapp

fun main(){
    var ok="1"
    while (ok=="1") {
        println("Enter your choice : ")
        var playerChoice = readln().lowercase()
        var randomNumper = (1..3).random()
        var computerChoice = ""
        when {
            randomNumper == 1 -> computerChoice = "rock"
            randomNumper == 2 -> computerChoice = "paper"
            randomNumper == 3 -> computerChoice = "scissors"
        }
        println("Computer choice : $computerChoice")
        var winner = when {
            computerChoice == playerChoice -> "Tie"
            computerChoice == "rock" && playerChoice == "Scissors" -> "Computer"
            computerChoice == "scissors" && playerChoice == "Paper" -> "Computer"
            computerChoice == "paper" && playerChoice == "Rock" -> "Computer"
            else -> "Player"
        }
        println("winner : $winner")
        print("Vould you like to continue ? Enter 1 to continue :")
        ok= readln()
    }
}