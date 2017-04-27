package models

import utils.Constants.{DEFAULT_ID, DEFAULT_USER}

/**
  * Created by jason on 26/04/17.
  */

/**
  * @param userName
  * @param ID
  *         Model to give structure to our users
  *         Default constructor parameters provided to show you could create a UserModel without supplying parameters
  */
case class UserModel (userName: String = DEFAULT_USER, ID: Int = DEFAULT_ID)