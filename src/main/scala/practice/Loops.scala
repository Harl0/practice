package practice

/**
  * Created by Jason on 02/04/2017.
  */
object Loops extends App{


  // While Loop
  var i, sum = 0
  while ( i < 10 ) {
    sum += i
    i+=1
  }

  println(sum)

  // For Loop
  var sum1 = 0
  for ( i <- 0 until 10) {
    sum1 += 1
  }
  println(sum1)
}
