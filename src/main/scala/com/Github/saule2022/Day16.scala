package com.Github.saule2022

object Day16 extends App {
  println("Testing importing from packages")

  val anotherLaptop = Laptop("liga's laptop", 2.8, "Dell")
  //if you need to use different Laptop definition from different packages
  //then you can use them explicitly with full path
  val alsoLaptop = com.Github.saule2022.Laptop("friends", 3.3, "Asus") //if we did not import it we need full name
  println(anotherLaptop)
}
