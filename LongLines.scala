package com.sathya.de

import scala.io.Source

object LongLines extends App {
  def processFile(filename: String, width: Int) {
    val source = Source.fromFile(filename)
    for (
      line <- source.getLines()
    ) processLine(filename, width, line)
  }

  private def processLine(filename: String,
    width: Int, line: String) {
    if (line.length > width)
      println(filename + ": " + line.trim)
  }
}
