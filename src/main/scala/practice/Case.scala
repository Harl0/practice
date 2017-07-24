package practice

/**
  * Created by Jason on 02/04/2017.
  */
object Case extends App{

  val selection = "One"
  selection match {

    case `selection` if selection == "One" => println(s"You chose option $selection!")
    case "Two" => println(s"You chose option $selection!")
    case _ => println(s"$selection isn't an option, sorry!")
  }

  def matching (input: String): String = input match {
      case "One" => s"You chose option $input!"
      case "Two" => s"You chose option $input!"
      case _ => s"$input isn't an option, sorry!"
  }

}
