package SwimmingPoolHunterDroneTM

import SwimmingPoolHunterDroneTM.Hunter.Direction
import org.scalatest.{ShouldMatchers, FlatSpec}

class HunterTest extends FlatSpec with ShouldMatchers {

  private val coordXId13: Double = 38.56889
  private val coordYId13: Double = 40.511107

  "Residential area list" should "be empty when range is 0" in {
    Hunter.getAllResidentialAreaInARange(coordXId13, coordYId13, 0) shouldBe Set()
  }

  it should "have 7, 8, 9, 12, 14, 17, 18 ids when coords are 38.56889, 40.511107 and range is 1" in {
    Hunter.getAllResidentialAreaInARange(coordXId13, coordYId13, 1) shouldBe
    Set(7, 8, 9, 12, 14, 17, 18, 19)
  }

  it should "have 1, 2, 3, 8, 13, 12, 11, 6 ids when coords are 28.56889, 45.511107 and range is 1" in {
    Hunter.getAllResidentialAreaInARange(28.56889, 45.511107, 1) shouldBe
    Set(1, 2, 3, 8, 13, 12, 11, 6)
  }

  it should "have 1, 2, 3, 4, 5, 10, 15, 20, 25, 24, 23, 22, 21, 16, 11, 6 ids when coords are" +
    "28.56889, 45.511107 and range is 2" in {
    Hunter.getAllResidentialAreaInARange(coordXId13, coordYId13, 2) shouldBe
    Set(1, 2, 3, 4, 5, 10, 15, 20, 25, 24, 23, 22, 21, 16, 11, 6)
  }

  "Adjacents of 13" should "be 8, 14, 18, 12 when range is 1" in {
    val originId = 13
    Hunter.getAdjacentByRange(originId, Direction.UP, 1) shouldBe 8
    Hunter.getAdjacentByRange(originId, Direction.DOWN, 1) shouldBe 18
    Hunter.getAdjacentByRange(originId, Direction.LEFT, 1) shouldBe 12
    Hunter.getAdjacentByRange(originId, Direction.RIGHT, 1) shouldBe 14
  }

  "Adjacents of 13" should "be 3, 23, 11, 15 when range is 2" in {
    val originId = 13
    Hunter.getAdjacentByRange(originId, Direction.UP, 2) shouldBe 3
    Hunter.getAdjacentByRange(originId, Direction.DOWN, 2) shouldBe 23
    Hunter.getAdjacentByRange(originId, Direction.LEFT, 2) shouldBe 11
    Hunter.getAdjacentByRange(originId, Direction.RIGHT, 2) shouldBe 15
  }
}
