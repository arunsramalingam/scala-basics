package com.sathya.de

object RationalNumber extends App {

  /* object-oriented
programming in Scala: class parameters and constructors, methods and operators,
private members, overriding, checking preconditions, overloading,
and self references.*/

  //rational number Normal Rational Number
  val oneHalf = new Rational1(1, 2)
  //rational number Normal with ToString() instead of println()
  val oneHalfToString = new RationalToString(1, 2)
  println(oneHalfToString)

  //Rational deep dive into it.after rational calculation
  val oneHalfAdd = new RationalAdd(1, 2)
  val twoThirds = new RationalAdd(2, 3)
  val sevensixth = oneHalfAdd add twoThirds
  println(sevensixth.numer)
  println(sevensixth.denom)
 // println(sevensixth)
  val lessertThanRationalNumber = oneHalfAdd lessThan twoThirds
  val greaterthanRationalNumber = oneHalfAdd greaterThan twoThirds
  val maximum = oneHalfAdd max twoThirds
  println(maximum)
  println(lessertThanRationalNumber)
  println(greaterthanRationalNumber)
}

//Class with Sample simple Rational number
class Rational1(n: Int, d: Int) {
  require(d != 0)
  println("Created " + n + "/" + d)
}

//Class with Sample Rational number ToString
class RationalToString(n: Int, d: Int) {
  require(d != 0)
  override def toString = n + "/" + d
}
//Class with Sample simple Rational Add number
class RationalAdd(n: Int, d: Int) {
  require(d != 0)
  val numer: Int = n
  val denom: Int = d
  override def toString = numer + "/" + denom
  def add(that: RationalAdd): RationalAdd =
    new RationalAdd(
      numer * that.denom + that.numer * denom, denom * that.denom)
  def lessThan(that: RationalAdd) =
  this.numer * that.denom < that.numer * this.denom 
  def greaterThan(that: RationalAdd) =
  this.numer * that.denom > that.numer * this.denom
  def max(that: RationalAdd) =
  if (this.lessThan(that)) that else this
}