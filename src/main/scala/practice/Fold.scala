package practice

/**
  * Created by jason on 06/04/17.
  */
object Fold extends App {


  // Multiples a list of values
  // Takes two numbers each time, multiples together
  // Uses result as the next first number
  def product(list: List[Int]): Int = list.foldLeft(1)(_*_)

  println(product(List(1, 2, 3)))

  // Same functionality but without the need for a method
  List(1, 4, 3).foldLeft(1)(_*_)



}
