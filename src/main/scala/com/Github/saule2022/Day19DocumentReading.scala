package com.Github.saule2022

import com.Github.saule2022.GutenbergUtil.{getAuthor, getTitle}
import com.Github.saule2022.Util.getLinesFromFile

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

object Day19DocumentReading extends App {
  def saveFiles(src:String){
    val info = Util.getLinesFromFile(src)
    val folder="src/resources/texts/"
    for ((url,i)  <-info.zipWithIndex) {
      val dst = folder + i + ".txt"
      val text = Util.getTextFromWebAndSave(url, dst)
      val myLines = getLinesFromFile(dst)
      val files = Util.getListOfFiles(dst)
      val lines = Util.getLinesFromFile(files.head.getPath)
      val author = getAuthor(lines)
      val outputString = files.head +
        "\n" +
        author +
        "\n" +
        getTitle(lines) +
        "\n" + "\n" + "\n" +
        lines.mkString("\n")
      println(outputString)
      val fileName = author
      //val fileTitle=getTitle(lines).slice(0,15)
      val fileTitle = getTitle(lines)
      println(fileName, fileTitle)
      val timenow = DateTimeFormatter.ofPattern(("yyyy-MM-dd_HH:mm")).format(LocalDateTime.now).replaceAll("-", "_").replace(":", "_")
      val file = fileName + " " + fileTitle + timenow + ".txt"
      val fileNo = file.replace(" ", "_")
      val dstpath1 = src + fileNo
      Util.saveText(dstpath1, outputString)

    }
  }
  saveFiles("src/resources/website.txt")
}
