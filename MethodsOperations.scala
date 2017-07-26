package com.sathya.de

object MethodsOperations extends App {

  val sum = 1 + 2
  println("Value of 1 + 2 is " + sum)

  val sumMore = (1).+(2)
  println("Value of (1).+(2) is " + sumMore)

  val longSum = 1 + 2L
  println("Value of 1 + 2L is " + longSum)

  val s = "Hello, world!"
  println("Value of s is " + s)

  println(" Index of o is " + s.indexOf('d'))

  println(" Index of H is " + s.indexOf('H'))
  println(" Index of o is " + s.indexOf('o'))

  println(s toLowerCase)

  println(s toUpperCase)
  
  def salt() = { /*println("salt");*/ false }
  
  def pepper() = { /*println("pepper");*/ true }
  
  println(pepper() && salt())
  println(pepper() || salt())
  
  
//Bitwise operations

  
}