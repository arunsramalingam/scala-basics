package com.sathya.de
import scala.io.Source

object FileIOAll extends App {

  val args1 = new Array[String](3)
  args1(0) = "input.txt"
  def widthOfLength(s: String) = s.length.toString.length
  if (args1.length > 0) {
    val lines = Source.fromFile(args1(0)).getLines().toList
    val longestLine = lines.reduceLeft(
      (a, b) => if (a.length > b.length) a else b)

    println("Longest Line is =====>>>>" + longestLine)
    val maxWidth = widthOfLength(longestLine)
    for (line <- lines) {
      val numSpaces = maxWidth - widthOfLength(line)
      val padding = " " * numSpaces
      println(padding + line.length + " | " + line)
    }
  } else
    Console.err.println("Please enter filename")
}