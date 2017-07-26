package com.sathya.de

import scala.collection.mutable.Map

object singletonbj extends App{
  private val cache = Map[String, Int]()
  calculate("Hi1")
  def calculate(s: String): Int =
    if (cache.contains(s))
      cache(s)
    else {
      val acc = new ChecksumAccumulator
      for (c <- s)
        acc.add(c.toByte)
      val cs = acc.checksum()
      cache += (s ->
        cs)
      cs

    }
}