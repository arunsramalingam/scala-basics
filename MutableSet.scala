package com.sathya.de
import scala.collection.mutable.Set
object SetO {
  /*  Scala then provides two subtraits, one for mutable sets and another for immutable
sets.*/
  def main(args: Array[String]): Unit = {

    var jetSet = Set("Boeing", "Airbus")
    jetSet += "Lear"
    println(jetSet.contains("Cessna"))
    println(jetSet.contains("Airbus"))
    println(jetSet.contains("Lear"))
    jetSet.foreach(println)

    val movieSet = Set("Hitch", "Poltergeist")
    movieSet += "Shrek"
    println(movieSet)
    
  }
}