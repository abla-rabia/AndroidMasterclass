package com.example.bankaccount

class BankAccount(val accountHolder:String,var balance:Double) {
    private var transactionsHistory= mutableListOf<String>()
    fun acctBalance(){
        println("$accountHolder's balance is : $$balance" )
    }
    fun deposit(amount:Double){
        balance+=amount
        transactionsHistory.add("$accountHolder desposit $$amount")
    }
    fun withdraw(amount:Double){
        if (balance>=amount) {
            balance -= amount
            transactionsHistory.add("$accountHolder withdrew $$amount")
        }
        else
            println("You can not withdraw $$amount")
    }
    fun seeTransactionHistory(){
        for (transaction in transactionsHistory){
            println(transaction)
        }
    }

}