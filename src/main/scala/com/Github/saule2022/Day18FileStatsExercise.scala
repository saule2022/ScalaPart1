package com.Github.saule2022
import com.Github.saule2022.GutenbergUtil.{getAuthor, getTitle}
import com.Github.saule2022.Util.getLinesFromFile

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
object Day18FileStatsExercise extends App{
  //TODO download and save a text file of your choosing from gutenberg.org
  //Get Character Count (including whitespace)
  //Get Line Count
  //get Word Count
  //Get average Word Count in each text line

  //You can use the Util functions or maybe add some of your own if you want
  val url = "https://www.gutenberg.org/cache/epub/67828/pg67828.txt"
  val dst="src/resources/The_Life_of_Mozart.txt"

  val text = Util.getTextFromWebAndSave(url,dst)
  println(text.take(300))

  val lines = Util.getLinesFromFile(dst)
  val charCount = Util.getCharacterCount(lines)
  println(s"Total character count in are $charCount")
  val wordCount = Util.getWordCountPerLine(lines).sum
  //println(lines.mkString)
  println(s"Total word count  are $wordCount")
  val lineCount=lines.length
  println(s"Total line count  are $lineCount")
  val averWordInLine=wordCount*1.0/lineCount
  val roundWordInLine=Util.myRound(averWordInLine)
  println(s"Average word count  in line are  $roundWordInLine")



}
