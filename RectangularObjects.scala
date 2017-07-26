package com.sathya.de

object RectangularObjects extends App {
  val rect = new Rectangle(new Point(1, 1),
    new Point(10, 10))
  println(rect.bottomRight.x)
  println(rect.bottomRight.y)
  println(rect.topLeft.x)
  println(rect.topLeft.y)
  println(rect.left)
  println(rect.right)
  println(rect.width)
}

class Point(val x: Int, val y: Int)
class Rectangle(val topLeft: Point, val bottomRight: Point) {
  def left = topLeft.x
  def right = bottomRight.x
  def width = right - left
  // and many more geometric methods...
}

abstract class Component1 {
  def topLeft: Point
  def bottomRight: Point
  def left = topLeft.x
  def right = bottomRight.x
  def width = right - left
  // and many more geometric methods...
}

trait Rectangular {
  def topLeft: Point
  def bottomRight: Point
  def left = topLeft.x
  def right = bottomRight.x
  def width = right - left
  // and many more geometric methods...
}
abstract class Component extends Rectangular {
  // other methods...
}
class Rectangle1(val topLeft: Point, val bottomRight: Point)
    extends Rectangular {
  // other methods...
}