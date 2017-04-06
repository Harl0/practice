package practice

import models.Employee

/**
  * Created by jason on 06/04/17.
  */
object Copy extends App {

  val fred = Employee("Fred", "Telford", "Salesman")
  val joe = fred.copy(name="Joe")

println(fred, joe)
}


