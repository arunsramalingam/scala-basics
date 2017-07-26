package com.sathya.de
import scala.io.Source
object FileIo extends App {
  val args1 = new Array[String](3)
  args1(0) = "input.txt"
  /*args1(1) = ", "
  args1(2) = "world!\n"*/
  if (args1.length > 0) {
    for (line <- Source.fromFile(args1(0)).getLines())
      println(line.length + " " + line)
    var maxWidth = 0
    val list1 = Source.fromFile(args1(0)).getLines().toList
    for (line1 <- list1)
      maxWidth = maxWidth.max(widthOfLength(line1))

    println("maximum width is " + maxWidth)
    val longestLine = list1.reduceLeft(
      (a, b) => if (a.length > b.length) a else b)
    val maxWidth1 = widthOfLength(longestLine)
    for (line2 <- list1) {
      val numSpaces = maxWidth - widthOfLength(line2)
      val padding = " " * numSpaces
      println(padding + line2.length + " | " + line2)
    }
  } else
    Console.err.println("Please enter filename")

  def widthOfLength(s: String) = s.length.toString.length

}