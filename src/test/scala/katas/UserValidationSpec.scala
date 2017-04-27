package katas

import base.UnitSpec
import models.UserModel
import practice.UserValidation
import utils.Constants._

/**
  * Created by jason on 26/04/17.
  */
class UserValidationSpec extends UnitSpec {

  "UserValidation#validateUser" should {
    "return welcome response for the user Jason" in {

      UserValidation.validateUser(UserModel(JASON, JASON_ID)) shouldBe "Hi Jason!"

    }

    "return welcome response for the user Tom" in {

      UserValidation.validateUser(UserModel(TOM, TOM_ID)) shouldBe "Hi Tom!"

    }

    "return error response for not registered user" in {

      // Note only the userName parameter is supplied to the UserModel constructor.
      // This implies the default `age` parameter is to be used.
      UserValidation.validateUser(UserModel(AMY)) shouldBe "Amy is not registered."

      // Note no parameters are supplied to the UserModel constructor.
      // This implies the default parameters are to be used.
      UserValidation.validateUser(UserModel()) shouldBe "Jessica is not registered."

    }
  }
}
