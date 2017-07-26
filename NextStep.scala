package com.sathya.de

object valmsg {
  def main(args: Array[String]): Unit = {
    //Big Integer Iteration
    val big = new java.math.BigInteger("12345")
    println("Integer value of Big is " + big)

    //Array Iteration
    val greetStrings = new Array[String](3)
    greetStrings(0) = "Hello"
    greetStrings(1) = ", "
    greetStrings(2) = "world!\n"
    //Iterate and aray
    for (i <- 0 to 2)
      print(greetStrings(i))
    println("<<<======FOREACH EXAMPLE======>>>")
    greetStrings.foreach(println)

    println("<<<======GREETINGS1 EXAMPLE======>>>")
    val greetStrings1 = new Array[String](3)
    greetStrings1.update(0, "Hello")
    greetStrings1.update(1, ", ")
    greetStrings1.update(2, "world!\n")
    for (i <- 0 to (2))
      print(greetStrings1.apply(i))

    println("<<<======numNames ARRAY EXAMPLE======>>>")
    val numNames = Array("zero", "one", "two")
    numNames.foreach(println)
    /*  for (i <- 0 to 2)
      print(numNames(i))*/
    println("<<<======numNames2 ARRAY APPLY EXAMPLE======>>>")
    val numNames2 = Array.apply("zero", "one", "two")
    numNames2.foreach(println)
    /* for (i <- 0 to 2)
      print(numNames2(i))*/

    println("<<<======oneTwoThree LIST EXAMPLE======>>>")
    val oneTwoThree = List(1, 2, 3)
    oneTwoThree.foreach(println)
    
    
    println("<<<===Mutuated the List of List values using :::===>>>")
    //method named �:::� for list concatenation
    val oneTwo = List(1, 2)
    val threeFour = List(3, 4)
    val oneTwoThreeFour = oneTwo ::: threeFour
    println(oneTwo + " and " + threeFour + " were not mutated.")
    println("Thus, " + oneTwoThreeFour + " is a new list.")

    //Cons prepends a new element to the beginning of an existing list,
  println("<<<===Mutuated the List of List values using ::===>>>")
    val twoThree = List(2, 3)
    val one2hree = 1 :: twoThree
    
    println(oneTwoThree)
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
  }

}