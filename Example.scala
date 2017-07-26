package com.sathya.de
object Example extends App {

  val args1: Array[String] = new Array[String](0)
  println("<<<<============= Importing a file using IF LOOP ==============>>>>")
  println("Is Directory is Empty " + args1.isEmpty)
  //If Loop
  var filename = "default.txt"
  if (!args1.isEmpty)
    filename = args1(0)
  print("File Name is " + filename)
  val filename1 =
    if (!args.isEmpty) args(0)
    else "def"
  println(filename1)
  println(if (!args.isEmpty) args(0) else "default.txt")

  //While Loop Is  
  println("============= GCD AND While LOOP==============")
  val gcdofXandY = gcdLoop(2, 4)
  println(gcdofXandY)

  def gcdLoop(x: Long, y: Long): Long = {
    var a = x
    var b = y
    var d = 0;
    while (a != 0) {
      val temp = a
      a = b % a
      b = temp
    }
    b
  }
  // For Loop expressions ==>> Swiss army knife of iteration.
  println("============= Listing all files inside an Directory ==============")
  val filesHere = (new java.io.File(".")).listFiles
  for (file <- filesHere)
    println(file)

  println("============= Iterate through numbers==============")
  //till 4 iterate it
  for (i <- 1 to 4)
    println("Iteration " + i)
  //till 3 iterate it  
  for (i <- 1 until 4)
    println("Iteration " + i)

  //For and If in file sharing

  val filesHere1 = (new java.io.File(".txt")).listFiles
  for (
    file <- filesHere if file.getName.endsWith(".txt")
  ) println(file)

  for (file <- filesHere)
    if (file.getName.endsWith(".txt"))
      println("For Enhanced Loop " + file)

  //Multiple if conditions checking in the given path 
  for (
    file <- filesHere if file.isFile if file.getName.endsWith(".txt")
  ) println(file)

  // Mid-stream variable bindings
  
  
  
  
  
  
  
  
  
  
  

  
  
  
  
  
  
  
  

  //Nested iteration      

  /* def fileLines(file: java.io.File) =
    scala.io.Source.fromFile(file).getLines().toList
  def grep(pattern: String) =
    for (
      file <- filesHere1 if file.getName.endsWith(".txt");
      line <- fileLines(
        file) if line.trim.matches(pattern)
    ) println(file + ": " + line.trim)
  grep(".*txt.*")*/

  // println("============= do-while LOOP==============")

  /*  var line = "123"
  do {
    println(line)
    line = readLine()
    println("Read: " + line)
  } while (line != "")
*/
  //For expressions

}