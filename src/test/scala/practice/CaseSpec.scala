package practice

import base.UnitSpec

/**
  * Created by Jason on 02/04/2017.
  */
class CaseSpec extends UnitSpec {
  val ONE = "One"
  val TWO = "Two"
  val THREE = "Three"

  "matching" should {
    "successfully match One" in {
      Case.matching(ONE) shouldBe s"You chose option $ONE!"
    }
    "successfully match Two" in {
      Case.matching(TWO) shouldBe s"You chose option $TWO!"
    }
    "unsuccessfully match Three" in {
      Case.matching(THREE) shouldBe s"$THREE isn't an option, sorry!"
    }
  }

}
