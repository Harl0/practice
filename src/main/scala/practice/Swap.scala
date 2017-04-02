package practice

/**
  * Created by Jason on 02/04/2017.
  */
object Swap extends App{

  def swap(x: String, y: String) = (y, x)

  val (a, b) = swap("hello", "world")

  println(a, b)

}
