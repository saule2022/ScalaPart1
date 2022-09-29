package com.Github.saule2022

import scala.io.StdIn.readLine

object Christtree1 extends App {
  //TODO ask person's name
  //TODO ask for tree height
  //TODO print a xmas tree (or another tree) by calling printTree function with the correct parameters
  //tree height should be the one assigned
  //simple version for height 3 would be
  //  *
  // ***
  //*****
  val name = readLine("Please enter your name:\n")
  val Range = readLine("How many layers do you want in a tree?").toInt
  var number = -1
  var x = 1
  for (x <- 1 to Range) {
    number = number + 2
    println(" " * (Range - x) + "+" * number)
  }
}