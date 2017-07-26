package com.sathya.de

object ObjectEquality extends App {
  /*This is accomplished with a very simple
rule: first check the left side for null, and if it is not null, call the equals
method.*/
  /*How Scala�s == differs from Java�s
In Java, you can use == to compare both primitive and reference types.
On primitive types, Java�s == compares value equality, as in Scala. On
reference types, however, Java�s == compares reference equality, which
means the two variables point to the same object on the JVM�s heap.
Scala provides a facility for comparing reference equality, as well,
under the name eq. However, eq and its opposite, ne, only apply to
objects that directly map to Java objects. The full details about eq and
ne are given in Sections 11.1 and 11.2. Also, see Chapter 30 on how to
write a good equals method.*/
  println(1 == 2)
  println(1 != 2)
  println(List(1, 2, 3) == List(1, 2, 3))
  println(List(1, 2, 3) == List(4, 5, 6))
  println(1 == 1.0)
  println(List(1, 2, 3) == "hello")
  println(List(1, 2, 3) == null)
  println(null == List(1, 2, 3))
  println(("he" + "llo") == "hello")

}