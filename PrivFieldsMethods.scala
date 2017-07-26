package com.sathya.de

object PrivFieldsMethods extends App {
  val valueDem = new RationalPrivate(66, 42)
  val valueNum = new RationalPrivate(55, 22)
  println(valueDem)
  println(valueNum)
  val valueDemPlusvalueNum=valueDem add valueNum
  println(valueDemPlusvalueNum)
}

class RationalPrivate(n: Int, d: Int) {
  require(d != 0)
  private val g = gcd(n.abs, d.abs)
  val numer = n / g
  val denom = d / g
  def this(n: Int) = this(n, 1) // Aux constructor for, If any one called for a rational number for a whole number.
  def add(that: RationalPrivate): RationalPrivate =
    new RationalPrivate(
      numer * that.denom + that.numer * denom,
      denom * that.denom)
  override def toString = numer + "/" + denom
  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)
}