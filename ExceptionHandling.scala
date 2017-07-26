package com.sathya.de
import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException
import java.net.URL
import java.net.MalformedURLException
object ExceptionHandling extends App {

  //Exception handling with try expressions
  //  Throwing exceptions

  // Catching exceptions

  /*First you acquire the resource. Then you start a try block in which you use the resource. Lastly, you close the resource 
 * in a finally block. This idiom is the same in Scala as in Java, however, in Scala you can alternatively employ a technique 
 * called the loan pattern to achieve the same goal more concisely.*/
  try {
    val f = new FileReader("input.txt")
    println(f.read())
    // Use and close file
  } catch {
    case ex: FileNotFoundException => // Handle missing file
    case ex: IOException => // Handle other I/O error
  }
  val Stringw=urlFor("http://www.google.com")
  println(Stringw)
  def urlFor(path: String) =
    try {
      new URL(path)
    } catch {
      case e: MalformedURLException =>
        new URL("http://www.scalalang.org")
    }
  def f(): Unit = try { println(1) } finally { println(2) }
  f()
  val n = 1
  val half =
    if (n % 2 == 0)
      n / 2
    else
      throw new RuntimeException("n must be even")

}