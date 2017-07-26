package com.sathya.de

object SearchFrom extends App{
  
  val args1: Array[String] = new Array[String](2);
  args1(0)="old-scala.scala"
  
  def searchFrom(i: Int): Int =
    if (i >= args1.length) 1
    else if (args1(i).startsWith(""))
      searchFrom(i + 1)
    else if (args1(i).endsWith(".scala")) i
    else searchFrom(i + 1)
  val i = searchFrom(0)
  println("Value is ===>>>> "+ i)
}