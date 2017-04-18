package katas

/**
  * Created by Jason on 04/04/2017.
  */
object FizzBuzz {

  def getResult(number: Int): String = (number % 3, number % 5) match {
    case (0, 0) => "fizzbuzz"
    case (0, _) => "fizz"
    case (_, 0) => "buzz"
    case _ => number.toString
  }

  def getResultIf(x: Int) = {
    if (x % 15 == 0)
      "FizzBuzz"
    else if (x % 3 == 0)
      "Fizz"
    else if (x % 5 == 0)
      "Buzz"
    else
      x
  }

}
