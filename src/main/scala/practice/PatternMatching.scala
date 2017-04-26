package practice

/**
  * Created by Jason on 18/04/2017.
  */
object PatternMatching extends App {

  def matchNumber(number: Int): String = {
    number match {
      case 1 => "one"
      case 2 => "two"
      case 3 => "three"
      case _ => number.toString

    }
  }



}
