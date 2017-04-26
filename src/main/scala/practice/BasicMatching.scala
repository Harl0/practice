package practice
import Constants._
import practice.CaseClassMatching.successMessage
/**
  * Created by jason on 26/04/17.
  */
object BasicMatching extends App {
//Matches username (String)
def matchUser(user: User) = {
//  if (user == "Jason")
//  "Hi Jason"
  user match {
    case User(JASON, 26) => successMessage(user)
    case User(AMY, 22) => successMessage(user)
  }
}

  def eitherMatching(user: User): Either[String, String] = {
    user match {
      case User(AMY, 25) => Right(successMessage(user))
      case _ => Left("User unknown")
    }
  }

 private def successMessage(user: User): String = {
    s"Hi ${user.userName}"
  }

}

case class User(userName: String, age: Int)
