package com.Github.saule2022
class Vehicle(var color:String) {
  println("Constructing generic vehicle")
  def move():Unit = {
    println("Moving")}
  //more construction here
  println("Finished construction")
}
class Car(val wheels:Int = 4,
          color:String ) extends Vehicle(color:String) { //passing colour through extends
  def drive():Unit = {
    println("driving")
  }
}

class Student(var grade:Int,
              name:String,
              relation:String,
              topSpeed:Int) extends Person(name:String, relation:String, topSpeed:Int)

//creating a case class by inheriting from another case class gets slightly more complex
//as we have to override already set access categories in original case class
//turns we cant even directly inherit as a case class from another case class
class Teacher(school:String, override val name:String,override val relation:String, topSpeed:Int)
  extends Person(name:String, relation:String, topSpeed:Int) {
  println(s"Class in session! $name presiding at $school school") //so first the super constructor will be called
  //then we start our own sub contractor
  def teach():Unit ={
    println(s"Honorable $name teaching")
  }
}

object Day13Inheritance extends App {
  println("Inheritance")
  val vehicle = new Vehicle("gray")
  vehicle.move()
  println(vehicle.color) //getter is made for us here
  val myCar = new Car(6,"red")
  val myTruck=new Car(4,"Grey")
  myCar.move() // so I Inherited the ability to move from the com.github.ValRCS.com.Github.saule2022.Vehicle parent/super class
  myTruck.move()
  myCar.drive() //this is my own ability/method
  myTruck.drive()
  val myFlower=new Flower("rose","red")
  println(myFlower.color)
  println(myCar.wheels)
  println(myCar.color)
  println(myTruck.color)
  myCar.color = "yellow"
  println(myCar.color) //mutable because parent property color was mutable as well

  val maija = new Student(3,"Maija", "daughter", 250)
  println(maija)
  maija.increaseSpeed(200)
  println(maija)

  val newTeacher = new Teacher("Hanza","Lapins","acquaintance", 500)
  newTeacher.teach()
  println(newTeacher) //just like com.github.ValRCS.com.Github.saule2022.Student I still have access to pretty print since super class was in fact a case class

  //if we want to inherit from more than one class at once we will need to use traits instead for additional inheritance

}
