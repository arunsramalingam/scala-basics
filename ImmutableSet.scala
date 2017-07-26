package com.sathya.de
import scala.collection.immutable.HashSet
object ImmutableSet extends App{

  val hashSet = HashSet("Tomatoes", "Chilies")
  println(hashSet + "Coriander")
}
/* Advice To Scala Programmers
 * A balanced attitude for Scala programmers
 
Prefer vals, immutable objects, and methods without side effects.
Reach for them first. Use vars, mutable objects, and methods with side
effects when you have a specific need and justification for them.*/