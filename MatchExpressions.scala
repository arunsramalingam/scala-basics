package com.sathya.de

object MatchExpressions extends App {
  val args1: Array[String] = new Array[String](2);
 // args1(1)="salt"
  args1(0) = "salt"
  val firstArg = if (args1.length > 0) args1(0) else ""
  firstArg match {
    case "salt" => println("pepper")
    case "chips" => println("salsa")
    case "eggs" => println("bacon")
    case _ => println("huh?")
  }

}