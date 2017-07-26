package com.sathya.de

object ChecksumAccumulator extends App {

  val acc = new ChecksumAccumulator
  acc.add(1)
  val s = "hello"; println(s)
}

class ChecksumAccumulator {
  private var sum = 0
  def add(b: Int): Unit = {
    sum += b
    print(sum)
  }
  def checksum(): Int = {
    return ~(sum & 0xFF) + 1
  }
}