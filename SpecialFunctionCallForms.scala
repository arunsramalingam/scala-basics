package com.sathya.de

object SpecialFunctionCallForms extends App {

  def echo(args: String*) =
    for (arg <- args)
      println(arg)
  echo()
  echo("one")
  echo("hello", "world!")

  val arr = Array("What's", "up", "doc?")

  //echo(arr) type mismatch; found : Array[String] required: String
  echo(arr: _*)
}