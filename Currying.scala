package com.sathya.de

object Currying extends App {

  def plainOldSum(x: Int, y: Int) = x + y

  val normSum = plainOldSum(1, 2)
  println("Normal Sum is ===>>> " + normSum)
  def curriedSum(x: Int)(y: Int) = x + y

  //val curriedSum=curriedSum(1)(2)
  println("Curried Sum is ===>>> " + curriedSum(1)(2))

  def first(x: Int) = (y: Int) => x + y

  val second = first(1)

  val curriedSecondElement = second(2)

  println("Curried Elements are ===>>> " + curriedSecondElement)

  val onePlus = curriedSum(1)_

  val onePlusCurry = onePlus(2)

  println(onePlusCurry)
  val twoPlus = curriedSum(2)_

  val twoPlusCurry = twoPlus(2)

  println(twoPlusCurry)

}