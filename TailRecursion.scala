package com.sathya.de

object TailRecursion extends App {

  def boom(x: Int): Int =
    if (x == 0) throw new Exception("boom!")
    else boom(x - 1) + 1
  //boom(3)
  // Limits of tail recursion
  def isEven(x: Int): Boolean =
    if (x == 0) true else isOdd(x - 1)
  def isOdd(x: Int): Boolean =
    if (x == 0) false else isEven(x - 1)
    
  val funValue = nestedFun _
  def nestedFun(x: Int) {
    if (x != 0) {
      println(x); funValue(x - 1)
    }
  }

nestedFun(1)
}