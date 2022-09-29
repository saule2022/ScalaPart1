package com.Github.saule2022
//
//class Animal (val name:String,
//              val animalType:String,
//              val likes:String,
//              val sound:String,
//              val contact:String="Hunting",
//              val age:Int=1) {
//
//  def makeSound {
//    println(s"I'm a $animalType and I go $sound") }
//
//  def meet (contact:String): Unit = {
//    if (contact == likes) println(s"Hi! $name likes you")
//    else println(s" I like $contact. No, thanks, I dont $contact, gotta go!!!!")
//  }
//}
//
//object Classes2 extends App {
//  val animal1 = new Animal("Carry", "Fox","Hunting","Hees")
//  animal1.makeSound
//  animal1.meet("Hunting")
//
//  val animal2 = new Animal ("Charlotte","Cat","Sleeping","Meow" )
//  animal2.makeSound
//  animal2.meet("Hunting")
//
//  val animal3 = new Animal("Miranda","Dog","Walking","Woof","Walking" )
//  animal3.makeSound
// animal3.meet("Walking")
//
//  val animal4 = new Animal("Samantha","Leopard","Sunbathing","Shhh","Sunbathing" )
//  animal4.makeSound
//  animal4.meet("Walking")
//
//import scala.collection.mutable
//
//class Animal2 (val name:String,
//               val animalType:String,
//               var likes:scala.collection.mutable.Set[String],
//               // a set of likes, which may change with age
//               val sound:String,
//               var age:Int) {     // age changes with time
//
//  def makeSound(sound:String): Unit = {
//    println(sound)
//  }
//
//  def meet(contact:String): Unit = {
//    if (likes(contact)) {
//      println("Hello there, I like that \u263a \n")
//    }
//    else println("Nope. Byeeeee.\n")
//  }
//
//  def addLike(newLike:String, likes:scala.collection.mutable.Set[String]): mutable.Set[String] = {
//    likes += newLike
//    likes
//  }
//
//}
//
//object Day12classes2 extends App{
//
//  val myCat = new Animal2 ("Autumn", "cat", mutable.HashSet("pets", "food", "snacks", "cuddles"), "meow", 12)
//  val brothersDog = new Animal2 ("Mūza", "dog", mutable.HashSet("food", "walks", "play"), "woof", 4)
//  val streetCat = new Animal2 ("Lialia", "cat", mutable.HashSet("attention", "pets"), "keke", 16)
//
//  println("The animals have gathered:")
//  myCat.makeSound(myCat.sound)
//  brothersDog.makeSound(brothersDog.sound)
//  streetCat.makeSound(streetCat.sound)
//
//  var contact = "pets"
//  println(s"I will give $contact to myCat:")
//  myCat.meet(contact)
//  println(s"I will give $contact to brothersDog:")
//  brothersDog.meet(contact)
//  println(s"I will give $contact to streetCat:")
//  streetCat.meet(contact)
//
//  contact = "food"
//  println(s"I will give $contact to myCat:")
//  myCat.meet(contact)
//  println(s"I will give $contact to brothersDog:")
//  brothersDog.meet(contact)
//  println(s"I will give $contact to streetCat:")
//  streetCat.meet(contact)
//
//  contact = "sleep"
//  println(s"I will give $contact to myCat:")
//  myCat.meet(contact)
//
//  myCat.addLike("sleep", myCat.likes)
//  contact = "sleep"
//  println(s"I will give $contact to myCat:")
//  myCat.meet(contact)
//
//}