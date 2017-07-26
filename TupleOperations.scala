package com.sathya.de

object TupleOperations {
  def main(args: Array[String]): Unit = {

    //Tuple2 Example
    val pair2 = (99, "Luftballons")
    println(pair2._1)
    println(pair2._2)

    //Tuple6 Example
    var pair6=('u', 'r', "the", 1, 4, "me")
    println(pair6._1)
    println(pair6._2)
    println(pair6._3)
    println(pair6._4)
    println(pair6._5)
    println(pair6._6)
    
    var pair5=('u', 'r', "the", 1, 4)
    
  }
}