package com.Github.saule2022

object Day15MatchingExercise extends App {
  def getDay(day: Int): String = {
    day match {
      case 1 => "Monday"
      case 2 => "Tuesday"
      case 3 => "Wednesday"
      case 4 => "Thursday"
      case 5 => "Friday"
      case 6 => "Saturday !"
      case 7 => "Sunday !"
      case whoa => "No such Day!: "
    }
  }

  def getDayType(day: String): String = {
    day match {
      case "Monday" | "Tuesday" | "Wednesday" | "Thursday" | "Friday" => "WorkDay !"
      case "Saturday" | "Sunday" => "Weekend !"
    }
  }

  println(getDayType("Monday"))
  println(getDay(4))
}
