package com.sathya.de

object AuxiliaryConstructors extends App {
  //In Scala, constructors other than the primary constructor are called auxiliary constructors
  val y = new RationalAux(3)
  println("Rational Value of an Whole 3 is" + y)
}
/*If you�re familiar with Java, you may wonder why Scala�s rules for constructors are a bit more restrictive than 
 * Java�s. In Java, a constructor must either invoke another constructor of the same class, or directly invoke
a constructor of the superclass, as its first action. In a Scala class, only the primary constructor can invoke a
 superclass constructor. The increased restriction in Scala is really a design trade-off that needed to be paid in
exchange for the greater conciseness and simplicity of Scala�s constructors compared to Java�s.*/
class RationalAux(n: Int, d: Int) {
  require(d != 0)
  val numer: Int = n
  val denom: Int = d
  def this(n: Int) = this(n, 1) // auxiliary constructor
  override def toString = numer + "/" + denom
  def add(that: RationalAux): RationalAux =
    new RationalAux(
      numer * that.denom + that.numer * denom,
      denom * that.denom)
}