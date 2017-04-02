package practice

/**
  * Created by Jason on 02/04/2017.
  */
object If extends App {


  if (true)
    println("no braces on a single expression")

  if (1 + 1 == 2) {
    println("multiple")
    println("statements")
    println("require")
    println("braces")
  } else {
    println("new math is found!")
    println("or your CPU went crazy")
  }

  val likeEggs = false
  val breakfast = if (likeEggs) "scrambled eggs" else "Apple"
  print(breakfast)

}
