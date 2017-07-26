package com.sathya.de

object MethodOverloading extends App {

  val numerVal=new RationalM(23,34)
  val denomVal=new RationalM(12,23)
  val numerValPlusDenomVal=numerVal+denomVal
  val numerValMinusDenomVal=numerVal-denomVal
  val numerValMulDenomVal=numerVal*denomVal
  val numerValDivideDenomVal=numerVal/denomVal
  val OverNumer=new RationalM(2)
  val OverDenom=new RationalM(1)
  val OverNumerPlusOverDenom= OverNumer + 2
  
  println("Numerator is "+OverNumerPlusOverDenom)
  println(numerValPlusDenomVal)
  println(numerValMinusDenomVal)
  println(numerValMulDenomVal)
  println(numerValDivideDenomVal)
}

class RationalM(n: Int, d: Int) {
  require(d != 0)
  private val g = gcd(n.abs, d.abs)
  val numer = n / g
  val denom = d / g
  def this(n: Int) = this(n, 1)
  def +(that: RationalM): RationalM =new RationalM(numer * that.denom + that.numer * denom, denom * that.denom)
  def +(i: Int): RationalM = new RationalM(
      numer + i * denom, denom)
  def -(that: RationalM): RationalM = new RationalM(numer * that.denom - that.numer * denom,denom * that.denom)
  def -(i: Int): RationalM = new RationalM(numer - i * denom, denom)
  def *(that: RationalM): RationalM = new RationalM(numer * that.numer, denom * that.denom)
  def *(i: Int): RationalM = new RationalM(numer * i, denom)
  def / (that: RationalM): RationalM = new RationalM(numer * that.denom, denom * that.numer)
  def / (i: Int): RationalM = new RationalM(numer, denom * i)
  override def toString = numer + "/" + denom
  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)
}