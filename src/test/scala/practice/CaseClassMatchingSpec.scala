package practice

import base.UnitSpec
import Constants._

/**
  * Created by jason on 26/04/17.
  */
class CaseClassMatchingSpec extends UnitSpec {

  "CaseClassMatching" should {
    "return the matching person, Alice" in {
      CaseClassMatching.personMatch(Person(ALICE, 25)) shouldBe s"Hi $ALICE!"
    }
    "not match Jason" in {
      CaseClassMatching.personMatch(Person("Jason", 25)) shouldBe s"Hi Jason, sorry you are not allowed!"
    }
    "if matching Jason" in {
      CaseClassMatching.ifMatching(Person("Jason", 25)) shouldBe s"Hi Jason!"
    }
  }
}
