package practice

/**
  * Created by Jason on 02/04/2017.
  */
object Add extends App {

  // Method to add two numbers
  // Dont need curly braces as only performing single function
  // return type inferred
  def add(x: Int, y: Int) = x + y

  println(add(10, 20))
}
