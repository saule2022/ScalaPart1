package com.Github.saule2022

import com.Github.saule2022.GutenbergUtil.{getAuthor, getTitle}
//case class Book(fileName:String, author:String, title:String, textLines:Array[String]=Array[String]())

object Day18practice extends App {
  val files=Util.getListOfFiles("src/resources")
  println(files.head )
  val lines=Util.getLinesFromFile(files.head.getPath)
  println(files.head.getName)
  println(files.head.getParent)
  val author=getAuthor(lines)
  println(author)
  println(getTitle(lines))

  def getBooksFromFiles(files:Array[String]):Array[Book]={
    val bookArray=for(file<-files) yield {
      val lines=Util.getLinesFromFile(file)
      val author=getAuthor(lines)
      val title=getTitle(lines)
      Book(file, author,title, lines)
    }
    bookArray
  }
  val myBooks=getBooksFromFiles(files.map(_.getPath).toArray)
  println(myBooks.head)
  println(myBooks.last)
  println(myBooks.last.textLines.mkString("\n"))
}
