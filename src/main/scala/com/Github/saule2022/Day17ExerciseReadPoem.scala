package com.Github.saule2022
import scala.collection.mutable.ArrayBuffer
import scala.io.Source
object Day17ExerciseReadPoem extends App {

  //TODO read stopping by poem from src/resources/stopping_by.txt
  //TODO get poem name - it is the first line
  //TODO get poet - it is in the 2nd line but we want just the poet

  //TODO Get all lines which contain "woods" somewhere in the text
  //so instead of startsWith we use contains
  val filePath="/Users/daivadaugelaite/IdeaProjects/Day15/src/resources/stopping_by.txt"

  //  val absoluteFilePath="/Users/daivadaugelaite/IdeaProjects/Day15/src/resources/stopping_by.txt"
  val relativeFilePath="src/resources/stopping_by.txt"

  val myPoem = Source.fromFile(filePath) //so we turn a stream of characters into one big String

  // println(myPoem)

  val myPoemLines = Source.fromFile(filePath).getLines.toArray
  //println(myPoemLines)
  //for (line <- myPoemLines) println(line)

  def getLinesFromFile(src: String):Array[String] = {
    val bufferedSource = Source.fromFile(src)
    val lines = bufferedSource.getLines().toArray
    bufferedSource.close()
    lines
  }
  val maxLines = 1
  val myLines = getLinesFromFile(relativeFilePath)
  //myLines.slice(0,maxLines).foreach(println)
  //val poetName=myLines(1).drop(3).mkString
  val poemName = myLines.head
  println(s"Poem name: $poemName\n")
  // One method:
  val poetName = myLines(1).drop(3)

  // Another method:
  val lengthOfSecondLine:Int = myLines(1).length
  //  val poetName = text(1).slice(3,lengthOfSecondLine) //so we slice from 4th character to the end
  println(s"Poet name: $poetName\n")


  //  val poetNames = myLines(1).split(" ") //so here I split by single whitespace
  val poetNames = myLines(1).split(" +") //so this was real regex I said I want to split by 1 or more whitespace
  println(poetNames.mkString("|"))
  //we would need to check if we got anything meaning
  val middleName = poetNames(1) //so 2nd word in the 2nd line
  println(s"Poet's first name is: $middleName")

  //wood

  val woodLines = myLines.filter(_.contains("woods"))
  woodLines.foreach(println)

  val woodsLines2 = for (line <- myLines if line.contains("woods")) yield line
  println("Lines with the word 'woods':\n")
  woodsLines2.foreach(println)

  //alternative way to filter what we need
  val woodsLines=myLines.filter(_.contains("woods")).map(_.toUpperCase)
  woodsLines.foreach(println)
  //for building longer strings we might want to use a string buffer instead of creating a string each time
  //here are some good examples

  //https://www.baeldung.com/scala/stringbuilder
  val outputString = myLines.head +
    "\n" +
    poetName +
    "\n" +
    woodLines.mkString("\n")

  //for building longer strings we might want to use a string buffer instead of creating a string each time
  //here are some good examples

  //https://www.baeldung.com/scala/stringbuilder

  val stringBuilder = new StringBuilder()
  stringBuilder ++= myLines.head
  stringBuilder += '\n' //for single characters  of course ++= "\n" would work as well
  stringBuilder ++= poetName
  stringBuilder ++= "\n"
  stringBuilder ++= woodLines.mkString("\n")

  println("WE built a string, this is recommended for longer texts")
  println(stringBuilder.mkString)
  val dstPath="src/resources/texts/woods.txt"



  Util.saveText(dstPath,outputString)

  val myBuffer = ArrayBuffer[String]()
  myBuffer += myLines.head
  myBuffer += poetName
  myBuffer ++= woodLines //we are adding another array

  Util.saveLines(dstPath, myBuffer.toArray)

  //we can also append to an already existing file
  Util.saveLines(dstPath, Array("*"*30, "Hurray","hurray"), append = true)
  Util.saveLines(dstPath, Array("*"*30, "aha","oho"),
    append = true,
    lineEnd = "\n\uD83D\uDE05\n") //so this is unicode for a smiley takes 4 bytes actually using \u



}