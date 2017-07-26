package com.sathya.de

object FactoryObjectEcample extends App {

  println(new ArrayElement(Array("hello")) above
    new ArrayElement(Array("world!")))

  println(new ArrayElement(Array("one", "two")) beside
    new ArrayElement(Array("one")))

}
object Element {
  def elem(contents: Array[String]): Element =
    new ArrayElement(contents)
  def elem(chr: Char, width: Int, height: Int): Element =
    new UniformElement(chr, width, height)
  def elem(line: String): Element =
    new LineElement(line)
}

import Element.elem
abstract class Element {
  def contents: Array[String]
  def width: Int =
    if (height == 0) 0 else contents(0).length
  def height: Int = contents.length
  def above(that: Element): Element =
    elem(this.contents ++ that.contents)
  def beside(that: Element): Element =
    elem(
      for (
        (line1, line2) <- this.
          contents zip that.contents
      ) yield line1 + line2)
  override def toString = contents mkString "\n"
}
