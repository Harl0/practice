package practice

/**
  * Created by jason on 21/07/17.
  */
object RegEx extends App {

  val regex = "[0-9]".r

  val newAddress = regex.replaceAllIn("123 Main Street", "x")
  println(newAddress)

  val joey = "\"\"".r
  val newValue = joey.replaceAllIn("test", "")
  println(newValue)
}
