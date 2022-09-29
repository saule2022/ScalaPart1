package com.Github.saule2022

import com.Github.saule2022.Util.{getLinesFromFile, getTextFromFile}

import scala.io.Source

object Day17ReadingTextFile extends App {
  println("Going to read some text files! ")
  //let's check our current working directory because we need to know to have correct relative path

  println(System.getProperty("user.dir"))
  //using Absolute Path first
  // Windows uses \ for separating folders - unfortunately \ is also used to escape some character \n \t
  // One solution would be to escape those \ -> \\
  val filePath="/Users/daivadaugelaite/IdeaProjects/Day15/src/resources/two_roads.txt"

  val absoluteFilePath="/Users/daivadaugelaite/IdeaProjects/Day15/src/resources/two_roads.txt"
  val relativeFilePath="src/resources/two_roads.txt"
  //for (line<-Source.fromFile(filePath)) println(line)

  //print all characters one by one
  //for (character <- Source.fromFile(filePath)) println(character) //turns out we just read a big string of characters...

  //print lines one by one
  //for (line <- Source.fromFile(filePath).getLines) println(line) //we want to read lines of text not single characters

  //we could save the whole file into a String
  val myPoem = Source.fromFile(filePath).mkString //so we turn a stream of characters into one big String

  println(myPoem)

  val myPoemLines = Source.fromFile(filePath).getLines.toArray //toArray because iterator was on demand lazy

  println("*"*40)
  println("Printing Poem line by line \n")

  for (line <- myPoemLines) println(line)


  val myText = getTextFromFile(relativeFilePath)
  println(myText)

  //TODO move me to Utilities


  val maxLines = 5
  println(s"FIRST $maxLines lines")
  val myLines = getLinesFromFile(relativeFilePath)
  myLines.slice(0,maxLines).foreach(println)
  //println(myLines.slice(0,5).mkString("\n"))
  //same result as previous operation but here we create the substring first, above we printed line by line
  println(myLines.slice(0,maxLines).mkString("\n")) //this should be slightly faster

  println("Lines starting with And")
  val andLines = myLines.filter(_.startsWith("And"))
  andLines.foreach(println)

  val roadsLines = myLines.filter(_.contains("roads")) //text can be anywhere in the line
  roadsLines.foreach(println)

  //alternative to filter is to use yield it is more flexible because you can also perform some mappings
  //with filter we would have to use map as well
  val endsWithComma = for (line <- myLines if line.endsWith(",")) yield line.toUpperCase
  endsWithComma.foreach(println)
  //val endsWithComma=for (line<-myLines if line.endsWith(",")) yield line.replace(",","_")
  //endsWithComma.foreach(println)

  val firstLine = myLines(0) //could also use myLines.head
  println(firstLine)
  println(myLines.head)

}
