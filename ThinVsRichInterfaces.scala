package com.sathya.de

object ThinVsRichInterfaces extends App {
  val charImpl = new CharImpl
  println(charImpl.charAt('2'))
  println(charImpl.length)
}

trait CharSequence {
  def charAt(index: Int): Char
  def length: Int
  // def subSequence(start: Int, end: Int): CharSequence
  def toString(): String
}

class CharImpl extends CharSequence {
  override def charAt(index: Int): Char = {
    val x = '2'
    return x
  }

  override def length: Int = {
    val x = 2
    return 2
  }

  /* def subSequence(start: Int, end: Int): CharSequence = {
   val x=2
    return 2,2
  }*/

}