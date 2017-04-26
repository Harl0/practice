package katas

import base.UnitSpec
import models.UserModel
import practice.Constants._

/**
  * Created by jason on 26/04/17.
  */
class BasicPatternMatchingKataSpec extends UnitSpec {

  "BasicPatternMatching" should {
    "return welcome message for the user Jason" in {

      BasicPatternMatchingKata.userMatch(UserModel(JASON, 25)) shouldBe "Hi Jason!"

    }

    "return Hi for the user Tom" in {

      BasicPatternMatchingKata.userMatch(UserModel(TOM, 25)) shouldBe "Hi Tom!"

    }
    "return error message for not registered user" in {

      BasicPatternMatchingKata.userMatch(UserModel(AMY)) shouldBe "Amy is not registered."

    }
    "return error message for registered user" in {

      BasicPatternMatchingKata.userMatch(UserModel()) shouldBe "Jessica is not registered."

    }
  }

}
