package com.Github.saule2022

import scala.io.Source

object Day17Read extends App {
  //println("texts")
  //println(System.getProperty("user.dir"))

  val filePath="/Users/daivadaugelaite/IdeaProjects/Day15/src/resources/The_Life_of_Mozart.txt"
  //println(filePath)
  val relativeFilePath="src/resources/two_roads.txt"

  //for (line<-Source.fromFile(filePath).getLines())println(line)
  val MyPoem=Source.fromFile(relativeFilePath).mkString
  //println(MyPoem)
  val MyPoemLines=Source.fromFile(relativeFilePath).getLines.toArray
  //println(MyPoemLines)

  def getTextFromFile(src: String): String = {
    val bufferedSource = Source.fromFile(src) // think of as a stream od bytes
    val text = bufferedSource.mkString // we convert this stream into actual string
    bufferedSource.close() //important to close the file
    text
  }

  def getLinesFromFile(src: String): Array[String] = {
    val bufferedSource = Source.fromFile(src)
    val lines = bufferedSource.getLines().toArray
    bufferedSource.close()
    lines
  }
  val MyLines=getLinesFromFile(relativeFilePath)
  //  println(MyLines.mkString ("\n"))
  println(MyLines.slice(0,5).mkString("\n"))
  MyLines.slice(0,5).foreach(println)

  val andlines=MyLines.filter(_.startsWith("And"))
  andlines.foreach(println)

  val roadslines=MyLines.filter(_.contains("Roads"))
  roadslines.foreach(println)

  val endsWithComma2=for (line<-MyLines if line.contains("And")) yield line.toUpperCase()
  endsWithComma2.foreach(println)

  val endsWithComma=for (line<-MyLines if line.endsWith(",")) yield line.replace(",","_")
  endsWithComma.foreach(println)

}
