package SwimmingPoolHunterDroneTM

import org.scalatest.{ShouldMatchers, FlatSpec}

class HunterTest extends FlatSpec with ShouldMatchers {

  "Residential area list" should "be empty when range is 0" in {
    Hunter.getAllResidentialAreaInARange(38.56889, 40.511107, 0) shouldBe Set()
  }

  it should "have 7, 8, 9, 12, 14, 17, 18 ids when coords are 38.56889, 40.511107 and range is 1" in {
    Hunter.getAllResidentialAreaInARange(38.56889, 40.511107, 1) shouldBe
    Set(7, 8, 9, 12, 14, 17, 18, 19)
  }

  it should "have 1, 2, 3, 8, 13, 12, 11, 6 ids when coords are 28.56889, 45.511107 and range is 1" in {
    Hunter.getAllResidentialAreaInARange(28.56889, 45.511107, 1) shouldBe
    Set(1, 2, 3, 8, 13, 12, 11, 6)
  }
}
