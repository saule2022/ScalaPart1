
package com.Github.saule2022

import com.Github.saule2022.GutenbergUtil.{getAuthor, getTitle}
import com.Github.saule2022.Util.getLinesFromFile
import java.io.{File, FileWriter}
import java.nio.file.{Files, Paths}
import scala.io.Source
//class should contain following constant fields to be passed as parameters upon creation:
// title:String = ""
// author:String = ""
// url:String = ""
// rows:Array[String] = Array[String]()
//class Book(title:String= "", author:String= "", url:String = "", rows:Array[String] = Array[String]()) {
//method
// def printStats():Unit={
//val files = Util.getTextFromWeb(url)
//val rowCount: Int = rows.length
//val lines = Util.getLinesFromFile(url)
//val wordCount = Util.getWordCountPerLine(lines).sum

// TODO upon creation in constructor (main body of class) - the following constant fields should be created
// rowCount:Int - rows.length
// wordCount:Int - contains a count of all the words in rows
//def save(dst:String="",folder:String="src/resources/texts/"):String={

/*val text = Util.getTextFromWeb(url)
//val dst="src/resources//"
Util.saveText(dst, text)
*/
/* val files=Util.getListOfFiles("src/resources")
 println(files.head)
 val lines=Util.getLinesFromFile(files.head.getPath)
 println(files.head.getName)
 println(files.head.getParent)
 val author=getAuthor(lines)
 println(author)
 println(getTitle(lines))*/

object Day19 extends App {
  val url = "https://www.gutenberg.org/cache/epub/67828/pg67828.txt"
  val dst = "src/resources/texts/The_Life_of_Mozart.txt"
  val text = Util.getTextFromWebAndSave(url, dst)
  val myLines = getLinesFromFile(dst)
  //println(text)
  println(url)

  val dir = "src/resources/texts"
  val files = Util.getListOfFiles(dir)
  val lines = Util.getLinesFromFile(files.head.getPath)
  println(files.head.getName)
  println(files.head.getParent)
  val author = getAuthor(lines)
  //println(author)
  // println(getTitle(lines))//
  val outputString = files.head +
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
  println(fileName, fileTitle)
}
/*
  val timenow = DateTimeFormatter.ofPattern(("yyyy-MM-dd_HH:mm")).format(LocalDateTime.now).replaceAll("-", "_").replace(":", "_")
  val file = fileName + " " + fileTitle + timenow + ".txt"
  println(file)
  val fileNo = file.replace(" ", "_")
  val filNoo = fileNo
  println(fileNo)
  val dstpath1 = dir + fileNo
  //val dstPath:String="\"" ++dir++fileNo++ "\""

  // println(dstPath)
  val eg = "src/resources/texts/A._Conan_D_Adventures_of_S.txt"
  //println(dstPath=="src/resources/texts/A._Conan_D_Adventures_of_S.txt")
  Util.saveText(dstpath1, outputString)
}


  //println(dstPath=="\"" ++dir++fileNo++ "\"")
  //def webReader(filePath: String = "src/resources/webPages.txt"): String = {
  //val filePath = "src/resources/webPages.txt"
  //val bookArray = for (file <- files) yield {
  //  val info = Util.getLinesFromFile(filePath)
  // val zwi = info.zipWithIndex
  // println(zwi.mkString)
  //var index=0
  // for ((url, i) <- info.zipWithIndex) {
  //println(url)
  //index=i
  //println(i)
  // }

  //Book(title, author, url, rows)

    // println(info(0).mkString)

    //println(webReader(filePath ="src/resources/webPages.txt" ).)

*/





