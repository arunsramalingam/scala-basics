package com.sathya.de

import scala.collection.mutable.ArrayBuffer

object TraitsStackableMods extends App {

  val queue = new BasicIntQueue

  queue.put(2)
  queue.put(3)

  println(queue.get())
  println(queue.get())
  val myQueue = new MyQueue
  myQueue.put(2)
  println("Doubling Content is ==>> " + myQueue.get())
}
//Abstract class IntQueue.
abstract class IntQueue {
  def get(): Int
  def put(x: Int)
}
//A BasicIntQueue implemented with an ArrayBuffer
class BasicIntQueue extends IntQueue {
  private val buf = new ArrayBuffer[Int]
  def get() = buf.remove(0)
  def put(x: Int) { buf += x }
}

//The Doubling stackable modification trait
trait Doubling extends IntQueue {
  abstract override def put(x: Int) { super.put(2 * x) }
}

class MyQueue extends BasicIntQueue with Doubling

