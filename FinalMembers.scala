package com.sathya.de

object FinalMembers extends App {
  val arrayElementFinal = new ArrayElementFinal
  val arrayElementFinall = new ArrayElementFinall
  
  arrayElementFinal.demo()
  arrayElementFinall.demo()
}
abstract class ElementFinal {
  def demo() {
    println("ElementDemo's implementation invoked")
  }
}
class ArrayElementFinal extends ElementFinal {
  final override def demo() {
    println("ArrayElementFinal's implementation invoked")
  }
}
final class ArrayElementFinall extends ElementFinal {
  override def demo() {
    println("ArrayElementFinall's implementation invoked")
  }
}