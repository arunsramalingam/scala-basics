package com.sathya.de

object CollectionProduce extends App{


//Producing a new collection
  val filesHere = (new java.io.File(".")).listFiles
  def scalaFiles =
    for {
      file <- filesHere
      if file.getName.endsWith(".txt")
    } yield file
}