package com.sathya.de

object SimplifyingClientCode extends App {
  def containsNeg(nums: List[Int]): Boolean = {
    var exists = false
    for (num <- nums)
      if (num < 0)
        exists = true
    exists
  }

  def containsNegative(nums: List[Int]) = nums.exists(_ < 0)
  //  println(containsNeg1(List(-1, -2, -3, -4)))
  println(containsNegative(List(1, 2, 3, 4)))
  //println(containsNeg(List(-1, -2, -3, -4)))
  println(containsNeg(List(1, 2, 3, 4)))

  def containsOdd(nums: List[Int]): Boolean = {
    var exists = false
    for (num <- nums)
      if (num % 2 == 1)
        exists = true
    exists
  }
  println(containsOdd(List(4)))
  def containsOdd1(nums: List[Int]) = nums.exists(_ % 2 == 1)

  println(containsOdd1(List(4)))
}