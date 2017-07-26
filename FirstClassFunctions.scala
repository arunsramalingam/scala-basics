package com.sathya.de

object FirstClassFunctions extends App {

  val someNumbers = List(-11, -10, -5, 0, 5, 10)
  someNumbers.foreach((x: Int) => println(x))
  someNumbers.filter((x: Int) => x > 0).foreach((x: Int) => println(x))
  someNumbers.filter((x: Int) => x < 0).foreach((x: Int) => println(x))
}