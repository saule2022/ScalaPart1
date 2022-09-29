package com.Github.saule2022

object Day4BooleanLogic extends App {
  println("Time for some Boolean Logic!")
  //it all goes back to George Boole a 19th century mathematician
  val isEvening = true
  println(s"It is evening $isEvening")
  val isMorning = !isEvening // called logical negation
  println(s"Is it morning? $isMorning")

  //so ! - exclam reverses whatever boolean value was there
  var myToggle = true // I had to make it var because I am going to be changing it
  println("My toggle is now", myToggle)
  myToggle = !myToggle //we evaluate the right side first then assign it to the left side
  println("My toggle is now", myToggle)
  myToggle = !myToggle
  println("My toggle is now", myToggle)
  myToggle = !myToggle
  println("My toggle is now", myToggle)

  val isTimeReal = isEvening && isMorning //&& stands for  logical conjunction
  println("Is time real?", isTimeReal)

  //so logical conjuction is true when both sides are true only then
  println(true && true) //only one that is going to be true
  println(true && false)
  println(false && true)
  println(false && false)

  println(2 * 2 == 4 && 2 * 4 == 8 && isEvening) //we can chaing multiple conjuctions whole expression will be true when ALL are true
  println(2 * 2 == 4 && 2 * 4 == 8 && isEvening) //we can chaing multiple conjuctions whole expression will be true when ALL are true

  println(false && 2 * 2 == 4 && 5 / 0 == 10) //Scala is lazily evaluated in logic meaning false will stop evaluation
  //this means that 5/0 was not run
  //this can be important if you are chaining multiple conditions where the next one is dependent on previous
  //so the order of checking conditions matters
  //  println(2*2==4 && 5/0 == 10 && false) //here we should get an ArithmeticException because of divide by 0

  println("Logical disjunction (or) with ||")
  //lastly we have logical disjuntion or logical or - using || symbol
  println(true || true) // true as long as at least one value is true
  println(true || false)
  println(false || true)
  println(false || false) //false when ALL values are false


  //again we have lazy evaluation and as soon as we get a true something Scala stops evaluating the expression
  println("Lots of statements only one true", false || 2 * 2 == 99 || 2 * 2 == 4 || 5 / 0 == 44) //only 2*2==4 is true and that is enough to stop the work and return true

  //  println("Lots of statements only one true", false || 2*2==99 ||  5/0==44 || 2*2==4) //now we will get exception because /0 is before true statement

  //exclusive or - XOR is logical expression which is true ONLY when one and only one side is true

  val myXOR = (!isEvening && isMorning) || (isEvening && !isMorning) //this will be true if only one is true but not both
  println("My XOR value", myXOR) //here true because only one of the values is true
}
