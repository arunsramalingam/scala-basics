package com.sathya.de

object TwoDLayoutLib extends App {
  //elem(s: String): Element
  val a=Array(1, 2, 3).toString
 println(a.length())
  println("abc".length)
  //new Element ==>> Class Element is Abstract; cannot be instantiated
}
abstract class Element1 {
  def contents: Array[String]
  //parameterless methods ==> empty-paren methods.
  def height: Int = contents.length
  def width: Int = if (height == 0) 0 else contents(0).length
 
}
