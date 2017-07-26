package com.sathya.de

object OverridingMF extends App {

}

class ArrayyElement(conts: Array[String]) extends Element {
  val contents: Array[String] = conts
}
//Defining parametric fields

class ArraElement(
  val contents: Array[String]) extends Element

class ArrElement(x123: Array[String]) extends Element {
  val contents: Array[String] = x123
}

class Cat {
  val dangerous = false
}
class Tiger(
  override val dangerous: Boolean,
  private var age: Int) extends Cat
  
class Tiger1(param1: Boolean, param2: Int) extends Cat {
override val dangerous = param1
private var age = param2
}