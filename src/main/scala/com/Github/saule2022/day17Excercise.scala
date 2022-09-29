package com.Github.saule2022
import scala.collection.mutable.ArrayBuffer
import scala.io.Source
//TODO read stopping by poem from src/resources/stopping_by.txt
//TODO get poem name - it is the first line
//TODO get poet - it is in the 2nd line but we want just the poet

//TODO Get all lines which contain "woods" somewhere in the text
object day17Excercise extends App{
  val filePath="/Users/daivadaugelaite/IdeaProjects/Day15/src/resources/stopping_by.txt"
  val relativeFilePath="src/resources/stopping_by.txt"
  val bufferedLines = Source.fromFile(filePath)
  val myPoemLines=bufferedLines.getLines.toArray
  bufferedLines.close()

  val poemName = myPoemLines.head
  println(poemName)
  val poet=myPoemLines(1).drop(3)
  println(poet)
  myPoemLines.foreach(println)





}
