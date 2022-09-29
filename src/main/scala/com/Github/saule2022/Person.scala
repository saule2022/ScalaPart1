package com.Github.saule2022

case class Person(name: String,
                  relation: String,
                  var topSpeed: Int) {
  println("person creation started!")

  def increaseSpeed(delta: Int): Int = {
    topSpeed += delta
    topSpeed
  }

  println(s"Person has been created with name $name")
}
