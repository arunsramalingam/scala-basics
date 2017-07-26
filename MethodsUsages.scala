package com.sathya.de
/* Methods in List and their usages*/
object Methodsusages {
  def main(args: Array[String]): Unit = {

    // List() or Nil The empty List
    List("Cool", "tools", "rule")
    //Creates a new List[String] with the three values "Cool", "tools", and "rule"

    val thrill = "Will" :: "fill" :: "until" :: Nil
    //Creates a new List[String] with the three values "Will", "fill", and "until"

    List("a", "b") ::: List("c", "d") //Concatenates two lists (returns a new List[String] with values "a", "b", "c", and "d")

    thrill(2) //Returns the element at index 2 (zero based) of the thrill list (returns "until")

    println(thrill.count(s => s.length == 4)) //Counts the number of string elements in thrill that have length 4 (returns 2)

    thrill.drop(2) //Returns the thrill list without its first 2 elements (returns List("until"))

    thrill.dropRight(2) //Returns the thrill list without its right most 2 elements (returns List("Will"))

    thrill.exists(s => s == "until") //Determines whether a string element exists in thrill that has the value "until" (returns true)

    thrill.filter(s => s.length == 4) //Returns a list of all elements, in order, of the thrill list that have length 4 (returns List("Will", "fill"))

    thrill.forall(s => s.endsWith("l")) //Indicates whether all elements in the thrill list end with the letter "l" (returns true)

    thrill.foreach(s => println(s)) //Executes the print statement on each of the strings in the thrill list (prints "Willfilluntil")

    thrill.foreach(print) //Same as the previous, but more concise (also prints "Willfilluntil")

    thrill.head //Returns the first element in the thrill list (returns "Will")

    thrill.init //Returns a list of all but the last element in the thrill list (returns List("Will", "fill"))

    thrill.isEmpty //Indicates whether the thrill list is empty (returns false)

    thrill.last //Returns the last element in the thrill list (returns "until")

    thrill.length //Returns the number of elements in the thrill list (returns 3)

    thrill.map(s => s + "y") //Returns a list resulting from adding a "y" to each string element in the thrill list
    //(returns List("Willy", "filly", "untily"))

    thrill.mkString(", ") // Makes a string with the elements of the list (returns "Will, fill, until")

    //thrill.(s => s.length == 4) //Returns a list of all elements, in order, of the thrill list except those that have
    //length 4 (returns List("until"))
    thrill.reverse //Returns a list containing all elements of the thrill list in reverse order (returns List("until", "fill", "Will"))
    //thrill.sort((s, t) => s.charAt(0).toLower < t.charAt(0).toLower)

    //Returns a list containing all elements of the thrill list in alphabetical order of the first character lowercased (returns List("fill", "until", "Will"))
    thrill.tail //Returns the thrill list minus its first element (returns List("fill", "until"))

  }
}