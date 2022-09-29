package com.Github.saule2022
import com.Github.saule2022.GutenbergUtil.{getAuthor, getTitle}
import com.Github.saule2022.Util.getLinesFromFile
import com.sun.org.apache.xalan.internal.lib.ExsltDatetime.{date, dateTime, time}
import java.time

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.io.{File, PrintWriter}

object Day192 extends App {
  val url = "https://www.gutenberg.org/cache/epub/67828/pg67828.txt"
  val dst = "src/resources/texts/The_Life_of_Mozart.txt"
  val text = Util.getTextFromWebAndSave(url, dst)
  val myLines = getLinesFromFile(dst)
  //println(text)
  println(url)
  val dir = "src/resources/texts"
  val files = Util.getListOfFiles(dir)
  println(files)
  val lines = Util.getLinesFromFile(files.head.getPath)
  //println(files.head.getName)
  //println(files.head.getParent)
  val author = getAuthor(lines)
  println(author)
  // println(getTitle(lines))//
  /*  val outputString = files.head +
      "\n" +
      author +
      "\n" +
      getTitle(lines) +
      "\n" + "\n" + "\n" +
      lines.mkString("\n")
    println(outputString)
    //Util.saveText("src/resources/texts/",outputString)
    //val fileName=author.slice(0,10)
    val fileName = author
    //val fileTitle=getTitle(lines).slice(0,15)
    val fileTitle = getTitle(lines)
    println(fileName, fileTitle)*/
}
