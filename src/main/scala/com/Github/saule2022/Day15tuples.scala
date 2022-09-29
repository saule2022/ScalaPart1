package com.Github.saule2022

object Day15tuples extends App {
  println("Making tuples !")
  // regular parenthesis !!!
  //tuples are used to pass along heterogenous values-different type
  //sequences used for homogeneous values-same data type
  //https://docs.scala-lang.org/tour/tuples.html
  val myTuple = ("Valdis", 180, 3.14, "Rtu")
  println(myTuple)
  //individual values have a funky index
  println(myTuple._1) //for accessing values inside tuples
  //tuples are used as alternative way to case classes
  println(myTuple._3)
  //tuples go up to 22, if you need to store more than 22 items,
  // then we need different type-Map, Set, Seq..

  //Unpacking tuples
  val (name, height, pi, university) = myTuple
  println(name)
  println(height)
  println(pi)
  println(university)

  //how about looping
  //https://stackoverflow.com/questions/44701879/how-to-loop-through-tuple-in-scala
  //Tuples can be iterated over (see productIterator)
  //but it is a bad idea. You loose type safety because all the elements
  // become type Any.
  //If you find yourself needing to "loop" over a tuple,
  // then probably you should consider other data structure, like a sequence
  //  Lists and maps are collections. Tuples are not.
  //  Iterating (aka "looping through") really only makes sense for collections which tuples aren't.
  //Tuples are product types. They are a way of grouping multiple values
  // of different types together into a single structure.
  // Considering that the fields of a tuple may have different types,
  // how exactly would you iterate over it? What would be the type of your element variable?
  //If you are familiar with other languages, you may be familiar with the concept
  // of records (e.g. RECORD in Pascal or struct in C). Tuples are kind of like them,
  // except the fields don't have names. How do you iterate over a record in Pascal or
  // a struct in C? You don't, it makes no sense.
  //In fact, you can think of an object as a record. Again, how do you iterate over
  // the fields of an object? You don't, it makes no sense.
  //for (it <- myTuple) {
  //  println(it)
  //val myArray=List(myTuple)
  //println(myArray)//https://stackoverflow.com/questions/54701769/convert-tuple-to-array-in-scala


  val myArray = myTuple.productIterator.toArray
  //we could cast each member to string
  for (it <- myArray) println(it)
  //we could cast each member to string
  val stringArray = myArray.map(_.toString)
  for (it <- stringArray) println(it)

  //Users may sometimes find it hard to choose between tuples and case classes.
  // Case classes have named elements. The names can improve the readability of some kinds of code


}
