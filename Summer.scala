package com.sathya.de

import com.sathya.de.singletonbj.calculate
object Summer {
  def main(args: Array[String]) {
    val args1 = new Array[String](3)
    args1(0)="1"
    args1(1)="2"
    args1(2)="3"

    for (arg <- args1)
   //   println(arg + ": " + calculate(arg))
      println(arg)
    //  calculate(arg)
  }
}