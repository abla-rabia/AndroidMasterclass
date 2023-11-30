package com.example.classesexercice

fun main(){
    val myBook=Book()
    println("title : ${myBook.title} | author : ${myBook.author} | year : ${myBook.yearPublished}")
    val customBook=Book("way to Quran","Ibrahim Ibn Amr Al Sakaran",2018)
    println("title : ${customBook.title} | author : ${customBook.author} | year : ${customBook.yearPublished}")

}