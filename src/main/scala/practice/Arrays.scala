package practice

/**
  * Created by Jason on 02/04/2017.
  */
object Arrays extends App {

  def printArray[K](array: Array[K]) = array.mkString("Array(", ", ", ")")

  //Mutable array of type Array[Int]
  val array1 = Array(1, 2, 3)
  printArray(array1)

  //Mutable array of type Array[Any]
  val array2 = Array("a", 2, true)
  printArray(array2)

  //Mutable array of type Array[String]
  val array3 = Array("a", "b", "c")
  printArray(array3)

  //Access items using (index) not [index]
  val itemAtIndex0 = array3(0)

  //Concatenation using the ++ operator,
  //Prepending items using +: and appending using :+
  val concatenated = "prepend" +: (array1 ++ array2) :+ "append"

  //Finding an index of an item
  array3.indexOf("b")


  //Find (stops when item is found)
  val personArray = Array(("Alice", 1), ("Bob", 2), ("Carol", 3))

  def findByName(name: String): (String, Int) = {
    personArray.find(_._1 == name)
      .getOrElse(("David", 4))
  }

  val findBob = findByName("Bob")
  println(findBob)

  val findEli = findByName("Eli")
  println(findEli)

  val bobFound = findBob._2
  println(bobFound)
}
