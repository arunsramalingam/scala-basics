package com.sathya.de

object PartiallyAppliedFunctions extends App {

  val someNumbers = List(-11, -10, -5, 0, 5, 10)
  someNumbers.foreach(println _)

  def sum(a: Int, b: Int, c: Int) = a + b + c
  val b = sum(1, _: Int, 3)

  println(sum(1, 2, 3))
  println("Sum of B is ===>>> " + b(3))
  
  
}