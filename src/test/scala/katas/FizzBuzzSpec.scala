package katas

import base.UnitSpec

/**
  * Created by Jason on 04/04/2017.
  */
class FizzBuzzSpec extends UnitSpec {

  "FizzBuzz - getResult" should {
    "return fizz if the number is dividable by 3" in {
      FizzBuzz.getResult(3) should be("fizz")
      FizzBuzz.getResult(6) should be("fizz")
    }

    "return buzz if the number is dividable by 5" in {
      FizzBuzz.getResult(5) should be("buzz")
      FizzBuzz.getResult(10) should be("buzz")
    }

    "return fizzbuzz if the number is dividable by 15" in {
      FizzBuzz.getResult(15) should be("fizzbuzz")
      FizzBuzz.getResult(30) should be("fizzbuzz")
    }
    "return the same number if no other requirement is fulfilled" in {
      FizzBuzz.getResult(1) should be("1")
      FizzBuzz.getResult(2) should be("2")
      FizzBuzz.getResult(4) should be("4")
    }
  }

  "FizzBuzz - GetResultIf" should {
    "return Fizz if the number is dividable by 3" in {
      FizzBuzz.getResultIf(3) should be("Fizz")
    }

    "return Buzz if the number is dividable by 5" in {
      FizzBuzz.getResultIf(5) should be("Buzz")
    }

    "return FizzBuzz if the number is dividable by 15" in {
      FizzBuzz.getResultIf(15) should be("FizzBuzz")
    }
  }
}

