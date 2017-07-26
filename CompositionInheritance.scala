package com.sathya.de

object CompositionInheritance extends App {

}

abstract class ElementCompose {
  def contents: Array[String]

  //parameterless methods ==> empty-paren methods.
  def height: Int = contents.length
  def width: Int = if (height == 0) 0 else contents(0).length

}

class LineElementCompose(s: String) extends ElementCompose {
  val contents = Array(s)
  override def width = s.length
  override def height = 1
}

//Implementing above, beside, and toString
