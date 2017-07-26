package com.sathya.de

/*
 * Traits are a fundamental unit of code reuse in Scala. A trait encapsulates
method and field definitions, which can then be reused by mixing them into
classes.
 */
trait Philosophical {
  def philosophize() {
    println("I consume memory, therefore I am!")
  }
}

class Frog extends Philosophical {
  override def toString = "green"
  override def philosophize() {
    println("It ain't easy being " + toString + "!")
  }
}

object Hello extends App {
  val a = new Frog()
  val phil: Philosophical = a
  val phrog: Philosophical = new Frog
  println(a.toString())
  println(a.philosophize())
  println(phrog.philosophize())
}

class Animal
class FrogAnimal extends Animal with Philosophical {
  override def toString = "green"
}

class AnimalHasLegs
trait HasLegs
class FrogHasLegs extends AnimalHasLegs with Philosophical with HasLegs {
  override def toString = "green"
}
