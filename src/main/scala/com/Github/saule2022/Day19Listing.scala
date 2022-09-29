/*

package com.Github.saule2022

import com.Github.saule2022.GutenbergUtil.{getAuthor, getTitle}
object Day19Listing extends App{

  val info = Util.getLinesFromFile("src/resources/webPages.txt")
  val zwi = info.zipWithIndex
  //var index=0
  for ((url,i)  <-info.zipWithIndex) {
    println(url)
    //index=i
    println(i)
    val text=Util.getTextFromWeb(url)
    //val files = Util.getTextFromWeb(url)
    //val rowCount:Int = rows.length
    //val lines=Util.getLinesFromFile(url)
    //def save()
    val author:String =getAuthor(text:Array[String])

    //println(files.mkString)
    //println(lines.mkString)
    println(author)
    println(text.take(2000))
    //def save(dst:String="",folder:String="src/resources/texts"):String={

  //val lines=Util.getLinesFromFile(url)
  //val author=getAuthor(lines)
  //println(text)
}
*/

