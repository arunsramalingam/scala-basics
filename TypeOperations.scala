package com.sathya.de

object TypeOperations extends App {

  //Integer literals
  println("============== Integer Variables ================")
  val hex = 0x5
  println("Value of 0x5 is " + hex)

  val hex2 = 0x00FF
  println("Value of 0x00FF is " + hex2)

  val magic = 0xcafebabe
  println("Value of 0xcafebabe is " + magic)

  val prog = 0XCAFEBABEL
  println("Value of 0XCAFEBABEL is " + prog)

  val tower = 35L
  println("Value of 35L is " + tower)

  val of = 31l
  println("Value of 31l is " + of)

  val little: Short = 367
  println("Value of 367 is " + little)

  val littler: Byte = 38
  println("Value of 38 is " + littler)

  //Floating point literals
  println("============== Floating Point Variables ================")
  val big = 1.2345
  println("Value of 1.2345 is " + big)

  val bigger = 1.2345e1
  println("Value of 1.2345e1 is " + bigger)

  val biggest = 123E45
  println("Value of 123E45 is " + biggest)

  val littleFloat = 1.2345F
  println("Value of 1.2345F is " + littleFloat)

  val littleBigger = 3e5f
  println("Value of 3e5f is " + littleBigger)

  val anotherDouble = 3e5
  println("Value of 3e5 is " + anotherDouble)

  val yetAnother = 3e5D
  println("Value of 3e5D is " + yetAnother)

  //Character literals
  println("============== Character Variables ================")

  val a = 'A'
  println("Value of A is " + a)
  
  //The octal number must be between '\0' and '\377'.
  //Unicode character code point for the letter A is 101 octal.

  val c = '\101'
  println("Value of \101 is " + c)

  /*Unicode character consisting of four hex digits and preceded by a as in:*/
  val d = '\u0041'
  println("Value of \u0041 is " + d)

  val f = '\u0044'
  println("Value of \u0044 is " + f)

  val B\u0041\u0044 = 1
  println("Value of 1 is " + B\u0041\u0044)

  val backslash = '\\'
  println("Value of backslash is " + backslash)

  // String literals
  println("============== String Variables ================")

  val hello = "hello"
  println("Value of hello is " + hello)
  val escapes = "\\\"\'"
  println("Value of escapes is " + escapes)
  println("""|Welcome to Ultamix 3000.
                |Type "HELP" for help.""".stripMargin)
  println("""|Welcome to Ultamix 3000.
                |Type "HELP" for help.""")

  //Symbol literals
println("============== Symbol Variables ================")
  def updateRecordByName(r: Symbol, value: Any) {
    // code goes here
    println(r + " - - " + value)
  }

  updateRecordByName('favoriteAlbum, "OK Computer")

  val s = 'aSymbol
  println(s.name)

  //Boolean literals
println("============== Boolean Variables ================")

  val bool = true
  println(bool)
  
  val fool = false  
  println(fool)

}