package com.sathya.de

object BottomTypes extends App {
  //scala.Null and scala.Nothing.
  def error(message: String): Nothing =
    throw new RuntimeException(message)
  def divide(x: Int, y: Int): Int =
    if (y != 0) x / y
    else error("can't divide by zero")
  error("s")
  divide(1,0)
}