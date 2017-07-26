package com.sathya.de

object TableMultiplication extends App {
  val a = 1;
  {
    val a = 2 // Compiles just fine
    println("a local ===>>> " + a)
  }
  println("a global ===>>> " + a)
  printMultiTable()
  def printMultiTable() {
    var i = 1
    // only i in scope here
    while (i <= 16) {
      var j = 1
      // both i and j in scope here
      while (j <= 16) {
        val prod = (i * j).toString
        // i, j, and prod in scope here
        var k = prod.length
        print(" ")
        // i, j, prod, and k in scope here
        while (k < 4) {
          // print(" ")
          k += 1
        }
        print(prod)
        j += 1
      }
      // i and j still in scope; prod and k out of scope
      println()
      i += 1
    }
    // i still in scope; j, prod, and k out of scope
  }
}