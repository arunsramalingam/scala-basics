package com.sathya.de

object Closures extends App {

  var more = 1
  val addMore = (x: Int) => x + more
  println(addMore(10))

  val moreVal = 2
  val addMoreVal = (x: Int) => x + moreVal
  println(addMoreVal(10))

  more = 9999
  println(addMore(10))

  val someNumbers = List(-11, -10, -5, 0, 5, 10)
  var sum = 0

  someNumbers.foreach(sum += _)

  println("Sum value is ===>>> " + sum)

  def makeIncreaser(more: Int) = (x: Int) => x + more

  val inc1 = makeIncreaser(1)
  println(inc1.apply(1))

  val inc9999 = makeIncreaser(9999)
  println(inc9999.apply(1))
}