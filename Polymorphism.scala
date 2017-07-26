package com.sathya.de

object Polymorphism extends App {
  val uniformBean = new UniformElementDemo
  uniformBean.invokeDemo(new ArrayElementDemo)
  uniformBean.invokeDemo(new UniformElementDemo)
  uniformBean.invokeDemo(new LineElementDemo)
  //arrayElementDemo.invokeDemo(new ElementDemo)//class ElementDemo is abstract; cannot be instantiated
  /*val uniformElementDemo = new UniformElementDemo
  uniformElementDemo.invokeDemo(new ArrayElementDemo)
  val arrayElementDemo = new UniformElementDemo
  arrayElementDemo.invokeDemo(new ArrayElementDemo)*/
}

abstract class ElementDemo {
  def demo() {
    println("ElementDemo's implementation invoked")
  }
}
class ArrayElementDemo extends ElementDemo {
  override def demo() {
    println("ArrayElementDemo's implementation invoked")
  }
}
class LineElementDemo extends ArrayElementDemo {
  override def demo() {
    println("LineElementDemo's implementation invoked")
  }
}
// UniformElement inherits Element�s demo
class UniformElementDemo extends ElementDemo {
  def invokeDemo(e: ElementDemo) {
    e.demo()
  }
}