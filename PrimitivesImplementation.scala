package com.sathya.de

object PrimitivesImplementation extends App {

  /*boolean isEqual (int x, int y) {
    return x == y;
  }
  System.out.println(isEqual(421, 421));*/
  /* boolean isEqual(Integer x, Integer y) {
return x == y;
}
System.out.println(isEqual(421, 421));*/

  def isEqual(x: Int, y: Int) = x == y
  println(isEqual(1, 2))
  println(isEqual(1, 1))

  val x = "abcd".substring(2)
  println(x)
  val y = "abcd".substring(2)
  println(y)

  val xy = new String("abc")
  val yx = new String("abc")

  println(x == y)
  println(x eq y)
  println(x ne y)
}