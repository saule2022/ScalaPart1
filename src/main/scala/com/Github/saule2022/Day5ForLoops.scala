package com.Github.saule2022

object Day5ForLoops extends App {
  println("Some fun with for loop!")
  val myName = "Valdis"
  //for loop lets me go through a sequence of something one item at a time
  //here we have a string which is a sequence of characters
  for (c <- myName) println(s"Give me an $c!")
  //  println(s"Do we have a a $c? ") // so this c variable is gone once I finish looping
  //this leads to cleaner code


  //we use for loops when we know exact number of items to go through
  for (i <- 0 to 5) { //to includes last number
    println(s"i is now $i")
  }
  //  //i will be gone here not accessible
  //  //so code is cleaner
  //
  for (i <- 0 until 5) { //until does not include the last number
    println(s"i is now $i")
  }
  //  //we are reusing i again, but they are separate
  //
  //  //for loops are suitable for going through anything that can be considered a sequence such as strings
  //  val myName = "Valdis"
  //  for (c <- myName) { //c commonly corresponds to character but it is fine to use something longer
  //    println(s"Current letter is $c")
  //  }
  for (letter <- myName) {
    println(s"Current letter is $letter")
  }
  //
  //  //there is a convention ot use _ when value is not important
  //
  for (_ <- 0 until 5) { //alternative would be 1 to 5
    println("Doing something but I do not care about the number")
  }
  //
  //  //we will see more sequences when we go through more complex data types
  //
  //  //loop variables usually you want a bit short, since they stop their lives outside
  //
  //  myName.foreach(println) //we are saying for each individual member of myName print it
  //  for (myChar <- myName) println(myChar) //same as above
  //
  for (number <- 0 until 10) {
    if (number % 2 == 0) { //these brackets ar enot strictly necessary for a single statement
      println(s"$number is even!")
    } else {
      println(s"$number is odd...")
    }
  }
  //
  //  //so Range gives us numbers on demand in certain
  for (n <- Range(0, 10)) { //so this is like 0 until 10
    println(s"n is $n")
  }
  for (n <- Range.inclusive(0, 10)) { //so this is like 0 to 10
    println(s"n is $n")
  }
  //
  //we can also add a step to range
  for (n <- Range(0, 10, 2)) { //so step is 2 here
    println(s"n is $n")
  }
  //
  //  //so with to 10 will be included
  for (n <- 0 to 10 by 2) {
    println(s"n is $n")
  }
  //  //if we did not want 10 we would have used until
  //  for (n <- 0 until 10 by 2) {
  //    println(s"n is $n")
  //  }
  //
  //we can go the other way as well with negative step here it is -4
  for (n <- 20 to 0 by -4) {
    println(s"n is $n")
  }
  //
  //  //again if we used range it would be just like using until (and by)
  //  for (n <- Range(20,0, -4)) {
  //    println(s"n is $n")
  //  }
  //
  //  //how about partial steps
  //  //so double sized steps would not be suitable for loop we could use a while loop
  //
  //  {
  //    //i do not want others using my n so I put it inside brackets scope
  //    var n = 0.0
  //    while (n <= 10) {
  //      println(s"n is $n")
  //      n += 0.5
  //    }
  //  }

  var oddNumberSum = 0
  var evenNumberSum = 0
  for (n <- 0 to 50) {
    println(s"$n divided by 2 = ${n / 2} reminder is ${n % 2}")
    if (n % 2 == 0) {
      evenNumberSum += n
    } else { //so odd here
      oddNumberSum += n
    }
  }
  println(s"All even numbers from 0 to 50 (included) sum up to $evenNumberSum")
  println(s"All odd numbers from 0 to 50 (included) sum up to $oddNumberSum")

}
