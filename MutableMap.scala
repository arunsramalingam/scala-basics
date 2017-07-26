package com.sathya.de

import scala.collection.mutable.Map

object MutableMap extends App {

  val treasureMap = Map[Int, String]()
  treasureMap += (1 -> "Go to island.")
  treasureMap += (2 -> "Find big X on ground.")
  treasureMap += (3 -> "Dig.")
  println(treasureMap(2))

  val romanNumeral = Map(1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V")

  println(romanNumeral(4))

  def printArgs(args: Array[String]): Unit = {
    var i = 0
    while (i < args.length) {
      println(args(i))
      i += 1
    }
  }

  val res = formatArgs(Array("zero", "one", "two"))
  println("Resopnsive Response is "+res)
  def printArgsFor(args: Array[String]): Unit = {
    for (arg <- args)
      println(arg)
  }
  def printArgsForEach(args: Array[String]): Unit = {
    args.foreach(println)
  }

  def formatArgs(args: Array[String]) = args.mkString("\n")

}