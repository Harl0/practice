package katas

import models.UserModel
import utils.Constants._

/**
  * Created by jason on 26/04/17.
  */
object BasicPatternMatchingKata {

  def userMatch(user: UserModel): Any = {
    user match {
      case UserModel(JASON, 25) => successResponse(user)
      case UserModel(TOM, 25) => successResponse(user)
      case _ => errorMessage(user)
    }
  }

  private def successResponse(user: UserModel): String = s"Hi ${user.userName}!"

  private def errorMessage(user: UserModel): String = s"${user.userName} is not registered."

}