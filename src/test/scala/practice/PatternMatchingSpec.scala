package practice

import base.UnitSpec

/**
  * Created by Jason on 18/04/2017.
  */
class PatternMatchingSpec extends UnitSpec {

  "PatternMatching" should {
    "return three when 3 is matched" in{
      PatternMatching.matchNumber(3) should be ("three")
    }
    "return one when 1 is matched" in {
      PatternMatching.matchNumber(1) should be ("one")
    }
    "return two when 2 is matched" in {
      PatternMatching.matchNumber(2) should be ("two")
    }
    "return 5 when 5 is matched" in {
      PatternMatching.matchNumber(5) should be ("5")
    }
  }

}
