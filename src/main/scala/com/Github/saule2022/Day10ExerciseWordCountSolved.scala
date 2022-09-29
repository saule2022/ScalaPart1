package com.Github.saule2022

import scala.io.StdIn.readLine

object Day10ExerciseWordCountSolved extends App {
  val sentence = readLine("Please enter sentence. ")
  val words = sentence. split(" ") //we split by whitespace

  val wordLengths = words.map(words => words.length)
  val wordsMap = Map(words.mkString(", ") -> wordLengths.mkString(", "))
  println(wordLengths.mkString(","))
  println(wordsMap)
  println(wordsMap.size) //will be only one long right

  //with zip we can loop through two sequences at once
  val wordsLengthArray = for ((word, length) <- words zip wordLengths) yield word -> length //also (word,length) would work
  println("using zip")
  println(wordsLengthArray.mkString(","))
  println(wordsLengthArray.length)
  val realWordsLengthMap = wordsLengthArray.toMap //here any duplicate keys will be lost of course
  println(realWordsLengthMap)

  //so about counts words but we want characters
  val numbers=Array(1,2,3).map(_ * 2).filter(_ < 4).toSeq
  println(numbers)

  val nums = Array(1,2,3,4,5).filter(_ < 4).toSeq
  println(nums)

  val result = "hello world".replace("l","m")//.filter(_ != 'l')
  println(result)
  val word="hello world".split(" ")
  println(word.mkString(","))

  val result2 = for {
    c <- "hello, world"
    if c == 'l'
  } yield c.toUpper

  println(result2)


}
