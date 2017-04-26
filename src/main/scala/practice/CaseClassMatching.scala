package practice
import Constants._
/**
  * Created by jason on 26/04/17.
  */
object CaseClassMatching extends App {
  def personMatch(person: Person): String = {
    person match {
      case Person(ALICE, 25) => successMessage(person)
      case Person(BOB, 32) => s"Hi $BOB!"
//      case Person(name, age) => errorMessage(person)
      case _ => errorMessage(person)
    }
  }

  private def successMessage(person: Person): String ={
    s"Hi ${person.name}!"
  }

  private def errorMessage(person: Person): String ={
    s"Hi ${person.name}, sorry you are not allowed!"
  }



  def ifMatching(person: Person): Any ={
    if (person.name == "Jason")
      successMessage(person)
    else if (person.name == ALICE)
      successMessage(person)
  }
}
case class Person(name: String, age: Int)
