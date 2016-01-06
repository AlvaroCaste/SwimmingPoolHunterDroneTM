package SwimmingPoolHunterDroneTM

import org.scalatest.{ShouldMatchers, FlatSpec}

class HunterTest extends FlatSpec with ShouldMatchers {

  "Residential area list" should "be empty when range is 0" in {
    Hunter.getAllResidentialAreaInARange(38.56889, 40.511107, 0) shouldBe List()
  }
}
