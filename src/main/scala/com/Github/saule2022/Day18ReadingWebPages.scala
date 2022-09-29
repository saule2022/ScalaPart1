package com.Github.saule2022

object Day18ReadingWebPages extends App {
  //val url = "https://www.gutenberg.org/files/61262/61262-0.txt"
  val url = "https://www.gutenberg.org/files/48320/48320-0.txt"
  //val text = Util.getTextFromWeb(url) //we make a get request on the web resource
  println(text.take(1000))
  val dst = "src/resources/ChristieA_Poirot_Investigates.txt"
  //val dstPath = "src/resources/texts/DoyleAC_Adventures_of_Sherlock_Holmes.txt"
  //Util.saveText(dstPath, text)
  val text = Util.getTextFromWebAndSave(url,dst)
  println(text.take(500))

}
