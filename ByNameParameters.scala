package com.sathya.de

import java.io.File
import java.io.PrintWriter

object ByNameParameters extends App {

  def withPrintWriter(file: File)(op: PrintWriter => Unit) {
    val writer = new PrintWriter(file)
    try {
      op(writer)
    } finally {
      writer.close()
    }
  }

  val file = new File("date.txt")
  withPrintWriter(file) {
    writer => writer.println(new java.util.Date)
  }
  withPrintWriter(file) {
    writer => writer.println(new java.util.Date)
  }

  var assertionsEnabled = true
  def myAssert(predicate: () => Boolean) =
    if (assertionsEnabled && !predicate())
      throw new AssertionError
      
  def byNameAssert(predicate: => Boolean) =
    if (assertionsEnabled && !predicate)
      throw new AssertionError
      
  println(myAssert(() => 5 > 3))
  println(byNameAssert(5 > 3))
}






