package practice

/**
  * Created by Jason on 02/04/2017.
  */

object Filter extends App with Values {

  //filter - keep only items larger than 4
  private val moreThan4 = numbers.filter(_ > 4)

  println(moreThan4)

}
