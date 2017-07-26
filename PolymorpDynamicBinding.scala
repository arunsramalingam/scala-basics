package com.sathya.de

object PolymorpDynamicBinding extends App {

  val e1: Element = new ArrayElement(Array("hello", "world"))
  val ae: ArrayElement = new LineElement("hello")
  val e2: Element = ae
  val e3: Element = new UniformElement('x', 2, 3)

}

class UniformElement(
    ch: Char,
    override val width: Int,
    override val height: Int) extends Element {
  private val line = ch.toString * width
  def contents = Array.fill(height)(line)
}
