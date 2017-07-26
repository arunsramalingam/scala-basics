package com.sathya.de

object ExtendingClasses extends App {
  val ae = new ArrayElement(Array("hello", "world"))
  println(ae.height)
  println(ae.width)
}

class ArrayElement(conts: Array[String]) extends Element {
def contents: Array[String] = conts
}

abstract class ElementN {
  def contents: Array[String]
  
  //parameterless methods ==> empty-paren methods.
  def height: Int = contents.length
  def width: Int = if (height == 0) 0 else contents(0).length
 
}
