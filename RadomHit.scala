package com.sathya.de
object RadomHit extends App {
  
    val rand = math.random * 100
    val greater5 = if (rand <= 5) true else false
    val isBlue = if (greater5) "blue" else "red"
  println("Random Value is ==>> "+ rand)
  println("Greater5 is ==>> "+ greater5)
  println("isBlue is ==>> " + isBlue)
}