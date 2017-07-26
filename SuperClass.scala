package com.sathya.de

object SuperClass extends App {
  val strArray = new Array[String](3)
  strArray(0) = "hello sathyaraj"
  val t1 = new LineElement(strArray(0))
  println(t1)
}
class LineElement(s: String) extends ArrayElement(Array(s)) {
  override def width = s.length
  override def height = 1
  println(this.height)
  println(this.width)
}