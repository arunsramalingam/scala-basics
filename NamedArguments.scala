package com.sathya.de

object NamedArguments extends App {
  //Named arguments
  def speed(distance: Float, time: Float): Float = distance / time

  println(speed(100, 10))

  println(speed(distance = 100, time = 10))

  println(speed(time = 10, distance = 100))

  def printTime(out: java.io.PrintStream = Console.out) =
    out.println("time = " + System.currentTimeMillis())
  println(printTime())

  def printTime2(out: java.io.PrintStream = Console.out,
    divisor: Int = 1) =
    out.println("time = " + System.currentTimeMillis() / divisor)

  println(printTime2())
  println(printTime2(divisor = 1000))
}